package org.example;

/**
 * La clase Comprador permite realizar las transacciones recibiendo los valores a trabajar y conteniendo los resultados.
 */
public class Comprador {
    private String consumiste;
    private Deposito<Moneda> Saldo;
    private Moneda1500 m1;
    private Moneda1000 m2;
    public Comprador(){
        this.Saldo = new Deposito<>();
        this.m1 = new Moneda1500();
        this.m2 = new Moneda1000();
        Saldo.addElemento(m1);
        Saldo.addElemento(m2);
    }
    public int Comprar(Moneda m, Detalles cualProducto, Expendedor exp) {
        Producto p = exp.comprarProducto(m, cualProducto);
        int temp = 0;
        int vuelto = 0;
        if (cualProducto == Detalles.COCA || cualProducto == Detalles.SPRITE || cualProducto == Detalles.FANTA ||
                cualProducto == Detalles.SNICKER || cualProducto == Detalles.SUPER8) {
            while (exp.getVuelto() != null) {
                temp += 100;
            }
            vuelto = temp;
        }
        return vuelto;
    }
    public int getSaldo(){
        int monto = 0;
        for(int i = 0; i<Saldo.getSize();i++) {
            monto += Saldo.seeElement(i).getValor();
        }
        return monto;
    }
}