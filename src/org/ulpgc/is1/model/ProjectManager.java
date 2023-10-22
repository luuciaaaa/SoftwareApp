package org.ulpgc.is1.model;

import java.util.List;
import java.util.ArrayList;

public class ProjectManager {
    private List<Customer> customers = new ArrayList<>(); // Lista para almacenar clientes
    private List<Employee> employees = new ArrayList<>(); // Lista para almacenar empleados
    private List<Project> projects = new ArrayList<>();   // Lista para almacenar proyectos

    // Método para agregar un cliente a la lista de clientes
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Método para agregar un empleado a la lista de empleados
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Método para obtener un cliente por índice en la lista de clientes
    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    // Método para obtener un empleado por índice en la lista de empleados
    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    // Método para obtener la lista de clientes
    public List<Customer> getCustomers() {
        return customers;
    }
}



