package org.example;

/**
 * La clase Comprador permite realizar las transacciones recibiendo los valores a trabajar y conteniendo los resultados.
 */
public class Comprador {
    private String consumiste;

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
}
    /*

    Este codigo es una implementacion de un sistema de "monedero" que no se termino usando porque implicaba cambiar el codigo de la tarea2
    private Deposito<Moneda> Saldo;

    private Moneda1500 m1;
    private Moneda1000 m2;

        public Comprador(){
        this.Saldo = new Deposito<>();
        this.m1 = new Moneda1500();
        this.m2 = new Moneda1000();
        Saldo.addElemento(m1);
        Saldo.addElemento(m2);

    public int getSaldo(){
        int monto = 0;
        for(int i = 0; i<Saldo.getSize();i++) {
            monto += Saldo.seeElement(i).getValor();
        }
        return monto;
    }
}
     */