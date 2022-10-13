package org.djflying.javase.corejava.objectsandclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Employee测试类
 *
 * @author dj4817
 * @version $Id: EmployeeTest.java, v 0.1 2017/12/27 16:52 dj4817 Exp $$
 */
public class EmployeeTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * 测试Employee
     *
     * @throws Exception
     */
    @Test
    public void testEmployee() throws Exception {

        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }

    /**
     * 测试get方法
     *
     * Be careful not to write accessor methods that return references to mutable objects
     *
     * @throws Exception
     */
    @Test
    public void testAccessor() throws Exception {

        Employee david = new Employee("david", 75000, 1988, 03, 27);
        Date hireDate = david.getHireDate();
        long tensYearsInMilliSeconds = 10 * 365 * 24 * 60 * 60 * 1000;
        // 对hireDate的修改会改变david实例中的hireDate的实例变量的值
        hireDate.setTime(hireDate.getTime() + tensYearsInMilliSeconds);
        System.out.println(hireDate);
        System.out.println(david.getHireDate());
    }
}
