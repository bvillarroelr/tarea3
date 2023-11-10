package GUI;

import org.example.Comprador;
import org.example.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * PanelExpendedor es una clase que representa el panel del expendedor en la interfaz gráfica.
 * Esta clase crea y ordena representaciones gráficas de los depósitos y sus productos
 */
public class PanelExpendedor extends JPanel implements ActionListener {
    private Expendedor e;
    private int cual;
    private boolean verificaSiPintaProducto = false;
    private boolean verificaSiPintaVuelto = false;
    private JButton depMon, depProd;
    private int numProducto; // Con un setter cambiar tamaño de los Depositos cuando se instancie en otras clases
    /**
     * Constructor de la clase PanelExpendedor.
     *
     * @param numProducto Cantidad de productos en la maquina.
     * @param p           PanelPrincipal asociado al panel.
     */
    public PanelExpendedor(int numProducto, PanelPrincipal p){
        this.numProducto = numProducto;
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
    /**
     * Cambia el estado para detectar cuando pintar el producto.
     *
     * @param verificaSiPintaProducto Indica si se debe pintar el producto.
     */
    public void setVerificaSiPintaProducto(boolean verificaSiPintaProducto) {
        this.verificaSiPintaProducto = verificaSiPintaProducto;
    }
    /**
     * Cambia el estado para detectar cuando pintar el vuelto.
     *
     * @param verificaSiPintaVuelto Indica si se debe pintar el vuelto.
     */
    public void setVerificaSiPintaVuelto(boolean verificaSiPintaVuelto) {
        this.verificaSiPintaVuelto = verificaSiPintaVuelto;
    }
    /**
     * Metodo getter para el objeto Expendedor asociado al panel.
     *
     * @return Objeto Expendedor del Panel.
     */
    public Expendedor getE() {
        return e;
    }
    /**
     * Metodo Setter para el objeto Expendedor asociado al panel.
     *
     * @param e objeto Expendedor a colocar.
     */
    public void setE(Expendedor e) {
        this.e = e;
    }
    /**
     * Método paint que dibuja el expendedor, sus partes y los productos del deposito
     *
     * @param g Gráficos.
     */

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
        if(verificaSiPintaProducto && cual == 1) {
            g.setColor(Color.RED);
            g.fillRect(360,470,20,50);
        }
        else if(verificaSiPintaProducto && cual == 2) {
            g.setColor(Color.ORANGE);
            g.fillRect(360,470,20,50);
        }
        else if(verificaSiPintaProducto && cual == 3) {
            g.setColor(Color.GREEN);
            g.fillRect(360,470,20,50);
        }
        else if(verificaSiPintaProducto && cual == 4) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(360,470,20,50);
        }
        else if(verificaSiPintaProducto && cual == 5) {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(360,470,20,50);
        }
        else{
            g.setColor(Color.BLACK);
            g.fillRect(360,470,20,50);
        }


        if(verificaSiPintaVuelto) {
            ;   // aqui debera pintar monedas
        }

        // Rellenamos los depósitos
        paintCoca(g,e);
        paintFanta(g,e);
        paintSprite(g,e);
        paintSuper8(g,e);
        paintSnickers(g,e);
    }
    /**
     * Método para pintar las coca cola del deposito.
     *
     * @param g   Gráficos.
     * @param exp Objeto Expendedor.
     */
    public void paintCoca(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumCoca(); i+=40) {
            g.setColor(Color.RED);
            g.fillRect(330 + i,25,20,50);
        }
    }
    /**
     * Método para pintar las fantas del deposito.
     *
     * @param g   Gráficos.
     * @param exp Objeto Expendedor.
     */
    public void paintFanta(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumFanta(); i+=40) {
            g.setColor(Color.ORANGE);
            g.fillRect(330 + i,115,20,50);
        }
    }
    /**
     * Método para pintar las sprites del deposito.
     *
     * @param g   Gráficos.
     * @param exp Objeto Expendedor.
     */
    public void paintSprite(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSprite(); i+=40){
            g.setColor(Color.GREEN);
            g.fillRect(330 + i,205,20,50);
        }
    }
    /**
     * Método para pintar los super8 del deposito.
     *
     * @param g   Gráficos.
     * @param exp Objeto Expendedor.
     */
    public void paintSuper8(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSuper8(); i+=40) {
            g.setColor(Color.BLACK);
            g.fillRect(330 + i,295,12,52);
        }
    }
    /**
     * Método para pintar los snickers del deposito.
     *
     * @param g   Gráficos.
     * @param exp Objeto Expendedor.
     */
    public void paintSnickers(Graphics g, Expendedor exp) {
        for(int i = 0; i<40*exp.getNumSnickers(); i+=40){
            g.setColor(Color.darkGray);
            g.fillRect(330 + i,400,15,35);
        }
    }
    /**
     * Metodo para manejar acciones, detecta cuando se "recoge" el producto.
     *
     * @param e Evento.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == depMon && verificaSiPintaVuelto) {
            // lógica de vuelto (retirar vuelto)
            verificaSiPintaVuelto = false;      // Falta hacer desaparecer el "producto" al clickear en el recuadro
            this.repaint();
            System.out.printf("Recogiste $100");
        }
        else if(e.getSource() == depProd && verificaSiPintaProducto) {
            // lógica de comprador (consumir el producto)
            verificaSiPintaProducto = false;
            repaint();
            System.out.println("Recogiste el producto");
        }
    }
    public int getCual() {
        return cual;
    }

    public void setCual(int cual) {
        this.cual = cual;
    }
}
