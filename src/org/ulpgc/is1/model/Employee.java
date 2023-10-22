package org.ulpgc.is1.model;

import java.util.List;
import java.util.ArrayList; // Importa la clase ArrayList

public class Employee {
    private String name;
    private String email;
    private List<Task> tasks = new ArrayList<>(); // Utiliza ArrayList para la implementación

    // Constructor de la clase Employee que recibe un nombre y un correo electrónico como argumentos.
    public Employee(String name, String email) {
        this.name = name;   // Asigna el nombre proporcionado al atributo "name".
        this.email = email; // Asigna el correo electrónico proporcionado al atributo "email".
    }

    // Método que permite obtener el nombre del empleado.
    public String getName() {
        return name;
    }

    // Método que permite obtener el correo electrónico del empleado.
    public String getEmail() {
        return email;
    }

    // Método que permite agregar una tarea a la lista de tareas del empleado.
    public void addTask(Task task) {
        tasks.add(task);
    }
}

