package org.djflying.javase.corejava.generic;

import java.util.function.Supplier;

/**
 * Description
 *
 * @author dj4817
 * @version $Id: Pair.java, v 0.1 2018/6/12 14:51 dj4817 Exp $$
 */
public class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * make a Pair
     *
     * @param constr
     * @param <T>
     * @return
     */
    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }

    /**
     * make a Pair
     *
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> Pair<T> makePair(Class<T> cls){
        try {
            return new Pair<>(cls.newInstance(), cls.newInstance());
        } catch (Exception e) {
            return null;
        } 
    }

    /**
     * Getter method for property <tt>first</tt>.
     *
     * @return property value of first
     */
    public T getFirst() {
        return first;
    }

    /**
     * Setter method for property <tt>first</tt>.
     *
     * @param first value to be assigned to property first
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * Getter method for property <tt>second</tt>.
     *
     * @return property value of second
     */
    public T getSecond() {
        return second;
    }

    /**
     * Setter method for property <tt>second</tt>.
     *
     * @param second value to be assigned to property second
     */
    public void setSecond(T second) {
        this.second = second;
    }
}
