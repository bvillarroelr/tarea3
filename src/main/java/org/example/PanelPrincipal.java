package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
public class PanelPrincipal extends JPanel { ;
    private PanelComprador com = new PanelComprador();
    private PanelExpendedor exp = new PanelExpendedor();
    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        this.add(com,BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
    }
    public void paint (Graphics g) {
        super.paint(g);
        exp.paint(g);

        // borré com.paint(g) porque mostraba 2 veces el JLabel de saldo
    }
}