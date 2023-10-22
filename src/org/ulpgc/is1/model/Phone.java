package org.ulpgc.is1.model;


public class Phone {
    private String number; // Aquí guardamos el número de teléfono


    public Phone(String number) {
        this.number = number; // Configuramos el número cuando creamos un objeto Phone
    }


    public String getNumber() {
        return number; // Obtenemos el número de teléfono
    }


    public boolean isValid() {
        // Implementa la lógica para validar el número de teléfono
        return true; // Por ahora, siempre asumimos que el número es válido
    }
}

