package org.djflying.javase.corejava.objectsandclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * static关键字功能测试类
 *
 * @author dj4817
 * @version $Id: StaticTest.java, v 0.1 2017/12/27 17:02 dj4817 Exp $$
 */
public class StaticTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000, 1988, 03, 27);
        staff[1] = new Employee("Dick", 60000, 1988, 03, 27);
        staff[2] = new Employee("Harry", 65000, 1988, 03, 27);
        // print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
        // calls static method
        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}
