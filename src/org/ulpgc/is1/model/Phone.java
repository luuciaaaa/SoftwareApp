package org.ulpgc.is1.model;

/**
 * Clase que representa un teléfono.
 */
public class Phone {
    private String number;

    /**
     * Constructor de la clase Phone.
     * Recibe como argumento el número de teléfono.
     */
    public Phone(String number) {
        this.number = number;
    }

    /**
     * Método para obtener el número de teléfono.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Método que verifica si el número de teléfono es válido.
     * Verifica si el número de teléfono tiene el formato "###-###-###".
     * Si el número no es válido, se almacenará el valor "XXXX"
     * y se devuelve 'false'.
     */

    public boolean isValid() {
        if (number.matches("\\d{3}-\\d{3}-\\d{3}")) {
            return true;
        } else {
            this.number = "XXXX";
            return false;
        }
    }
}
