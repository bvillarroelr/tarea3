package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private Comprador c;
    public PanelComprador(Comprador c) {
        this.c = c; // No sé como hacer que esto se vea en pantalla desde PanelPrincipal

        setLayout(new BorderLayout());

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 2));

        rightPanel.add(new JLabel(" Saldo: $"+c.cuantoVuelto())); // Aqui podemos agregar las opciones de monedas
        rightPanel.add(midrightPanel);
        midrightPanel.add(new JButton("COCACOLA"));
        midrightPanel.add(new JButton("FANTA"));
        midrightPanel.add(new JButton("SPRITE"));
        midrightPanel.add(new JButton("SUPER8"));
        midrightPanel.add(new JButton("SNICKERS"));
        midrightPanel.add(new JButton("VUELTO"));
        add(rightPanel, BorderLayout.EAST);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }
}
