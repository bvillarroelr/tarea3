package GUI;

import org.example.Comprador;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel { ;
    private Comprador c = new Comprador();
    private PanelExpendedor exp = new PanelExpendedor(3, this, c);
    private PanelComprador com = new PanelComprador(c,exp);

    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
    }
    public void paint (Graphics g) {
        super.paint(g);
        exp.paint(g);
    }
}