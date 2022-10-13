package org.djflying.javase.corejava.inheritance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * ArrayList测试类
 *
 * @author dj4817
 * @version $Id: ArrayListTest.java, v 0.1 2018/1/3 14:51 dj4817 Exp $$
 */
public class ArrayListTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        // fill the staff array list with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Te ster", 40000, 1990, 3, 15));
        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}
