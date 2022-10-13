package org.djflying.javase.corejava.inheritance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Manager测试类
 *
 * @author dj4817
 * @version $Id: ManagerTest.java, v 0.1 2018/1/3 14:54 dj4817 Exp $$
 */
public class ManagerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        // fill the staff array with Manager and Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }

    /**
     * test casting
     *
     * @throws Exception
     */
    @Test
    public void testCast() throws Exception {

        Employee employee = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        // using instanceof to find out whether a cast will succeed before attempting it.
        if (employee instanceof Manager) {
            Manager m = (Manager) employee;
        } else {
            System.out.println("e1 can not cast Manager");
        }
    }
}
