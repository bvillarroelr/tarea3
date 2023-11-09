package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel implements ActionListener {
    private Comprador c;
    private PanelExpendedor pe;
    private Moneda m;
    private JButton coca, fanta, sprite, super8, snickers, agregarMoneda;
    public PanelComprador(Comprador c, PanelExpendedor pe) {
        this.m = new Moneda1000(); // Por defecto es una moneda de 1000
        setLayout(new BorderLayout());
        this.c = c;
        this.pe = pe;

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
            c.Comprar(m,Detalles.COCA,pe.getE());
            System.out.println("Compraste una Coca");
            pe.repaint();
        }
        else if(e.getSource() == fanta) {
            c.Comprar(m,Detalles.FANTA,pe.getE());
            System.out.println("Compraste una Fanta");
            pe.repaint();
        }
        else if(e.getSource() == sprite) {
            c.Comprar(m,Detalles.SPRITE,pe.getE());
            System.out.println("Compraste una Sprite");
            pe.repaint();
        }
        else if(e.getSource() == super8) {
            c.Comprar(m,Detalles.SUPER8,pe.getE());
            System.out.println("Compraste un Super 8");
            pe.repaint();
        }
        else if(e.getSource() == snickers) {
            c.Comprar(m,Detalles.SNICKER,pe.getE());
            System.out.println("Compraste un Snickers");
            pe.repaint();
        }
    }
}
