package org.ulpgc.is1.model;

public class Effort {
    private int amount;

    // Constructor de la clase Effort que recibe la cantidad de esfuerzo como argumento.
    public Effort(int amount) {
        this.amount = amount; // Asigna el valor de esfuerzo proporcionado al atributo "amount".
    }

    // Método que permite obtener la cantidad de esfuerzo registrada.
    public int getAmount() {
        return amount;
    }
}

