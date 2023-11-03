package org.example;


import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal mp;
    public Ventana() {
        mp = new PanelPrincipal();
        this.setLayout(new BorderLayout());
        this.add(mp,BorderLayout.CENTER);
        this.add(new JButton("Comprar"),BorderLayout.SOUTH);
        this.setTitle("Mi Ventana");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}