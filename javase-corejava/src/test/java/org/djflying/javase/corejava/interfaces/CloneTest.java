package org.djflying.javase.corejava.interfaces;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * 克隆功能测试类
 *
 * @author dj4817
 * @version $Id: CloneTest.java, v 0.1 2018/1/9 12:39 dj4817 Exp $$
 */
public class CloneTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        Employee original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original.toString());
        System.out.println("copy=" + copy);
    }

    @Test
    public void testArrayClone() throws Exception {

        int[] luckNumbers = { 2, 3, 5, 5, 2, 6, 8 };
        System.out.println("before cloned:" + Arrays.toString(luckNumbers));
        int[] cloned = luckNumbers.clone();
        cloned[0] = 9;
        System.out.println("after cloned:" + Arrays.toString(cloned));
    }
}
