package org.djflying.javase.corejava.objectsandclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 方法的传参测试类
 *
 * @author dj4817
 * @version $Id: ParamTest.java, v 0.1 2017/12/27 16:54 dj4817 Exp $$
 */
public class ParamTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * Methods can't modify numeric parameters
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);
    }

    /**
     * Methods can change the state of object parameters
     * 
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {

        System.out.println("Testing tripleSalary:");
        Employee harry = new Employee("Harry", 75000, 1988, 03, 27);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());
    }

    /**
     * Methods can't attach new objects to object parameters
     * 
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {

        System.out.println("Testing swap:");
        Employee a = new Employee("Alice", 70000, 1988, 03, 27);
        Employee b = new Employee("Bob", 60000, 1987, 03, 27);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    /**
     * 加倍方法
     *
     * @param x
     */
    public void tripleValue(double x) {

        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    /**
     * 加倍Salary方法
     *
     * @param x
     */
    public void tripleSalary(Employee x) {

        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    /**
     * 交换方法
     *
     * @param x
     * @param y
     */
    public void swap(Employee x, Employee y) {

        // x refers to Alice, y to Bob
        Employee temp = x;
        // temp refers to Alice
        x = y;
        // x refers to Bob
        y = temp;
        // y refers to Alice
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}
