package org.djflying.javase.corejava.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * lambda表达式测试类
 *
 * @author dj4817
 * @version $Id: lambdaTest.java, v 0.1 2018/1/9 16:05 dj4817 Exp $$
 */
public class lambdaTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
