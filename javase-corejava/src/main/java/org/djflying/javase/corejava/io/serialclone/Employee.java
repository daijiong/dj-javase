package org.djflying.javase.corejava.io.serialclone;

import java.time.LocalDate;

/**
 * Employee
 *
 * @author dj4817
 * @version $Id: Employee.java, v 0.1 2018/5/17 14:37 dj4817 Exp $$
 */
public class Employee extends SerialCloneable {

    private String    name;
    private double    salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Raises the salary of this employee.
     *
     * @param byPercent the percentage of the raise
     */
    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
