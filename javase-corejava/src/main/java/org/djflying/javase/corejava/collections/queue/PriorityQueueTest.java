package org.djflying.javase.corejava.collections.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * priority queue tester
 *
 * @author dj4817
 * @version $Id: PriorityQueueTest.java, v 0.1 2018/7/17 15:24 dj4817 Exp $$
 */
public class PriorityQueueTest {

    /**
     * This program demonstrates the use of a priority queue.
     *
     * @param args
     */
    public static void main(String[] args) {

        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        // G. Hopper
        pq.add(LocalDate.of(1906, 12, 9));
        // A. Lovelace
        pq.add(LocalDate.of(1815, 12, 10));
        // J. von Neumann
        pq.add(LocalDate.of(1903, 12, 3));
        // K. Zuse
        pq.add(LocalDate.of(1910, 6, 22));
        System.out.println("Iterating over elements...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }
        System.out.println("Removing elements...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

    }
}
