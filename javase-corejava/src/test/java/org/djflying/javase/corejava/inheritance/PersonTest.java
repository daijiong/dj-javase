package org.djflying.javase.corejava.inheritance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Person测试类
 *
 * @author dj4817
 * @version $Id: PersonTest.java, v 0.1 2018/1/3 14:58 dj4817 Exp $$
 */
public class PersonTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        // fill the people array with Student and Employee objects
        Person[] people = new Person[2];
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        // print out names and descriptions of all Person objects
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
