package com.github.electroluxv2.laboratory.l11.exercise5;

import com.github.electroluxv2.laboratory.l11.exercise2.Game;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(final String[] args) {
        final JFrame frame = new JFrame();
        frame.setTitle("What day is it?");
        frame.setLocation(0, 0);

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        final JLabel label = new JLabel("yyyy/MM/dd");
        panel.add(label, Game.makeConstraints(0,0,1));

        final JTextField textField = new JTextField("2020/12/24", 7);

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.ENGLISH);
        textField.addActionListener(e -> {
            try {
                final LocalDate date = LocalDate.parse(e.getActionCommand(), formatter);
                JOptionPane.showMessageDialog(null, date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH), "%s is".formatted(e.getActionCommand()), JOptionPane.INFORMATION_MESSAGE);
            } catch (final DateTimeParseException parseException) {
                JOptionPane.showMessageDialog(null, parseException.getMessage(), "INVALID VALUE", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(textField, Game.makeConstraints(1,0,1));

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
