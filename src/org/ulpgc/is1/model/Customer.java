package org.ulpgc.is1.model;

/**
 * Clase que representa un cliente.
 * Almacena información sobre el nombre,
 * el apellido y  el teléfono del cliente.
 */

public class Customer {
    private String name;
    private String surname;
    private Phone phone;

    /**
     * Constructor de la clase Customer.
     * Recibe como argumento el nombre,
     * el apellido y  el teléfono del cliente.
     */
    public Customer(String name, String surname, Phone phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    /**
     * Método para obtener el nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el apellido del cliente.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Método para establecer el apellido del cliente.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Método para obtener el teléfono del cliente.
     * Si el teléfono no es válido, se almacenará el valor:"XXXX".
     */
    public String getPhone() {
        if (phone.isValid()) {
            return phone.getNumber();
        } else {
            return "XXXX";
        }
    }

    /**
     * Método para establecer el teléfono del cliente.
     */
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
