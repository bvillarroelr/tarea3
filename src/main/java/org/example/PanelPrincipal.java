package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class PanelPrincipal extends JPanel { ;
    private Comprador c = new Comprador();
    private PanelExpendedor exp = new PanelExpendedor(3, this);   // De aquí se define la cantidad de producto, y por ende, cuantos se veran en el expendedor
    private PanelComprador com = new PanelComprador(c,exp);

    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
    }
    public void paint (Graphics g) {
        super.paint(g);
        exp.paint(g);

        // borré com.paint(g) porque mostraba 2 veces el JLabel de saldo
    }
}