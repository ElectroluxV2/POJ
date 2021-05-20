package com.github.electroluxv2.laboratory.l11.exercise1.pattern;

import com.github.electroluxv2.laboratory.l11.exercise1.panel.CelsiusPanel;
import com.github.electroluxv2.laboratory.l11.exercise1.panel.FahrenheitPanel;

public class Mediator {
    private CelsiusPanel celsiusPanel;
    private FahrenheitPanel fahrenheitPanel;

    public void register(final CelsiusPanel celsiusPanel) {
        this.celsiusPanel = celsiusPanel;
    }

    public void register(final FahrenheitPanel fahrenheitPanel) {
        this.fahrenheitPanel = fahrenheitPanel;
    }

    public void setCelsiusValue(final double value) {
        this.celsiusPanel.setValue(value);
    }

    public void setFahrenheitPanel(final double value) {
        this.fahrenheitPanel.setValue(value);
    }
}
