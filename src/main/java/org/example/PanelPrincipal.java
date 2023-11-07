package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal () {
        this.setBackground(Color.yellow);
        exp = new PanelExpendedor();
        com = new PanelComprador();
    }
    public void paint (Graphics g) {
        super.paint(g);
        com.paint(g);
        exp.paint(g);
    }
}