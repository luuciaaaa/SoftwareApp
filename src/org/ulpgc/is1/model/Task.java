package org.ulpgc.is1.model;

import java.util.Date;

public class Task {
    private String name;
    private String description;
    private Date start;
    private Date end;
    private TaskType type;
    private int effort;

    // Constructor de la clase Task que recibe varios parámetros para inicializar sus atributos.
    public Task(String name, String description, Date start, Date end, TaskType type, int effort) {
        this.name = name;           // Asigna el nombre proporcionado al atributo "name".
        this.description = description; // Asigna la descripción proporcionada al atributo "description".
        this.start = start;         // Asigna la fecha de inicio proporcionada al atributo "start".
        this.end = end;             // Asigna la fecha de finalización proporcionada al atributo "end".
        this.type = type;           // Asigna el tipo de tarea proporcionado al atributo "type".
        this.effort = effort;       // Asigna el esfuerzo proporcionado al atributo "effort".
    }

    // Método que permite obtener el nombre de la tarea.
    public String getName() {
        return name;
    }

    // Método que permite obtener la descripción de la tarea.
    public String getDescription() {
        return description;
    }

    // Método que permite obtener la fecha de inicio de la tarea.
    public Date getStart() {
        return start;
    }

    // Método que permite obtener la fecha de finalización de la tarea.
    public Date getEnd() {
        return end;
    }

    // Método que permite obtener el tipo de tarea.
    public TaskType getType() {
        return type;
    }

    // Método que permite obtener el esfuerzo dedicado a la tarea.
    public int getEffort() {
        return effort;
    }
}

