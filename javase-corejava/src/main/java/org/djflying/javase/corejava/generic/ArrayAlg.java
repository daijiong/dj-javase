package org.djflying.javase.corejava.generic;

import java.util.function.IntFunction;

/**
 * Array operator
 *
 * @author dj4817
 * @version $Id: ArrayAlg.java, v 0.1 2018/6/12 15:04 dj4817 Exp $$
 */
public class ArrayAlg {

    /**
     * gets the minimum and maximum of an array of strings
     *
     * @param strings an array of strings
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static Pair<String> minMax(String[] strings) {

        if (null == strings || strings.length == 0) {
            return null;
        }
        String min = strings[0];
        String max = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if (min.compareTo(strings[i]) > 0) {
                min = strings[i];
            }
            if (max.compareTo(strings[i]) < 0) {
                max = strings[i];
            }
        }
        return new Pair<>(min, max);
    }

    /**
     * get the middle value of an array of T
     *
     * @param t an array of T
     * @param <T> the type of return value
     * @return the middle value of an array of T
     */
    public static <T> T getMiddle(T... t) {

        return t[t.length / 2];
    }

    /**
     * compute the smallest element of an array of T
     *
     * @param t an array of T
     * @param <T> the type of return value
     * @return the smallest element
     */
    public static <T extends Comparable> T min(T[] t) {

        if (null == t || t.length == 0) {
            return null;
        }
        T smallest = t[0];
        for (int i = 0; i < t.length; i++) {
            if (smallest.compareTo(t[i]) > 0) {
                smallest = t[i];
            }
        }
        return smallest;
    }

    /**
     * gets the minimum and maximum of an array of T
     *
     * @param t an array of T
     * @param <T> the type of return value
     * @return a pair with the min and max value, or null if a is null or empty
     */
    public static <T extends Comparable> Pair<T> minMax(T[] t) {

        if (null == t || t.length == 0) {
            return null;
        }
        T min = t[0];
        T max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (min.compareTo(t[i]) > 0) {
                min = t[i];
            }
            if (max.compareTo(t[i]) < 0) {
                max = t[i];
            }
        }
        return new Pair<>(min, max);
    }

    /**
     *
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T[] test(IntFunction<T[]> constr, T... t) {
        T[] a = constr.apply(t.length);
        for (int i = 0; i < t.length; i++) {
            a[i] = t[i];
        }
        return a;
    }
}
