package GUI;

import org.example.Comprador;

import javax.swing.*;
import java.awt.*;
/**
 * PanelPrincipal es una clase que representa el panel completo en la ventana y el cual es divide en componentes segun la funcion
 */
public class PanelPrincipal extends JPanel { ;
    private Comprador c = new Comprador();
    private PanelExpendedor exp = new PanelExpendedor(3, this, c);
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
        com.showMonedas(g);
    }
}