package com.github.electroluxv2.laboratory.l11.exercise4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ImgLabel extends JLabel {
    public ImgLabel(final String root, final String item) throws IOException {
        super(new ImageIcon(ImageIO.read(new File(root, item))));
    }

    public ImgLabel changeVisible(final boolean visible) {
        this.setVisible(visible);
        return this;
    }
}
