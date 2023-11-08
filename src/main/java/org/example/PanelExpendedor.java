package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private Expendedor e = new Expendedor(3);
    public PanelExpendedor(){
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
    }
}
