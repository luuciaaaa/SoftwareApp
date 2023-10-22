package org.ulpgc.is1.model;

import java.util.Date;

public class Contract {
    private Date start;
    private Date end;
    private int budget;

    // Este es el constructor de la clase "Contract". Recibe tres parámetros: "start" (inicio), "end" (fin) y "budget" (presupuesto).
    public Contract(Date start, Date end, int budget) {
        // Aquí estamos asignando los valores proporcionados como argumentos a las variables de instancia de la clase.
        this.start = start; // La fecha de inicio del contrato.
        this.end = end;     // La fecha de finalización del contrato.
        this.budget = budget; // El presupuesto del contrato.
    }

    // Este método permite obtener la fecha de inicio del contrato.
    public Date getStart() {
        return start;
    }

    // Este método permite obtener la fecha de finalización del contrato.
    public Date getEnd() {
        return end;
    }

    // Este método permite obtener el presupuesto del contrato.
    public int getBudget() {
        return budget;
    }
}
