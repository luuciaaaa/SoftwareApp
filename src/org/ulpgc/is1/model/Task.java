package org.ulpgc.is1.model;

import java.util.Date;

/**
 * Clase que representa una tarea en el proyecto.
 * Almacena información sobre el nombre,
 * la descripción, la fecha de inicio y finalización,
 * el tipo que la categoriza y la cantidad de esfuerzo requerido.
 */
public class Task {
    private String name;
    private String description;
    private Date start;
    private Date end;
    private TaskType type;
    private int effort;

    /**
     * Constructor de la clase Task.
     * Recibe como argumentos el nombre,
     * la descripción, la fecha de inicio y finalización,
     * el tipo de tarea y la cantidad de esfuerzo.
     */
    public Task(String name, String description, Date start, Date end, TaskType type, int effort) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
        this.type = type;
        this.effort = effort;
    }

    /**
     * Método para obtener el nombre de la tarea.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para establecer el nombre de la tarea.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener la descripción de la tarea.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método para establecer la descripción de la tarea.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método para obtener la fecha de inicio de la tarea.
     */
    public Date getStart() {
        return start;
    }

    /**
     * Método para establecer la fecha de inicio de la tarea.
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * Método para obtener la fecha de finalización de la tarea.
     */
    public Date getEnd() {
        return end;
    }

    /**
     * Método para establecer la fecha de finalización de la tarea.
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * Método para obtener el tipo de la tarea.
     */
    public TaskType getType() {
        return type;
    }

    /**
     * Método para establecer el tipo de la tarea.
     */
    public void setType(TaskType type) {
        this.type = type;
    }

    /**
     * Método para obtener la cantidad de esfuerzo para completar la tarea.
     */
    public int getEffort() {
        return effort;
    }

    /**
     * Método para establecer la cantidad de esfuerzo para completar la tarea.
     */
    public void setEffort(int effort) {
        this.effort = effort;
    }
}
