package com.github.electroluxv2.laboratory.l11.exercise1.listeners;

import com.github.electroluxv2.laboratory.l11.exercise1.pattern.Mediator;
import com.github.electroluxv2.laboratory.l11.exercise1.service.CalculateService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitTextFieldActionListener implements ActionListener {
    private final Mediator mediator;

    public FahrenheitTextFieldActionListener(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final String value = e.getActionCommand();
        try {
            final double parsed = Double.parseDouble(value);
            final double result = new CalculateService().convertFtoC(parsed);
            mediator.setCelsiusValue(result);

        } catch (final NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, numberFormatException.getMessage(), "INVALID C VALUE", JOptionPane.ERROR_MESSAGE);
        }
    }
}
