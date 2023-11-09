package GUI;

import org.example.Comprador;
import org.example.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelExpendedor extends JPanel implements ActionListener {
    private Expendedor e;
    private Comprador c;
    private boolean VerificaSiPintaProducto = false;
    private boolean VerificaSiPintaVuelto = false;
    private JButton depMon, depProd;
    private int numProducto; // Con un setter cambiar tamaño de los Depositos cuando se instancie en otras clases
    public PanelExpendedor(int numProducto, PanelPrincipal p, Comprador c){
        this.numProducto = numProducto;
        this.c = c;
        // Creamos botones que retiraran el producto y el vuelto
        depMon = new JButton("asd");
        depMon.setBounds(520,465,120,80);
        depMon.setOpaque(false);
        depMon.setContentAreaFilled(false);
        depMon.setBorderPainted(false);

        depProd = new JButton("dsa");
        depProd.setBounds(340,465,120,80);
        depProd.setOpaque(false);
        depProd.setContentAreaFilled(false);
        depProd.setBorderPainted(false);

        p.add(depMon);
        depMon.addActionListener(this);
        p.add(depProd);
        depProd.addActionListener(this);

        e = new Expendedor(numProducto);
    }

    public void setVerificaSiPintaProducto(boolean verificaSiPintaProducto) {
        VerificaSiPintaProducto = verificaSiPintaProducto;
    }
    public void setVerificaSiPintaVuelto(boolean verificaSiPintaVuelto) {
        VerificaSiPintaVuelto = verificaSiPintaVuelto;
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
        if(VerificaSiPintaProducto) {
            g.setColor(Color.RED);
            g.fillRect(360,470,20,50);
        }
        else {
            g.setColor(Color.BLACK);
            g.fillRect(360,470,20,50);
        }

        if(VerificaSiPintaVuelto) {
            ;   // aqui debera pintar monedas
        }

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
        if(e.getSource() == depMon && VerificaSiPintaVuelto) {
            // lógica de vuelto (retirar vuelto)
            VerificaSiPintaVuelto = false;      // Falta hacer desaparecer el "producto" al clickear en el recuadro
            this.repaint();
            System.out.printf("Recogiste $100");
        }
        else if(e.getSource() == depProd && VerificaSiPintaProducto) {
            // lógica de comprador (consumir el producto)
            VerificaSiPintaProducto = false;
            repaint();
            System.out.println("Recogiste el producto");
        }
    }
}
