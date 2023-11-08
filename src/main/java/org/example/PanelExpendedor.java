package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private Expendedor exp;
    private Deposito dep;
    public PanelExpendedor(Expendedor x){
        exp = x;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(300,0,387,600);
    }
}
