package org.djflying.javase.corejava.objectsandclasses;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 * 雇员类
 *
 * @author dj4817
 * @version $Id: Employee.java, v 0.1 2017/11/7 12:21 dj4817 Exp $$
 */
public class Employee {

    /** 使用实例方法初始化实例变量 */
    private int        id         = assignId();
    /** 使用常量初始化实例变量 */
    private String     name       = "";
    /** 实例变量 */
    private double     salary;
    /** 实例变量 */
    private LocalDate  hireDay;
    /** 实例变量 */
    private Date       hireDate;
    /** 静态变量nextId */
    private static int nextId     = 1;
    /** 常量createDate */
    private final Date createDate = new Date();

    /**
     * static initialization block
     */
    static {
        System.out.println("start static initialization block");
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    /**
     * object initialization block
     */
    {
        System.out.println("start object initialization block");
        id = nextId;
        nextId++;
    }

    /**
     * the default constructor
     *
     */
    public Employee() {

        System.out.println("start the default constructor");
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    /**
     * constructor with one parameter
     *
     * @param s
     */
    public Employee(double s) {

        // calls the Employee(String, double) constructor
        // 注意：对this的调用必须是构造器中的第一个语句
        this("Employee #" + nextId, s);
        System.out.println("start constructor with one parameter");
    }

    /**
     * constructor with two parameters
     *
     * @param n
     * @param s
     */
    public Employee(String n, double s) {

        System.out.println("start constructor with two parameters");
        name = n;
        salary = s;
    }

    /**
     * constructor with full parameters
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Employee(String name, double salary, int year, int month, int day) {

        System.out.println("start constructor with full parameters");
        // 如果构造函数的参数的名字和实例域的名字相同则，必须使用this关键字来赋值
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        this.hireDate = new Date(year, month, day);
    }

    /**
     * static method
     *
     * @return
     */
    public static int getNextId() {

        System.out.println("start static method");
        // returns static field
        return nextId;
    }

    /**
     * 初始化Id
     *
     * @return
     */
    private int assignId() {

        int i = nextId;
        nextId++;
        return i;
    }

    /**
     * 涨薪
     *
     * @param byPercent 涨薪比例
     */
    public void raiseSalary(double byPercent) {

        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * set id to next available id
     */
    public void setId() {

        id = nextId;
        nextId++;
    }

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
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
     * Getter method for property <tt>hireDay</tt>.
     *
     * @return property value of hireDay
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Getter method for property <tt>hireDate</tt>.
     *
     * @return property value of hireDate
     */
    public Date getHireDate() {
        // If you need to return a reference to a mutable object, you should clone it first.
        return (Date) hireDate.clone();
    }

    /**
     * Getter method for property <tt>createDate</tt>.
     *
     * @return property value of createDate
     */
    public Date getCreateDate() {
        return (Date) createDate.clone();
    }

    /**
     * unit test
     *
     * @param args
     */
    public static void main(String[] args) {

        Employee e = new Employee("Harry", 50000, 1988, 03, 27);
        e.setId();
        System.out.println(e.getName() + " " + e.getSalary());
        System.out.println(e.getId());
        System.out.println(Employee.getNextId());
        System.out.println(e.getCreateDate());
    }
}
