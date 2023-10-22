package org.ulpgc.is1.model;

public class Customer {
    private String name;
    private String surname;
    private Phone phone;

    // Constructor de la clase Customer que recibe un nombre, un apellido y un objeto Phone como argumentos.
    public Customer(String name, String surname, Phone phone) {
        this.name = name;       // Asigna el nombre proporcionado al atributo "name".
        this.surname = surname; // Asigna el apellido proporcionado al atributo "surname".
        this.phone = phone;     // Asigna el objeto Phone proporcionado al atributo "phone".
    }

    // Método que permite obtener el nombre del cliente.
    public String getName() {
        return name;
    }

    // Método que permite obtener el apellido del cliente.
    public String getSurname() {
        return surname;
    }

    // Método que permite obtener el objeto Phone del cliente.
    public Phone getPhone() {
        return phone;
    }
}
