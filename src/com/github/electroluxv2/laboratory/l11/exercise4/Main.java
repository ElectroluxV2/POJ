package com.github.electroluxv2.laboratory.l11.exercise4;

import com.github.electroluxv2.laboratory.l11.exercise2.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final String ROOT = "src/com/github/electroluxv2/laboratory/l11/exercise4/flags";

    public Main() throws IOException {
        final Map<String, ImgLabel> flags = Map.of(
        "belgium", new ImgLabel(ROOT, "belgium.png"),
        "portugal", new ImgLabel(ROOT, "portugal.png"),
        "turkey", new ImgLabel(ROOT, "turkey.png"),
        "sweden", new ImgLabel(ROOT, "sweden.png"),
        "romania", new ImgLabel(ROOT, "romania.png")
        );

        final JFrame frame = new JFrame();

        frame.setTitle("Flags");

        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        frame.setLocation(0, 0);
        frame.setSize(screenSize.width, screenSize.height);

        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        final JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        Set<String> selected = new HashSet<>();
        AtomicInteger x = new AtomicInteger();

        flags.forEach((k, v) -> {
            panel.add(v.changeVisible(false), Game.makeConstraints(x.get(), 0, 1));

            final JCheckBox checkBox = new JCheckBox(k, false);
            checkBox.addItemListener(e -> {
                flags.get(k).setVisible(e.getStateChange() == ItemEvent.SELECTED);
                if (e.getStateChange() == ItemEvent.SELECTED) selected.add(k);
                else selected.remove(k);

                if (selected.size() >= 4) {
                    checkBox.setSelected(false);
                    selected.remove(k);
                }
            });
            panel.add(checkBox, Game.makeConstraints(x.getAndIncrement(), 1, 1));
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(final String[] args) throws IOException {
        new Main();
    }
}
