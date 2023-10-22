package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase base que representa un componente que
 * gestiona la información relacionada con
 * el proyecto, los clientes y los empleados.
 */

public class ProjectManager {

    // Lista de clientes del proyecto
    private final List<Customer> customers;

    // Lista de empleados del proyecto
    private final List<Employee> employees;

    // Lista de proyectos del proyecto
    private final List<Project> projects;

    /**
     * Constructor de la clase ProjectManager.
     * Recibe como argumentos los clientes,
     * los empleados y los proyectos.
     */
    public ProjectManager() {
        customers = new ArrayList<>();
        employees = new ArrayList<>();
        projects = new ArrayList<>();
    }

    /**
     * Añade un cliente al proyecto.
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Añade un empleado al proyecto.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Obtiene un cliente del proyecto en base a su índice.
     */
    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    /**
     * Obtiene un empleado del proyecto en base a su índice.
     */
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    /**
     * Obtiene la lista de clientes del proyecto.
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Project> getProjects() {
        return projects;
    }
}


