package org.djflying.javase.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * hash map tester
 *
 * @author dj4817
 * @version $Id: HashMapTest.java, v 0.1 2018/7/17 16:01 dj4817 Exp $$
 */
public class HashMapTest {

    /**
     * the main method
     *
     * @param args
     */
    public static void main(String[] args) {

        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));
        // print all entries
        System.out.println("1. all entries:" + staff);
        // remove an entry
        staff.remove("567-24-2546");
        // replace an entry
        staff.put("456-62-5527", new Employee("Francesca Miller"));
        // look up a value
        System.out.println("2. get method:" + staff.get("157-62-7935"));
        // look up a value which is not existed in the map
        System.out.println("3. getOrDefault method:" + staff.getOrDefault("asd", new Employee("David Dai")));
        // iterate through all entries
        System.out.println("4. forEach:");
        staff.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

    }
}
