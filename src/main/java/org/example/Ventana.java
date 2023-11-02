package org.example;


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Ventana extends JFrame {

    public Ventana() {
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal(),BorderLayout.CENTER);
        setTitle("Mi Ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        PanelPrincipal Principal = new PanelPrincipal();
    }
}