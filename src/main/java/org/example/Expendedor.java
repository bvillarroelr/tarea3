package org.example;

import java.util.ArrayList;
/**
 * La clase Expendedor es la clase principal, contiene depositos de varios productos y metodos para realizar transacciones.
 */
public class Expendedor {
    private Deposito<Bebida> depCoca, depSprite, depFanta;
    private Deposito<Dulce> depSuper8, depSnickers;
    private Deposito<Moneda> monVu;
    private int numProductos;

    /**
     * Constructor de la clase Expendedor.
     *
     * @param numProductos Describe cuanos productos contiene de cada producto.
     */
    public Expendedor(int numProductos) {
        this.numProductos = numProductos; // Seguramente lo usaremos cuando tengamos que rellenar la máquina expendedora, puede ser a través de un for
        depCoca = new Deposito();
        depSprite = new Deposito();
        depFanta = new Deposito();
        depSuper8 = new Deposito();
        depSnickers = new Deposito();
        monVu = new Deposito();
        for (int i = 0; i < numProductos; i++) {
            Bebida c = new Sprite(i);
            Bebida s = new CocaCola(i);
            Bebida f = new Fanta(i);
            Dulce sn = new Super8(i);
            Dulce s8 = new Snickers(i);

            depCoca.addElemento(c);
            depSprite.addElemento(s);
            depFanta.addElemento(f);
            depSnickers.addElemento(sn);
            depSuper8.addElemento(s8);
        }
    }

    /**
     * Método para comprar un cierto producto usando una moneda
     *
     * @param m     La moneda con la que se compra.
     * @param cual  El producto a elegir.
     * @return      El producto, ya habiendo calculado el vuelto.
     * @throws PagoIncorrectoException     Si no se ha encontrado una moneda.
     * @throws PagoInsuficienteException   Si el valor de la moneda es insuficiente para comprar el producto.
     * @throws NoHayProductoException      Si no hay productos disponibles del tipo especificado o se ha elegido un producto invalido.
     */
    public Producto comprarProducto(Deposito<Moneda> m, Detalles cual) {
        if (m == null)  throw new PagoIncorrectoException("No se ha encontrado ninguna moneda en saldo");
        int suma = 0;
        for (int i = 0; i<m.getSize(); i++){
            suma += m.seeElement(i).getValor();
        }
        if (cual == Detalles.COCA && depCoca.getSize() > 0) {
            if (suma < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No dispone de suficiente saldo");
            calcularVueltoBebida(m);
            return depCoca.getElemento();
        }
        if (cual == Detalles.SPRITE && depSprite.getSize() > 0) {
            if (suma < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No dispone de suficiente saldo");
            calcularVueltoBebida(m);
            return depSprite.getElemento();
        }
        if (cual == Detalles.FANTA && depFanta.getSize() > 0) {
            if (suma < Detalles.BEBIDAS.getDetalle()) throw new PagoInsuficienteException("No dispone de suficiente saldo");
            calcularVueltoBebida(m);
            return depFanta.getElemento();
        }
        if (cual == Detalles.SNICKER && depSnickers.getSize() > 0) {
            if (suma < Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No dispone de suficiente saldo");
            calcularVueltoDulce(m);
            return depSnickers.getElemento();
        }
        if (cual == Detalles.SUPER8 && depSuper8.getSize() > 0) {
            if (suma < Detalles.DULCES.getDetalle()) throw new PagoInsuficienteException("No dispone de suficiente saldo");
            calcularVueltoDulce(m);
            return depSuper8.getElemento();
        }
        throw new NoHayProductoException("No hay Productos Disponibles");
    }

    /**
     * Getter para el vuelto.
     *
     * @return El vuelto en forma de una moneda.
     */
    public Deposito<Moneda> getVuelto() {
        System.out.println("Flag" + monVu.getSize());
        return monVu;
    }

    /**
     * Método privado para calcular el vuelto de una compra de bebida (Optimiza el Codigo).
     *
     * @param m La moneda con la que se pagó.
     */
    private void calcularVueltoBebida(Deposito<Moneda> m) {
        int suma = 0;
        for (int i = 0; i<m.getSize(); i++){
            suma += m.seeElement(i).getValor();
        }
        for (int i = 0; i < suma - Detalles.BEBIDAS.getDetalle(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }

    /**
     * Método privado para calcular el vuelto de una compra de dulce (Optimiza el Codigo).
     *
     * @param m La moneda con la que se pagó.
     */
    private void calcularVueltoDulce(Deposito<Moneda> m) {
        int suma = 0;
        for (int i = 0; i<m.getSize(); i++){
            suma += m.seeElement(i).getValor();
        }
        for (int i = 0; i < suma - Detalles.DULCES.getDetalle(); i += 100) {
            Moneda a = new Moneda100();
            monVu.addElemento(a);
        }
    }
    // método de prueba para ver si los cambios de getE() se aplican a la referencia o a la copia
    public int getNumCoca() {
        return depCoca.getSize();
    }
    public int getNumFanta() {
        return depFanta.getSize();
    }
    public int getNumSprite() {
        return depSprite.getSize();
    }
    public int getNumSuper8() {
        return depSuper8.getSize();
    }
    public int getNumSnickers() {
        return depSnickers.getSize();
    }

}
