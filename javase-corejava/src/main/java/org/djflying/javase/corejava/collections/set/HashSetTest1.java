package org.djflying.javase.corejava.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: HashSetTest1.java, v 0.1 2019/2/27 14:54 daijiong Exp $$
 */
public class HashSetTest1 {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        System.out.println("get the first entry from a set:");
        System.out.println(hashSet.iterator().next());
        System.out.println(hashSet.stream().findFirst().get());


    }
}
