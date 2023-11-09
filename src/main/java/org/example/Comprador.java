package org.example;

/**
 * La clase Comprador permite realizar las transacciones recibiendo los valores a trabajar y conteniendo los resultados.
 */
public class Comprador {
    /**
     * El método Comprar permite realizar una transacción de compra.
     *
     * @param m             Deposito de monedas utilizado para realizar el pago, comunmente el saldo disponible.
     * @param cualProducto  Producto elegido para comprar.
     * @param exp           Expendedor que gestiona la transacción.
     * @return Valor del vuelto después de la compra.
     */
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