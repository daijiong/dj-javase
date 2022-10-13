package org.djflying.javase.corejava.io.serialclone;

/**
 * SerialClone Tester
 *
 * @author dj4817
 * @version $Id: SerialCloneTest.java, v 0.1 2018/5/17 14:36 dj4817 Exp $$
 */
public class SerialCloneTest {

    /**
     * the main method
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
        // clone harry
        Employee harry2 = (Employee) harry.clone();
        // mutate harry
        harry.raiseSalary(10);
        // now harry and the clone are different
        System.out.println(harry);
        System.out.println(harry2);
    }
}
