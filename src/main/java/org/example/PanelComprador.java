package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Comprador c;
    public PanelComprador(Comprador c) {
        this.c = c;
        this.add(new JLabel("Saldo: $"+c.cuantoVuelto())); // No sé como hacer que esto se vea en pantalla desde PanelPrincipal
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }
}
