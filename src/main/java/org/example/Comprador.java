package org.example;

/**
 * La clase Comprador permite realizar las transacciones recibiendo los valores a trabajar y conteniendo los resultados.
 */
public class Comprador {
    private String consumiste;

    public Comprador(){
    }
    public int getSaldo(Deposito<Moneda> Saldo){
        int monto = 0;
        for(int i = 0; i<Saldo.getSize();i++) {
            monto += Saldo.seeElement(i).getValor();
        }
        return monto;
    }


    public int Comprar(Deposito<Moneda> m, Detalles cualProducto, Expendedor exp) {
        Producto p = exp.comprarProducto(m, cualProducto);
        int vuelto = 0;
        if (cualProducto == Detalles.serieCOCA || cualProducto == Detalles.serieSPR || cualProducto == Detalles.serieFAN ||
                cualProducto == Detalles.serieSN || cualProducto == Detalles.serieS8) {
            for(int i=0;i < exp.getVuelto().getSize();i++){
                vuelto +=  exp.getVuelto().seeElement(i).getValor();
            }
        }
        return vuelto;
    }
}