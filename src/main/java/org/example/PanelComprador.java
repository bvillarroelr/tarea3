package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel implements ActionListener {
    private Comprador c;
    private PanelExpendedor pe;
    private Moneda m;
    private JButton coca, fanta, sprite, super8, snickers, retirarMonedas, retirarProducto;
    private JLabel DisplayedInfo, Saldo;
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

        retirarMonedas = new JButton();
        retirarProducto = new JButton();
        retirarMonedas.setVisible(true);   // los seteamos en false, pues nos interesa que se vean las animaciones de cuando aparecen las monedas y producto respectivamente
        retirarProducto.setVisible(true);
        retirarMonedas.setBounds(520,465,120,80);

        DisplayedInfo = new JLabel("Seleccione un Producto");
        Saldo = new JLabel("Saldo: Usando una moneda de " + m.getValor());

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 2));

        rightPanel.add(Saldo);
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
        midrightPanel.add(DisplayedInfo);

        add(rightPanel, BorderLayout.EAST);
    }
    public void setInfo(Moneda n){
        DisplayedInfo.setText("Vuelto" + n.getValor());
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
            DisplayedInfo.setText("Vuelto: " + c.Comprar(m,Detalles.COCA,pe.getE()));
            Saldo.setText("Seleccione una moneda");
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
