package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador(Comprador c) {
        setLayout(new BorderLayout());
        Component espacio = Box.createRigidArea(new Dimension(0, 10));

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(2, 3));

        rightPanel.add(new JLabel(" Saldo: $N/A")); // Aqui podemos agregar las opciones de monedas
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
