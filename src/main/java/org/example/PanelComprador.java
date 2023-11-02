package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador() {
        ;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }
}
