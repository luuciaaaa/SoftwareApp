package org.ulpgc.is1.model;

<<<<<<< HEAD
import java.util.List;
import java.util.ArrayList;

public class ProjectManager {
    private List<Customer> customers = new ArrayList<>(); // Lista para almacenar clientes
    private List<Employee> employees = new ArrayList<>(); // Lista para almacenar empleados
    private List<Project> projects = new ArrayList<>();   // Lista para almacenar proyectos

    // Método para agregar un cliente a la lista de clientes
=======
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
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

<<<<<<< HEAD
    // Método para agregar un empleado a la lista de empleados
=======
    /**
     * Añade un empleado al proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

<<<<<<< HEAD
    // Método para obtener un cliente por índice en la lista de clientes
=======
    /**
     * Obtiene un cliente del proyecto en base a su índice.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public Customer getCustomer(int index) {
        return customers.get(index);
    }

<<<<<<< HEAD
    // Método para obtener un empleado por índice en la lista de empleados
=======
    /**
     * Obtiene un empleado del proyecto en base a su índice.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

<<<<<<< HEAD
    // Método para obtener la lista de clientes
    public List<Customer> getCustomers() {
        return customers;
    }
}



=======
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
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
