package org.example;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    private JFrame frame;
    public PanelPrincipal () {
        this.setSize(800,600);
        this.setBackground(Color.ORANGE);
        exp = new PanelExpendedor();
        com = new PanelComprador();

    }
    public void paint (Graphics g) {
        com.paint(g);
        exp.paint(g);
    }
}