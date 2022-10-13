package org.djflying.javase.corejava.collections.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the shuffle method of collections tester
 *
 * @author dj4817
 * @version $Id: ShuffleTest.java, v 0.1 2018/7/19 17:54 dj4817 Exp $$
 */
public class ShuffleTest {

    /**
     * This program demonstrates the random shuffle and sort algorithms.
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            integers.add(i);
        }
        System.out.println("the original list");
        System.out.println(integers);
        Collections.shuffle(integers);
        System.out.println("after shuffling");
        System.out.println(integers);
        List<Integer> winningCombination = integers.subList(0, 6);
        System.out.println("the first six elements of list");
        System.out.println(winningCombination);
        Collections.sort(winningCombination);
        System.out.println("after sorting");
        System.out.println(winningCombination);

    }
}
