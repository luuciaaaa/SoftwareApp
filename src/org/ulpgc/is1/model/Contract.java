package org.ulpgc.is1.model;

import java.util.Date;

/**
 * Clase que representa un contrato.
 * Almacena información sobre la fecha en la que empieza,
 * la fecha en la que termina y el presupuesto establecido.
 */

public class Contract {
    private Date start;
    private Date end;
    private int budget;

    /**
     * Constructor de la clase Contract.
     * Recibe como argumento la fecha en la que empieza,
     * la fecha en la que termina y el presupuesto.
     */
    public Contract(Date start, Date end, int budget) {
        this.start = start;
        this.end = end;
        this.budget = budget;
    }
    /**
     * Método para obtener la fecha en la que empieza el contrato.
     */
    public Date getStart() {
        return start;
    }

    /**
     * Método para establecer la fecha en la que empieza el contrato.
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * Método para obtener la fecha en la que termina el contrato.
     */
    public Date getEnd() {
        return end;
    }

    /**
     * Método para establecer la fecha en la que termina el contrato.
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * Método para obtener el presupuesto establecido para el contrato.
     */
    public int getBudget() {
        return budget;
    }

    /**
     * Método para establecer el presupuesto del contrato.
     */
    public void setBudget(int budget) {
        this.budget = budget;
    }
}

