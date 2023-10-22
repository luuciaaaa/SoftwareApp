package org.ulpgc.is1.model;

<<<<<<< HEAD
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Project {
    private static int NEXT_ID = 0;
    private int id;
=======
import java.util.Set; // Interfaz Set para trabajar con conjuntos, que nos permite almacenar elementos únicos sin duplicados.
import java.util.HashSet; // Clase HashSet, una implementación de Set, para almacenar y administrar conjuntos de elementos.

/**
 * Clase que representa un proyecto.
 */
public class Project {
    private static int NEXT_ID = 0;
    private final int id;
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    private String name;
    private String description;
    private ProjectType type;
    private Customer customer;
    private Employee manager;
<<<<<<< HEAD
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
=======
    private Set<Task> tasks = new HashSet<>();
    private Set<Employee> developers = new HashSet<>();

    /**
     * Constructor de la clase Project.
     * Recibe como argumentos el nombre del proyecto,
     * la descripción del proyecto, el tipo de proyecto,
     * el cliente al que pertenece el proyecto,
     * y el empleado que se encarga del proyecto.
     */
    public Project(String name, String description, ProjectType type, Customer customer, Employee manager) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.type = type;
        this.customer = customer;
        this.manager = manager;
    }

    /**
     * Método que devuelve el identificador único del proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public int getId() {
        return id;
    }

<<<<<<< HEAD
    // Método que permite obtener el nombre del proyecto.
=======
    /**
     * Método que devuelve el nombre del proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public String getName() {
        return name;
    }

<<<<<<< HEAD
    // Método que permite obtener la descripción del proyecto.
    public String Description() {
        return description;
    }

    // Método que permite obtener el tipo de proyecto.
=======
    /**
     * Método que establece el nombre del proyecto.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que devuelve la descripción del proyecto.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que establece la descripción del proyecto.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método que devuelve el tipo de proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public ProjectType getType() {
        return type;
    }

<<<<<<< HEAD
    // Método que permite obtener el cliente del proyecto.
=======
    /**
     * Método que establece el tipo de proyecto.
     */
    public void setType(ProjectType type) {
        this.type = type;
    }

    /**
     * Método que devuelve el cliente al que pertenece el proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public Customer getCustomer() {
        return customer;
    }

<<<<<<< HEAD
    // Método que permite obtener el manager del proyecto.
=======
    /**
     * Método que establece el cliente al que pertenece el proyecto.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Método que devuelve el empleado responsable del proyecto.
     */
>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
    public Employee getManager() {
        return manager;
    }

<<<<<<< HEAD
    // Método que permite obtener la lista de tareas asociadas al proyecto.
    public List<Task> getTasks() {
        return tasks;
    }

    // Método para agregar una tarea al proyecto.
    public void addTask(Task task) {
        tasks.add(task);
    }
}


=======
    /**
     * Método que devuelve la lista de tareas del proyecto.
     */
    public Set<Task> getTasks() {
        return tasks;
    }

    /**
     * Método que añade una tarea al proyecto.
     * Este método asegura que la navegabilidad sea solo del TODO (proyecto) a las PARTES (tareas).
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Método que devuelve la lista de empleados del proyecto.
     */
    public Set<Employee> getDevelopers() {
        return developers;
    }

    /**
     * Método que agrega al primer empleado como desarrollador al proyecto.
     */
    public void addDeveloper(Employee employee1) {
    }

    /**
     * Método que establece al empleado como manager del proyecto.
     */
    public void setManager(Employee employee2) {
    }
}





>>>>>>> 053d362 (Sexto commit, se crea las clase Main para comprobar el resultado, además se hacen correcciones para el correcto funcionamiento del proyecto.)
