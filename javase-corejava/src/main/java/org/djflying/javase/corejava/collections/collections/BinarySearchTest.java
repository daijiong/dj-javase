package org.djflying.javase.corejava.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the binarySearch method of collections tester
 *
 * @author dj4817
 * @version $Id: BinarySearchTest.java, v 0.1 2018/7/20 15:02 dj4817 Exp $$
 */
public class BinarySearchTest {

    /**
     * This program demonstrates the binarySearch algorithms.
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            integers.add(i);
        }
        int i = Collections.binarySearch(integers, 20);
        System.out.println(i);
        System.out.println(integers.get(i));

    }
}
