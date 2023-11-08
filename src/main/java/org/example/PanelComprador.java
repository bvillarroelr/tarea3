package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {
    private Comprador c = new Comprador();
    public PanelComprador() {
        setLayout(new BorderLayout());

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 2));

        rightPanel.add(new JLabel(" Saldo: $" + c.getSaldo())); // Aqui podemos agregar las opciones de monedas
        rightPanel.add(midrightPanel);


        JButton coca = new JButton("COCACOLA");
        JButton fan = new JButton("FANTA");
        JButton spr = new JButton("SPRITE");
        JButton s8 = new JButton("SUPER8");
        JButton sn = new JButton("SNICKERS");
        JButton vuel = new JButton("VUELTO");

        midrightPanel.add(coca);
        midrightPanel.add(fan);
        midrightPanel.add(spr);
        midrightPanel.add(s8);
        midrightPanel.add(sn);
        midrightPanel.add(vuel);
        add(rightPanel, BorderLayout.EAST);

        coca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
            }
        });

        fan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test2");
            }
        });
        spr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test3");
            }
        });
        s8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test4");
            }
        });
        sn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test5");
            }
        });
        vuel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test6");
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }
}
