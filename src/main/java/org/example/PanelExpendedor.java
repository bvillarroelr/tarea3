package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor(){
        this.setBackground(Color.white);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(100,100,100,200);
    }
}
