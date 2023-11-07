package org.example;


import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal mp;
    private PanelBotones bp;
    public Ventana(Comprador c, Expendedor x) {
        this.setLayout(new BorderLayout());
        mp = new PanelPrincipal(c,x);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mp,BorderLayout.CENTER);
        bp = new PanelBotones();
        this.add(bp, BorderLayout.SOUTH);
        this.setTitle("Mi Ventana");
        this.setSize(800, 600);
        this.setVisible(true);
    }
}