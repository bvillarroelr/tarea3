package GUI;

import org.example.Comprador;
import org.example.Detalles;
import org.example.Moneda;
import org.example.Moneda1000;
import org.example.Deposito;
import org.example.Moneda100;
import org.example.Moneda500;
import org.example.Moneda1500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel implements ActionListener {
    private Comprador c;
    private PanelExpendedor pe;
    private Deposito<Moneda> saldo;
    private JButton coca, fanta, sprite, super8, snickers, m100,m500,m1000,m1500;
    private JLabel saldoDisplay;
    public PanelComprador(Comprador c, PanelExpendedor pe) {
        setLayout(new BorderLayout());
        this.c = c;
        this.pe = pe;
        saldo = new Deposito<>();

        coca = new JButton("CocaCola");
        fanta = new JButton("Fanta");
        sprite = new JButton("Sprite");
        super8 = new JButton("Super 8");
        snickers = new JButton("Snickers");
        m100 = new JButton("Añadir 100");
        m500 = new JButton("Añadir 500");
        m1000 = new JButton("Añadir 1000");
        m1500 = new JButton("Añadir 1500");
        saldoDisplay = new JLabel("Saldo: $0");

        JPanel rightPanel = new JPanel();
        JPanel midrightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        midrightPanel.setLayout(new GridLayout(3, 3));

        rightPanel.add(saldoDisplay);
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
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(500,200, 40, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int vuelto = 0;

        if(e.getSource() == coca) {
            vuelto = c.Comprar(saldo,Detalles.COCA,pe.getE());
            saldo.clearDeposito();
            saldo.copiarADeposito(pe.getE().getVuelto());
            pe.getE().getVuelto().clearDeposito();
            saldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste una Coca");
            pe.setVerificaSiPintaProducto(true);
            pe.repaint();
        }
        else if(e.getSource() == fanta) {
            vuelto = c.Comprar(saldo,Detalles.FANTA,pe.getE());
            saldo.clearDeposito();
            saldo.copiarADeposito(pe.getE().getVuelto());
            pe.getE().getVuelto().clearDeposito();
            saldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste una Fanta");
            pe.repaint();
        }
        else if(e.getSource() == sprite) {
            vuelto = c.Comprar(saldo,Detalles.SPRITE,pe.getE());
            saldo.clearDeposito();
            saldo.copiarADeposito(pe.getE().getVuelto());
            pe.getE().getVuelto().clearDeposito();
            saldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste una Sprite");
            pe.repaint();
        }
        else if(e.getSource() == super8) {
            vuelto = c.Comprar(saldo,Detalles.SUPER8,pe.getE());
            saldo.clearDeposito();
            saldo.copiarADeposito(pe.getE().getVuelto());
            pe.getE().getVuelto().clearDeposito();
            saldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste un Super 8");
            pe.repaint();
        }
        else if(e.getSource() == snickers) {
            vuelto = c.Comprar(saldo,Detalles.SNICKER,pe.getE());
            saldo.clearDeposito();
            saldo.copiarADeposito(pe.getE().getVuelto());
            pe.getE().getVuelto().clearDeposito();
            saldoDisplay.setText("Saldo: $" + vuelto);
            System.out.println("Compraste un Snickers");
            pe.repaint();
        }
        else if(e.getSource() == m100) {
            Moneda m = new Moneda100();
            saldo.addElemento(m);
            int c = 0;
            for(int i = 0; i < saldo.getSize(); i++){
                c += saldo.seeElement(i).getValor();
            }
            saldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m500) {
            Moneda m = new Moneda500();
            saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < saldo.getSize(); i++) {
                c += saldo.seeElement(i).getValor();
            }
            saldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m1000) {
            Moneda m = new Moneda1000();
            saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < saldo.getSize(); i++) {
                c += saldo.seeElement(i).getValor();
            }
            saldoDisplay.setText("Saldo: $" + c);
        }
        else if(e.getSource() == m1500) {
            Moneda m = new Moneda1500();
            saldo.addElemento(m);
            int c = 0;
            for (int i = 0; i < saldo.getSize(); i++) {
                c += saldo.seeElement(i).getValor();
            }
            saldoDisplay.setText("Saldo: $" + c);
        }
    }
}
