package com.github.electroluxv2.laboratory.l11.exercise1.service;

import com.github.electroluxv2.laboratory.l11.exercise1.panel.CelsiusPanel;
import com.github.electroluxv2.laboratory.l11.exercise1.panel.FahrenheitPanel;
import com.github.electroluxv2.laboratory.l11.exercise1.pattern.Mediator;

import javax.swing.*;
import java.awt.*;

public class Converter {
    private static final JFrame mainFrame = new JFrame();
    private static final JPanel panel = new JPanel();

    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;

    private static int SCREEN_HEIGHT;
    private static int SCREEN_WIDTH;

    private final Mediator mediator = new Mediator();

    public Converter() {

    }

    {
        resolveScreenSize();
        initializeFrame();
        initializePanel();

    }

    private void initializePanel() {
        panel.setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5,5,5,5);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;

        final CelsiusPanel celsiusPanel = new CelsiusPanel(mediator);
        panel.add(celsiusPanel, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;

        final FahrenheitPanel fahrenheitPanel = new FahrenheitPanel(mediator);
        panel.add(fahrenheitPanel, gridBagConstraints);

        mediator.register(celsiusPanel);
        mediator.register(fahrenheitPanel);
    }

    private void initializeFrame() {
        mainFrame.setTitle("Converter");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    private void resolveScreenSize() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        SCREEN_WIDTH = screenSize.width;
        SCREEN_HEIGHT = screenSize.height;
    }
}
