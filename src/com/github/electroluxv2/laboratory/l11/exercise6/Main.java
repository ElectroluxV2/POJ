package com.github.electroluxv2.laboratory.l11.exercise6;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;

public class Main {
    public static void main(final String[] args) {
        final JFrame frame = new JFrame("Exercise 6");
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(0, 0);
        frame.setSize(screenSize.width, screenSize.height);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setBackground(Color.black);

        final JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        final JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setFileFilter(new FileNameExtensionFilter("text files", "txt", "text"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addActionListener(e -> {
            if (!e.getActionCommand().equals("ApproveSelection")) return;

            System.out.println(e.getActionCommand());
            System.out.println(fileChooser.getSelectedFile());
        });
        panel.add(fileChooser, BorderLayout.CENTER);

        final JLabel label = new JLabel("1");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.SOUTH);


        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
