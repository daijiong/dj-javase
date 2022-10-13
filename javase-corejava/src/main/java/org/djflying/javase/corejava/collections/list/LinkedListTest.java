package org.djflying.javase.corejava.collections.list;

import java.util.*;

/**
 * linked list tester
 *
 * @author dj4817
 * @version $Id: LinkedListTest.java, v 0.1 2018/7/13 14:41 dj4817 Exp $$
 */
public class LinkedListTest {

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) {

        testIterator();
        testListIterator();
        testConcurrentModificationException();
        finalTest();

    }

    /**
     * This program demonstrates operations on linked lists.
     */
    private static void finalTest() {

        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // merge the words from b into a
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()) {
            if (aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println(a);

        // remove every second word from b
        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next(); // skip one element
            if (bIter.hasNext()) {
                bIter.next(); // skip next element
                bIter.remove(); // remove that element
            }
        }
        System.out.println(b);

        // bulk operation: remove all words in b from a
        a.removeAll(b);
        System.out.println(a);

    }

    /**
     * test ConcurrentModificationException
     */
    private static void testConcurrentModificationException() {

        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        System.out.println(staff);
        ListIterator<String> listIterator = staff.listIterator();
        ListIterator<String> listIterator2 = staff.listIterator();

        //listIterator.next();
        //listIterator.remove();
        //listIterator2.next(); // will throw ConcurrentModificationException

        listIterator.next();
        listIterator.set("David");
        listIterator2.next(); // won't throw ConcurrentModificationException
        System.out.println(staff);
        System.out.println();

    }

    /**
     * test list iterator
     */
    private static void testListIterator() {

        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> listIterator = staff.listIterator();
        System.out.println(staff);
        // add a new element(David) before the first element
        listIterator.add("David");
        System.out.println("add a new element " + listIterator.previous());
        System.out.println(staff);
        // skip past the first element(David)
        listIterator.next();
        // add two new elements before the second element
        listIterator.add("Julit");
        listIterator.add("Julit1");
        System.out.println("add two new elements");
        System.out.println(staff);
        listIterator.previous();
        listIterator.remove();
        System.out.println("remove an element");
        System.out.println(staff);
        System.out.println();

    }

    /**
     * test iterator
     */
    private static void testIterator() {

        List<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        System.out.println(staff);
        Iterator<String> iterator = staff.iterator();
        String first = iterator.next();
        System.out.println("the first staff is " + first);
        // skip past the second element
        iterator.next();
        System.out.println("remove the second staff");
        // remove last visited element, here it is the second element 'Bob'
        iterator.remove();
        System.out.println(staff);
        String third = iterator.next();
        System.out.println("the third staff is " + third);
        System.out.println();
    }
}
