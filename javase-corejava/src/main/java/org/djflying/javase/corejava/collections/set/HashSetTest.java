package org.djflying.javase.corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * hash set tester
 *
 * @author dj4817
 * @version $Id: HashSetTest.java, v 0.1 2018/7/17 14:35 dj4817 Exp $$
 */
public class HashSetTest {

    /**
     * This program uses a set to print all unique words in System.in.
     *
     * @param args
     */
    public static void main(String[] args) {

        // HashSet implements Set
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }
        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");

    }
}
