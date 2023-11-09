package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelExpendedor extends JPanel implements ActionListener {
    private Expendedor e;
    private JButton dep1, dep2;
    private int numProducto; // Con un setter cambiar tamaño de los Depositos cuando se instancie en otras clases
    public PanelExpendedor(int numProducto, PanelPrincipal p){
        this.numProducto = numProducto;
        // Creamos botones que retiraran el producto y el vuelto
        dep1 = new JButton("asd");
        dep1.setBounds(520,465,120,80);
        dep1.setOpaque(false);
        dep1.setContentAreaFilled(false);
        dep1.setBorderPainted(false);

        dep2 = new JButton("dsa");
        dep2.setBounds(340,465,120,80);
        dep2.setOpaque(false);
        dep2.setContentAreaFilled(false);
        dep2.setBorderPainted(false);

        p.add(dep1);
        dep1.addActionListener(this);
        p.add(dep2);
        dep2.addActionListener(this);

        e = new Expendedor(numProducto);
    }

    public Expendedor getE() {
        return e;
    }

    public void setE(Expendedor e) {
        this.e = e;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(300,0,387,600);
        g.setColor(Color.LIGHT_GRAY);
        // Rectángulos grises que representan los depósitos de cada producto
        g.fillRect(320,20,350,60);
        g.fillRect(320,110,350,60);
        g.fillRect(320,200,350,60);
        g.fillRect(320,290,350,60);
        g.fillRect(320,380,350,60);
        // Depósito de monedas (vuelto) y el producto comprado por el cliente
        g.setColor(Color.BLACK);
        g.fillRect(340,465,120,80);
        g.fillRect(520,465,120,80);

        // Rellenamos los depósitos
        paintCoca(g,e);
        paintFanta(g,e);
        paintSprite(g,e);
        paintSuper8(g,e);
        paintSnickers(g,e);
    }
    public void paintCoca(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumCoca(); i+=40) {
            g.setColor(Color.RED);
            g.fillRect(330 + i,25,20,50);
        }
    }
    public void paintFanta(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumFanta(); i+=40) {
            g.setColor(Color.ORANGE);
            g.fillRect(330 + i,115,20,50);
        }
    }
    public void paintSprite(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSprite(); i+=40){
            g.setColor(Color.GREEN);
            g.fillRect(330 + i,205,20,50);
        }
    }
    public void paintSuper8(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSuper8(); i+=40) {
            g.setColor(Color.BLACK);
            g.fillRect(330 + i,295,12,52);
        }
    }
    public void paintSnickers(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSnickers(); i+=40){
            g.setColor(Color.darkGray);
            g.fillRect(330 + i,400,15,35);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar métodos que se "conecten" a PanelComprador
        if(e.getSource() == dep1) {
            System.out.println("asd");
        }
        else if(e.getSource() == dep2) {
            System.out.printf("dsa");
        }
    }
}
