package org.djflying.javase.corejava.collections.set;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * tree set tester
 *
 * @author dj4817
 * @version $Id: TreeSetTest.java, v 0.1 2018/7/17 15:08 dj4817 Exp $$
 */
public class TreeSetTest {

    /**
     * This program sorts a set of item by comparing their descriptions.
     *
     * @param args
     */
    public static void main(String[] args) {

        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);
        NavigableSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

    }
}
