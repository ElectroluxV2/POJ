package com.github.electroluxv2.laboratory.l11.exercise1.panel;

import com.github.electroluxv2.laboratory.l11.exercise1.listeners.FahrenheitTextFieldActionListener;
import com.github.electroluxv2.laboratory.l11.exercise1.pattern.Mediator;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FahrenheitPanel extends JPanel {
    private static final TitledBorder TITLED_BORDER = new TitledBorder("Fahrenheit");
    private static final JLabel LABEL = new JLabel("F");
    private static final JTextField TEXT_FIELD = new JTextField(5);
    private final Mediator mediator;

    public FahrenheitPanel(final Mediator mediator) {
        TEXT_FIELD.addActionListener(new FahrenheitTextFieldActionListener(mediator));
        initialize();
        this.mediator = mediator;
    }

    private void initialize() {
        TITLED_BORDER.setTitleColor(Color.BLUE);
        TITLED_BORDER.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.CYAN));

        setLayout(new GridBagLayout());
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5,5,5,5);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(LABEL, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(TEXT_FIELD, gridBagConstraints);

        setBorder(TITLED_BORDER);
    }

    public void setValue(double value) {
        TEXT_FIELD.setText("%.2f".formatted(value));
    }
}
