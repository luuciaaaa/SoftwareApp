package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Phone;
import org.ulpgc.is1.model.TaskType;
import org.ulpgc.is1.model.ProjectType;
import org.ulpgc.is1.model.Project;
import org.ulpgc.is1.model.Task;
import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.Employee;
import org.ulpgc.is1.model.ProjectManager;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Crear un administrador de proyectos
        ProjectManager projectManager = new ProjectManager();

        // Llamar al método init y pasar el administrador de proyectos como parámetro
        init(projectManager);
    }

    public static void init(ProjectManager projectManager) {

        // Crea dos teléfonos, uno válido y otro no válido
        Phone phone1 = new Phone("123-456-789");
        Phone phone2 = new Phone("Número de teléfono no válido");

        // Crea dos clientes
        Customer customer1 = new Customer("Kimberly", "Casimiro Torres", phone1);
        Customer customer2 = new Customer("Manuel", "López Cantana", phone2);

        // Crea dos empleados
        Employee employee1 = new Employee("Miguel", "miguelcabeza@gmail.com");
        Employee employee2 = new Employee("Lucía", "luciahernandez@gmail.com");

        // Vincula los clientes y empleados al 'projectManager'
        projectManager.addCustomer(customer1);
        projectManager.addCustomer(customer2);
        projectManager.addEmployee(employee1);
        projectManager.addEmployee(employee2);

        // Crea un proyecto vinculado al primer cliente.
        Project project1 = new Project("SoftwareApp", "Implementación en Java del diagrama de clases", ProjectType.CloudComputing, customer1, employee2);

        // Asignar al primer empleado como desarrollador
        project1.addDeveloper(employee1);

        // Asignar al segundo empleado como manager
        project1.setManager(employee2);

        // Crea dos tareas vinculadas al proyecto anterior
        Task task1 = new Task("Tarea 1", "Seguir las indicaciones del diagrama de clases", new Date(), new Date(), TaskType.Analysis, 10);
        Task task2 = new Task("Tarea 2", "Implementar con IntelliJ una aplicación que cumpla cada una de las indicaciones", new Date(), new Date(), TaskType.Design, 15);
        project1.addTask(task1);
        project1.addTask(task2);

        // Imprime los datos del primer cliente
        System.out.println("Datos del primer cliente:");
        System.out.println("Nombre: " + customer1.getName());
        System.out.println("Apellidos: " + customer1.getSurname());
        System.out.println("Teléfono: " + customer1.getPhone());
        System.out.println();

        // Imprime los datos del segundo empleado
        System.out.println("Datos del segundo empleado:");
        System.out.println("Nombre: " + employee2.getName());
        System.out.println("Email: " + employee2.getEmail());
        System.out.println();

        // Imprime los datos del proyecto del primer cliente
        System.out.println("Datos del proyecto del primer cliente:");
        System.out.println("Nombre del proyecto: " + project1.getName());
        System.out.println("Descripción del proyecto: " + project1.getDescription());
        System.out.println("Tipo de proyecto: " + project1.getType());
        System.out.println();

        // Imprime los roles de los empleados en el proyecto
        System.out.println("Representación de los empleados en el proyecto:");
        System.out.println("Primer empleado (" + employee1.getName() + "): Desarrollador");
        System.out.println("Segundo empleado (" + employee2.getName() + "): Manager");
        System.out.println();

        // Imprime los datos de las tareas del proyecto
        System.out.println("Datos de las tareas del proyecto:");
        for (Task task : project1.getTasks()) {
            System.out.println("Tarea: " + task.getName());
            System.out.println("Descripción de la tarea: " + task.getDescription());
        }
        System.out.println();

        // Borra el segundo cliente
        projectManager.getCustomers().remove(customer2);
        // Mensaje indicando que el segundo cliente ha sido borrado
        System.out.println("El segundo cliente ha sido borrado.");
        System.out.println();

        // Imprime el número de clientes
        System.out.println("Número de clientes: " + projectManager.getCustomers().size());
    }
}
