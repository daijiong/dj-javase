package org.djflying.javase.corejava.reflection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * MethodTable测试类
 *
 * @author dj4817
 * @version $Id: MethodTableTest.java, v 0.1 2018/1/3 14:55 dj4817 Exp $$
 */
public class MethodTableTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test() throws Exception {

        // get method pointers to the square and sqrt methods
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        // print tables of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * Returns the square of a number
     * @param x a number
     * @return x squared
     */
    public double square(double x) {

        return x * x;
    }

    /**
     * Prints a table with x- and y-values for a method
     * @param from the lower bound for the x-values
     * @param to the upper bound for the x-values
     * @param n the number of rows in the table
     * @param f a method with a double parameter and double return value
     */
    public void printTable(double from, double to, int n, Method f) {

        // print out the method as table header
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            try {
                // 如果是调用类的静态方法，前面的参数可以设置为null
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
