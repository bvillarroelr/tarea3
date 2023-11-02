package org.example;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ventana extends JFrame {
    private PanelPrincipal mp;
    public Ventana() {
        this.setLayout(new BorderLayout());
        mp = new PanelPrincipal();
        this.add(mp,BorderLayout.CENTER);
        this.setTitle("Mi Ventana");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}