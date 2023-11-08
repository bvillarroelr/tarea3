package org.example;


import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal mp;
    public Ventana(Comprador c, Expendedor x) {

        mp = new PanelPrincipal(c,x);
        this.add(mp);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Maquina Expendedora");
        this.setSize(1000, 600);
        this.setVisible(true);
    }
}