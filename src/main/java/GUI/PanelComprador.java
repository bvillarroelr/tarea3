package GUI;

import org.example.Comprador;
import org.example.Detalles;
import org.example.Moneda;
import org.example.Moneda1000;
import org.example.Deposito;
import org.example.Moneda100;
import org.example.Moneda500;
import org.example.Moneda1500;
import org.example.Expendedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel implements ActionListener {
    private Comprador c;
    private PanelExpendedor pe;
    private Deposito<Moneda> Saldo;
    private JButton coca, fanta, sprite, super8, snickers, m100,m500,m1000,m1500;
    private JLabel SaldoDisplay;
    public PanelComprador(Comprador c, PanelExpendedor pe) {
        setLayout(new BorderLayout());
        this.c = c;
        this.pe = pe;
        Saldo = new Deposito<>();

        coca = new JButton("CocaCola");
        fanta = new JButton("Fanta");
        sprite = new JButton("Sprite");
        super8 = new JButton("Super 8");
        snickers = new JButton("Snickers");
        m100 = new JButton("Añadir 100");
        m500 = new JButton("Añadir 500");
        m1000 = new JButton("Añadir 1000");
        m1500 = new JButton("Añadir 1500");
        SaldoDisplay = new JLabel("Saldo: $0");

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 3));

        rightPanel.add(SaldoDisplay);
        rightPanel.add(midrightPanel);
        midrightPanel.add(coca);
        coca.addActionListener(this);
        midrightPanel.add(super8);
        super8.addActionListener(this);
        midrightPanel.add(fanta);
        fanta.addActionListener(this);
        midrightPanel.add(snickers);
        snickers.addActionListener(this);
        midrightPanel.add(sprite);
        sprite.addActionListener(this);
        midrightPanel.add(m100);
        m100.addActionListener(this);
        midrightPanel.add(m500);
        m500.addActionListener(this);
        midrightPanel.add(m1000);
        m1000.addActionListener(this);
        midrightPanel.add(m1500);
        m1500.addActionListener(this);

        add(rightPanel, BorderLayout.EAST);
    }
    public void refreshSaldo(Deposito<Moneda> n){
        SaldoDisplay.setText("Saldo: $" + n.getElemento().getValor());
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int vuelto = 0;
        // Con este esqueleto podemos comenzar a trabajar en qué acción efectuará cada botón. Rellené con casos ejemplo solamente. Conectar lógica del resto del código
        if(e.getSource() == coca) {
            vuelto = c.Comprar(Saldo,Detalles.COCA,pe.getE());
            SaldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste una Coca");
            pe.setVerificaSiPintaProducto(true);
            pe.repaint();
            System.out.println(pe.getE().getVuelto().getSize());

            int c=0;
            for(int i=0;i < pe.getE().getVuelto().getSize();i++){
                Saldo.addElemento(pe.getE().getVuelto().seeElement(i));
                c += Saldo.seeElement(i).getValor();
            }
            System.out.println(c);

            pe.getE().getVuelto().clearDeposito();
        }
        else if(e.getSource() == fanta) {
            c.Comprar(Saldo,Detalles.FANTA,pe.getE());
            System.out.println("Compraste una Fanta");
            pe.repaint();
        }
        else if(e.getSource() == sprite) {
            c.Comprar(Saldo,Detalles.SPRITE,pe.getE());
            System.out.println("Compraste una Sprite");
            pe.repaint();
        }
        else if(e.getSource() == super8) {
            c.Comprar(Saldo,Detalles.SUPER8,pe.getE());
            System.out.println("Compraste un Super 8");
            pe.repaint();
        }
        else if(e.getSource() == snickers) {
            c.Comprar(Saldo,Detalles.SNICKER,pe.getE());
            System.out.println("Compraste un Snickers");
            pe.repaint();
        }
        else if(e.getSource() == m100) {
            Moneda m = new Moneda100();
            Saldo.addElemento(m);
            int c = 0;
            for(int i=0;i < Saldo.getSize();i++){
                c += Saldo.seeElement(i).getValor();
            }
            SaldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m500) {
            Moneda m = new Moneda500();
            Saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < Saldo.getSize(); i++) {
                c += Saldo.seeElement(i).getValor();
            }
            SaldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m1000) {
            Moneda m = new Moneda1000();
            Saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < Saldo.getSize(); i++) {
                c += Saldo.seeElement(i).getValor();
            }
            SaldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m1500) {
            Moneda m = new Moneda1500();
            Saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < Saldo.getSize(); i++) {
                c += Saldo.seeElement(i).getValor();
            }
            SaldoDisplay.setText("Saldo: $" + c);
        }
    }
}
