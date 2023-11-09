package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel implements ActionListener {
    private Comprador c = new Comprador();
    private Moneda m;
    private JButton coca, fanta, sprite, super8, snickers, agregarMoneda;
    public PanelComprador() {
        this.m = new Moneda1000(); // Por defecto es una moneda de 1000
        setLayout(new BorderLayout());

        coca = new JButton("CocaCola");
        fanta = new JButton("Fanta");
        sprite = new JButton("Sprite");
        super8 = new JButton("Super 8");
        snickers = new JButton("Snickers");
        agregarMoneda = new JButton("Agregar monedas");

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 2));

        rightPanel.add(new JLabel(" Saldo: $" + m.getValor())); // Aqui podemos agregar las opciones de monedas
        rightPanel.add(midrightPanel);

        midrightPanel.add(coca);
        coca.addActionListener(this);
        midrightPanel.add(super8);
        super8.addActionListener(this);
        midrightPanel.add(fanta);
        fanta.addActionListener(this);
        midrightPanel.add(snickers);
        snickers.addActionListener(this);
        midrightPanel.add(sprite);
        sprite.addActionListener(this);
        midrightPanel.add(agregarMoneda);
        agregarMoneda.addActionListener(this);

        add(rightPanel, BorderLayout.EAST);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Con este esqueleto podemos comenzar a trabajar en qué acción efectuará cada botón. Rellené con casos ejemplo solamente. Conectar lógica del resto del código
        if(e.getSource() == coca) {
            System.out.println("Compraste una Coca");
            // Aca tocaria usar el metodo pero nose como poner el parametro del expendedor
       //     c.Comprar(m,Detalles.COCA,);
        }
        if(e.getSource() == fanta) {
            System.out.println("Compraste una Fanta");
        }
        if(e.getSource() == sprite) {
            System.out.println("Compraste una Sprite");
        }
        if(e.getSource() == super8) {
            System.out.println("Compraste un Super 8");
        }
        if(e.getSource() == snickers) {
            System.out.println("Compraste un Snickers");
        }
    }
}
