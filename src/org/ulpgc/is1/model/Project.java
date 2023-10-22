package org.ulpgc.is1.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Project {
    private static int NEXT_ID = 0;
    private int id;
    private String name;
    private String description;
    private ProjectType type;
    private Customer customer;
    private Employee manager;
    private List<Task> tasks = new ArrayList<>();

    // Constructor de la clase Project que recibe varios parámetros para inicializar sus atributos.
    public Project(String name, String description, ProjectType type, Customer customer, Employee manager) {
        this.id = NEXT_ID++;        // Asigna un nuevo ID único al proyecto.
        this.name = name;           // Asigna el nombre proporcionado al atributo "name".
        this.description = description; // Asigna la descripción proporcionada al atributo "description".
        this.type = type;           // Asigna el tipo de proyecto proporcionado al atributo "type".
        this.customer = customer;   // Asigna el cliente proporcionado al atributo "customer".
        this.manager = manager;     // Asigna el empleado manager proporcionado al atributo "manager".
    }

    // Método que permite obtener el ID del proyecto.
    public int getId() {
        return id;
    }

    // Método que permite obtener el nombre del proyecto.
    public String getName() {
        return name;
    }

    // Método que permite obtener la descripción del proyecto.
    public String Description() {
        return description;
    }

    // Método que permite obtener el tipo de proyecto.
    public ProjectType getType() {
        return type;
    }

    // Método que permite obtener el cliente del proyecto.
    public Customer getCustomer() {
        return customer;
    }

    // Método que permite obtener el manager del proyecto.
    public Employee getManager() {
        return manager;
    }

    // Método que permite obtener la lista de tareas asociadas al proyecto.
    public List<Task> getTasks() {
        return tasks;
    }

    // Método para agregar una tarea al proyecto.
    public void addTask(Task task) {
        tasks.add(task);
    }
}


