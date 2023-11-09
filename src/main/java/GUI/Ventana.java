package GUI;


import javax.swing.*;
/**
 * La clase Ventana describe las propiedades de la ventana principal del programa
 */
public class Ventana extends JFrame {
    private PanelPrincipal mp;
    /**
     * Constructor de la clase, Inicializa el panel principal
     */
    public Ventana() {

        mp = new PanelPrincipal();
        this.add(mp);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Maquina Expendedora");
        this.setSize(1000, 600);
        this.setVisible(true);
    }
}