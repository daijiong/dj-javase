package org.djflying.javase.corejava.objectsandclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 构造器测试类
 *
 * @author dj4817
 * @version $Id: ConstructorTest.java, v 0.1 2017/12/27 16:51 dj4817 Exp $$
 */
public class ConstructorTest {

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
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee("david", 10000);
        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}
