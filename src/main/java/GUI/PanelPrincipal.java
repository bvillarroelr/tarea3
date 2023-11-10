package GUI;

import org.example.*;

import javax.swing.*;
import java.awt.*;
/**
 * PanelPrincipal es una clase que representa el panel completo en la ventana y el cual es divide en componentes segun la funcion
 */
public class PanelPrincipal extends JPanel { ;
    private Comprador c = new Comprador();
    private PanelExpendedor exp = new PanelExpendedor(7, this);   // De aquí se define la cantidad de producto, y por ende, cuantos se veran en el expendedor
    private PanelComprador com = new PanelComprador(c,exp);
    /**
     * Constructor que configura el diseño y los componentes del panel.
     */
    public PanelPrincipal() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);
        this.add(com, BorderLayout.EAST);
        this.add(exp, BorderLayout.CENTER);
    }
    /**
     * Método para pintar el panel y sus componentes.
     *
     * @param g Gráficos.
     */
    public void paint (Graphics g) {
        super.paint(g);
        exp.paint(g);
    }
}
    /*

    Este metodo sirve para representar las monedas del saldo con sus respectivos colores
    (quedo por implementar)


    public void showMonedas(Graphics g, Deposito<Moneda> saldo) {
        Moneda m100 = new Moneda100();
        Moneda m500 = new Moneda500();
        Moneda m1000 = new Moneda1000();
        Moneda m1500 = new Moneda1500();
        int x = 50;
        for (int i = 0; i < saldo.getSize(); i++) {
            if (com.saldo.seeElement(i).equals(m100)) {
                g.setColor(Color.LIGHT_GRAY); // Color para la moneda de 100
                g.fillRect(40 * i, 50, 300, 105); // Dibuja un rectángulo para la moneda de 100
            } else if (com.saldo.seeElement(i).equals(m500)) {
                g.setColor(Color.GRAY); // Color para la moneda de 500
                g.fillRect(0 + 40 * i, 50, 300, 150); // Dibuja un rectángulo para la moneda de 500
            } else if (com.saldo.seeElement(i).equals(m1000)) {
                g.setColor(Color.ORANGE); // Color para la moneda de 1000
                g.fillRect(40 * i, 50, 300, 150); // Dibuja un rectángulo para la moneda de 1000
            } else if (com.saldo.seeElement(i).equals(m1500)) {
                g.setColor(Color.MAGENTA); // Color para la moneda de 1500
                g.fillRect(40 * i, 50, 300, 105); // Dibuja un rectángulo para la moneda de 1500
            }
        }
        repaint();
    }
}
     */