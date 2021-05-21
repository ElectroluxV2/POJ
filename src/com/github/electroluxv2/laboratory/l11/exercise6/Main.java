package com.github.electroluxv2.laboratory.l11.exercise6;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    static final JFrame frame = new JFrame("Exercise 6");
    static final JLabel bottomLabel = new JLabel("Select text file to calculate results. File > Open", SwingConstants.CENTER);
    static final JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    static JPanel labelPanel = new JPanel();

    public static void setUpFrame() {
        // Main panel
        final JPanel panel = new JPanel(new BorderLayout());

        // Scroll pane with dynamic labels
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
        final JScrollPane scrollPane = new JScrollPane(labelPanel);

        // File chooser
        fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt", "text"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addActionListener(Main::onFileSelected);

        // Bottom Label
        bottomLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Menu
        final JMenuBar menuBar = new JMenuBar();
        final JMenu menu = new JMenu("File");
        final JMenuItem item = new JMenuItem("Open");
        item.addActionListener(Main::onMenuItemClick);
        menu.add(item);
        menuBar.add(menu);


        // Add Components
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottomLabel, BorderLayout.SOUTH);

        // Main frame
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(0, 0);
        frame.setSize(screenSize.width, screenSize.height);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setJMenuBar(menuBar);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public static void onMenuItemClick(final ActionEvent event) {
        // No need to check what item as there is only one item
        fileChooser.showOpenDialog(frame);
    }

    public static void onFileSelected(final ActionEvent event) {
        if (!event.getActionCommand().equals("ApproveSelection")) return;

        bottomLabel.setText("Now viewing: %s".formatted(fileChooser.getSelectedFile().getAbsolutePath()));
        readFileLineByLine(fileChooser.getSelectedFile());
    }

    public static void readFileLineByLine(final File file) {
        try {

            // Clear last result
            labelPanel.removeAll();

            // Make label of every line in file
            final List<String> contents = Files.lines(file.toPath()).toList();
            for (int i = 0; i < contents.size(); i++) {
                final String line = contents.get(i);
                final JLabel label = new JLabel("L%d: %s".formatted(i, line));
                System.out.println(line);
                labelPanel.add(label);
            }

            // Show new labels in scroll pane
            labelPanel.revalidate();
            labelPanel.repaint();

        } catch (IOException e) {
            bottomLabel.setText("An error occurred during file read: %s".formatted(e.getMessage()));
        }
    }

    public static void main(final String[] args) {
       setUpFrame();
    }
}
