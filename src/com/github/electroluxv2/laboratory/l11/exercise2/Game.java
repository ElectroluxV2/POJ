package com.github.electroluxv2.laboratory.l11.exercise2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadLocalRandom;

public enum Game {
    Instance;
    private final JTextField userGuess = new JTextField();
    private final JTextField computerGuess = new JPasswordField();
    private final JLabel resultLabel = new JLabel();

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    private static final int BOUND_MIN = 1;
    private static final int BOUND_MAX = 49;

    Game() {
        final JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Converter");
        mainFrame.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        mainFrame.setLocation(screenSize.width / 2 - Game.WINDOW_WIDTH / 2, screenSize.height / 2 - Game.WINDOW_HEIGHT / 2);

        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        final JLabel userLabel = new JLabel();
        userLabel.setText("Your guess: ");
        mainPanel.add(userLabel, Game.makeConstraints(0, 0, 1));

        this.userGuess.setColumns(3);
        this.userGuess.addActionListener(this::onUserInput);
        mainPanel.add(userGuess, Game.makeConstraints(1, 0, 1));

        final JLabel computerLabel = new JLabel();
        computerLabel.setText("Computer guess: ");
        mainPanel.add(computerLabel, Game.makeConstraints(0, 1, 1));

        this.computerGuess.setColumns(3);
        this.computerGuess.setEnabled(false);
        final int randed = ThreadLocalRandom.current().nextInt(Game.BOUND_MIN, Game.BOUND_MAX);
        this.computerGuess.setText(String.valueOf(randed));
        System.out.println(randed);
        mainPanel.add(computerGuess, Game.makeConstraints(1, 1, 1));

        this.resultLabel.setText("You won!");
        this.resultLabel.setVisible(false);
        this.resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(this.resultLabel, Game.makeConstraints(0, 2, 2));

        mainFrame.getContentPane().add(mainPanel);
        mainFrame.setVisible(true);
    }

    private void onUserInput(final ActionEvent event) {
        final String userInput = event.getActionCommand();
        try {
            Integer.parseInt(userInput);

            final int compareResult = userInput.compareTo(this.computerGuess.getText());
            if (compareResult == 0) {
                this.resultLabel.setVisible(true);
                this.userGuess.setEnabled(false);
            } else if (compareResult > 0) {
                JOptionPane.showMessageDialog(null, "Lower", "WRONG", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Higher", "WRONG", JOptionPane.ERROR_MESSAGE);
            }
        } catch (final NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, numberFormatException.getMessage(), "INVALID VALUE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static GridBagConstraints makeConstraints(final int x, final int y, final int width) {
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5,5,5,5);

        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.gridwidth = width;
        gridBagConstraints.gridheight = 1;

        return gridBagConstraints;
    }
}
