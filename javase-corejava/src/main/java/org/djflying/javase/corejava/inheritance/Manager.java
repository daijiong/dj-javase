package org.djflying.javase.corejava.inheritance;

import java.time.LocalDate;

/**
 * 经理类
 *
 * @author dj4817
 * @version $Id: Manager.java, v 0.1 2017/11/11 10:37 dj4817 Exp $$
 */
public class Manager extends Employee {

    /** 奖金 */
    private double bonus;

    /**
     * 无参构造器
     */
    public Manager() {
    }

    /**
     * 有参构造器
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        // call the constructor of the Employee superclass with name, salary, year, month and day as parameters.
        // the call using super must be the first statement in the constructor for the subclass.
        super(name, salary, year, month, day);
        bonus = 0;
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
    public Manager(String name, double salary, int year, int month, int day, double bonus) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    /**
     * 获取薪水
     *
     * @return
     */
    @Override
    public double getSalary() {

        // return salary + bonus; it is wrong, because subclass can not access the private field of superclass.
        // use the special keyword super to indicate that we want to call the getSalary method of superclass.
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    /**
     *
     *
     * @return
     */
    public LocalDate getHireDate() {
        return hireDay;
    }

    /**
     * Getter method for property <tt>bonus</tt>.
     *
     * @return property value of bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Setter method for property <tt>bonus</tt>.
     *
     * @param bonus value to be assigned to property bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * equals
     *
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        // When you define the equals method for a subclass, first call equals on the superclass.
        // If that test doesn’t pass, then the objects can’t be equal.
        // super.equals checked that this and other belong to the same class.
        if (!super.equals(otherObject)) {
            return false;
        }
        // If the superclass fields are equal, you are ready to compare the instance fields of the subclass.
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    /**
     * toString
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}