package org.djflying.javase.corejava.generic;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Pair Tester
 *
 * @author dj4817
 * @version $Id: PairTest.java, v 0.1 2018/6/12 14:58 dj4817 Exp $$
 */
public class PairTest {

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) {

        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minMax(words);
        System.out.println("the minimum value of the array is: " + mm.getFirst());
        System.out.println("the maximum value of the array is: " + mm.getSecond());
        System.out.println();

        String middle = ArrayAlg.getMiddle("John", "Q.", "Public", "aa", "1", "2", "1");
        System.out.println("the middle value of the array is: " + middle);
        System.out.println();

        String min = ArrayAlg.min(words);
        System.out.println("the minimum value of the array is: " + min);
        System.out.println();

        LocalDate[] birthday = { LocalDate.of(1906, 12, 9), LocalDate.of(1815, 12, 10), LocalDate.of(1903, 12, 3), LocalDate.of(1910, 6, 22) };
        Pair<LocalDate> localDatePair = ArrayAlg.minMax(birthday);
        System.out.println("the minimum value of the localDatePair is: " + localDatePair.getFirst());
        System.out.println("the maximum value of the localDatePair is: " + localDatePair.getSecond());
        System.out.println();

        //Collection<Pair<String>> table = null;
        //Pair<String> pair1 = null;
        //Pair<String> pair2 = null;
        //addAll(table, pair1, pair2);

        Pair<String> stringPair = Pair.makePair(String::new);
        System.out.println(stringPair.getFirst());
        System.out.println(stringPair.getSecond());
        System.out.println();

        Pair<String> stringPair1 = Pair.makePair(String.class);

        String[] strings = ArrayAlg.test(String[]::new, "Tom", "David", "Eric");
        for (String s : strings) {
            System.out.println(s);
        }

    }

    /**
     *
     *
     * @param collection
     * @param ts
     * @param <T>
     */
    @SafeVarargs
    private static <T> void addAll(Collection<T> collection, T... ts) {
        for (T t : ts) {
            collection.add(t);
        }
    }
}
