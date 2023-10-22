package org.ulpgc.is1.model;

/**
 * Clase que representa el esfuerzo.
 * Almacena información sobre la cantidad de esfuerzo realizado.
 */
public class Effort {
    private int amount;

    /**
     * Constructor de la clase Effort.
     * Recibe como argumento la cantidad de esfuerzo realizado.
     */
    public Effort(int amount) {
        this.amount = amount;
    }

    /**
     * Método que devuelve la cantidad de esfuerzo realizado.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Método que establece la cantidad de esfuerzo realizado.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}


