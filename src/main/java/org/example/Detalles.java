package org.example;

/**
 * La enumeración Detalles contiene las ctes. usadas para elegir productos y acceder a precios
 */
public enum Detalles {
    serieCOCA(1),
    serieSPR(2),
    serieFAN(3),
    serieSN(4),
    serieS8(5),
    COCA(900),
    SPRITE(1100),
    FANTA(1200),
    SNICKER(1000),
    SUPER8(500);

    private int det;

    /**
     * Constructor de la enumeración Detalles.
     *
     * @param det Enumeracion de Enteros.
     */
    Detalles(int det) {
        this.det = det;
    }

    /**
     * getter de cualquier parametro del enum.
     *
     * @return valor numerico del detalle solicitado.
     */
    public int getDetalle() {
        return det;
    }
}
