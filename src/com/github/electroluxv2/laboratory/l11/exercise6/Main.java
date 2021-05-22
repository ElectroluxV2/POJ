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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static final JFrame frame = new JFrame("Exercise 6");
    static final JLabel bottomLabel = new JLabel("Select text file to calculate results. File > Open", SwingConstants.CENTER);
    static final JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    static JPanel fileContentPanel = new JPanel();
    static final Pattern simpleMathPattern = Pattern.compile("(\\+|\\*|-|/|[0-9]|\\s)*");
    static final String ERROR_MSG = "ERROR";
    static final String GOOD_MSG = "WELL FORMATTED";


    public static void setUpFrame() {
        // Main panel
        final JPanel panel = new JPanel(new BorderLayout());

        // Scroll pane with dynamic labels
        fileContentPanel.setLayout(new BoxLayout(fileContentPanel, BoxLayout.PAGE_AXIS));
        final JScrollPane scrollPane = new JScrollPane(fileContentPanel);

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
            fileContentPanel.removeAll();

            // Make label of every line in file
            final List<String> contents = Files.lines(file.toPath()).toList();
            for (int i = 0; i < contents.size(); i++) {
                final String line = contents.get(i);

                // Validate
                final Matcher matcher = simpleMathPattern.matcher(line);

                final String wellFormatted = matcher.matches() ? GOOD_MSG : ERROR_MSG;

                // String pool
                final String result = wellFormatted == ERROR_MSG ? ERROR_MSG : String.valueOf(calculate(line));

                final JLabel label = new JLabel("L%d: %s = %s (%s)".formatted(i, line, result, wellFormatted));
                System.out.println(line);
                fileContentPanel.add(label);
            }

            // Show new labels in scroll pane
            fileContentPanel.revalidate();
            fileContentPanel.repaint();

        } catch (IOException e) {
            bottomLabel.setText("An error occurred during file read: %s".formatted(e.getMessage()));
        }
    }


    public static String addSpacesBetweenTokens(final String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '/' || c == '*') {
                result.append(' ');
                result.append(c);
                result.append(' ');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static double calculate(final String input) {
        final String withSpaces = addSpacesBetweenTokens(input);
        final Scanner scanner = new Scanner(withSpaces);

        char lastToken = '+';
        double result = 0;

        while (scanner.hasNext()) {
            // Here I can add support for floating types and other math expressions
            if (scanner.hasNextInt()) {
                final int number = scanner.nextInt();
                result = doMath(result, number, lastToken);
            } else {
                lastToken = scanner.next().charAt(0);
            }
        }

        return result;
    }

    public static double doMath(final double a, final double b, final char operator) throws IllegalArgumentException {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/', ':' -> a / b; // Division by 0 returns infinity not Exception
            default -> throw new IllegalArgumentException("Wrong operator given: %s".formatted(operator));
        };
    }

    public static void main(final String[] args) {
        setUpFrame();
    }
}
