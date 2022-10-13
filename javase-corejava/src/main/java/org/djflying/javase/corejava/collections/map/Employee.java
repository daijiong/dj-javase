package org.djflying.javase.corejava.collections.map;

/**
 * Employee
 *
 * @author dj4817
 * @version $Id: Employee.java, v 0.1 2018/7/17 17:11 dj4817 Exp $$
 */
public class Employee {

    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     * @param name the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
