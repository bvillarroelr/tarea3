package org.example;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ventana extends JFrame {
    private PanelPrincipal mp;
    public Ventana() {
        mp = new PanelPrincipal();
        this.setLayout(new BorderLayout());
        this.add(mp,BorderLayout.CENTER);
        mp.add(new JButton("Comprar Coca-Cola"));
        mp.add(new JButton("Comprar Super8"));
        mp.add(new JButton("Comprar Fanta"));
        mp.add(new JButton("Comprar Snickers"));
        mp.add(new JButton("Comprar Sprite"));
        mp.add(new JButton("Retirar Vuelto"));
        this.setTitle("Mi Ventana");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}