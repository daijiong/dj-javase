package org.djflying.javase.corejava.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/**
 * 雇员类
 *
 * @author dj4817
 * @version $Id: Employee.java, v 0.1 2017/11/11 10:37 dj4817 Exp $$
 */
public class Employee extends Person {

    /** 薪水 */
    private double      salary;
    /** 入职时间 */
    protected LocalDate hireDay;

    /**
     * 无参构造器
     */
    public Employee() {
    }

    /**
     * 全参构造器
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    /**
     * 涨工资
     *
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * 获取描述信息
     *
     * @return 描述信息
     */
    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    /**
     * Getter method for property <tt>salary</tt>.
     *
     * @return property value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Setter method for property <tt>salary</tt>.
     *
     * @param salary value to be assigned to property salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Getter method for property <tt>hireDay</tt>.
     *
     * @return property value of hireDay
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Setter method for property <tt>hireDay</tt>.
     *
     * @param hireDay value to be assigned to property hireDay
     */
    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /**
     * equals
     *
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) {
            return true;
        }
        // must return false if the explicit parameter is null
        if (otherObject == null) {
            return false;
        }
        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;
        // test whether the fields have identical values
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * hashCode
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    /**
     * toString
     *
     * @return
     */
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
