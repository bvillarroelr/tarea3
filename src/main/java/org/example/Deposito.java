package org.example;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Deposito generico para poder crear cualquier deposito.
 *
 * @param <T> El tipo de elementos que se almacenarán en el depósito.
 */
public class Deposito<T> {
    private ArrayList<T> listaElementos;

    /**
     * Constructor de la clase Deposito. Inicializa una nueva instancia de Deposito y crea una lista vacía.
     */
    public Deposito() {
        listaElementos = new ArrayList<T>();
    }

    /**
     * Agrega un elemento del tipo al depósito.
     *
     * @param objeto El objeto del tipo que se desea agregar al depósito.
     */
    public void addElemento(T objeto) {
        listaElementos.add(objeto);
    }

    /**
     * Saca el producto deseado del deposito.
     *
     * @return Retorna el elemente rescatado.
     */
    public T getElemento() {
        if (!listaElementos.isEmpty()) {
            return listaElementos.remove(0);
        } else {
            return null;
        }
    }

    public T seeElement(int i) {
        if (!listaElementos.isEmpty()) {
            return listaElementos.get(i);
        } else return null;
    }

    /**
     * Obtiene el número de elementos almacenados en el depósito.
     *
     * @return un entero que indica cuantos elementos quedan.
     */
    public int getSize() {
        return listaElementos.size();
    }

    public void clearDeposito() {
        listaElementos.clear();
    }

    public void copiarADeposito(Deposito<T> d) {
        listaElementos.addAll(d.listaElementos);;
    }
}
