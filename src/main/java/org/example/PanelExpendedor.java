package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private Expendedor e;
    private int numProducto; // Con un setter cambiar tamaño de los Depositos cuando se instancie en otras clases
    public PanelExpendedor(int numProducto){
        this.numProducto = numProducto;
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
        // Depósitos gráficos de monedas y producto
        g.setColor(Color.BLACK);
        g.fillRect(340,465,120,80);
        g.fillRect(520,465,120,80);

        // Rellenamos los depósitos (visualmente)
        for(int i = 0; i<40*numProducto; i+=40) {                      // i < numProducto
            // CocaCola
            g.setColor(Color.RED);
            g.fillRect(330 + i,25,20,50);
            // Fanta
            g.setColor(Color.ORANGE);
            g.fillRect(330 + i,115,20,50);
            // Sprite
            g.setColor(Color.GREEN);
            g.fillRect(330 + i,205,20,50);
            // Super8
            g.setColor(Color.BLACK);
            g.fillRect(330 + i,295,12,52);
            // Snickers
            g.setColor(Color.darkGray);
            g.fillRect(330 + i,400,15,35);
        }
    }
}
