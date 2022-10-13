package org.djflying.javase.corejava.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * some simple algorithms tester
 *
 * @author dj4817
 * @version $Id: SimpleAlgorithmsTest.java, v 0.1 2018/7/20 15:11 dj4817 Exp $$
 */
public class SimpleAlgorithmsTest {

    /**
     * This program demonstrates some simple algorithms.
     *
     * @param args
     */
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            strings.add("david" + i);
        }
        System.out.println("the original list");
        System.out.println(strings);
        strings.removeIf(s -> {
            String lastIndex = s.substring(s.length() - 1, s.length());
            return Integer.valueOf(lastIndex) % 2 == 0;
        });
        System.out.println("after removeIf method");
        System.out.println(strings);
        strings.replaceAll(String::toLowerCase);
        System.out.println("after replaceAll method");
        System.out.println(strings);

    }
}
