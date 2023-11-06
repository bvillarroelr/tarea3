package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
    public PanelBotones() {
        this.setLayout(new GridLayout(2,3));
        this.add(new JButton("Coca ($...)"));
        this.add(new JButton("Fanta ($...)"));
        this.add(new JButton("Sprite ($...)"));
        this.add(new JButton("Super 8 ($...)"));
        this.add(new JButton("Snickers ($...)"));
        this.add(new JButton("Retirar vuelto"));
    }
}
