package org.ulpgc.is1.model;

import java.util.Set; // Interfaz Set para trabajar con conjuntos, que nos permite almacenar elementos únicos sin duplicados.
import java.util.HashSet; // Clase HashSet, una implementación de Set, para almacenar y administrar conjuntos de elementos.

/**
 * Clase que representa a un empleado.
 * Almacena información sobre el nombre, el correo electrónico y las tareas asignadas al empleado.
 */
public class Employee {
    private String name;
    private String email;
    private Set<Task> tasks = new HashSet<>();

    /**
     * Constructor de la clase Employee.
     * Recibe como argumentos el nombre del empleado y su correo electrónico.
     */
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Método para obtener el nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre del empleado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener el correo electrónico del empleado.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para establecer el correo electrónico del empleado.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para agregar una tarea al empleado.
     * La tarea se añade a la lista de tareas del empleado.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Método para obtener la lista de tareas asignadas al empleado.
     */
    public Set<Task> getTasks() {
        return tasks;
    }
}

