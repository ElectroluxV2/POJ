package com.github.electroluxv2.laboratory.l11.exercise3;

import com.github.electroluxv2.laboratory.l11.exercise2.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Reversator {
    private final JFrame frame = new JFrame();
    private final JLabel output = new JLabel();

    public Reversator() {
        this.frame.setTitle("Reversator");
        this.frame.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        this.frame.setLocation(screenSize.width / 2 - Game.WINDOW_WIDTH / 2, screenSize.height / 2 - Game.WINDOW_HEIGHT / 2);

        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        final JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        final JTextField userInput = new JTextField();
        userInput.setColumns(20);
        userInput.addActionListener(this::onUserInput);
        panel.add(userInput, Game.makeConstraints(0,0, 1));
        panel.add(this.output, Game.makeConstraints(0, 1, 1));

        this.frame.getContentPane().add(panel);
        this.frame.setVisible(true);
    }

    private void onUserInput(final ActionEvent e) {
        final String userInput = e.getActionCommand();
        this.output.setText(new StringBuffer(userInput).reverse().toString());
    }
}
