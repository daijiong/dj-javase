package org.djflying.javase.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author daijiong
 * @version $Id: HashMapTest1.java, v 0.1 2019/3/6 21:56 daijiong Exp $$
 */
public class HashMapTest1 {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>(10);
        hashMap.put("周瑜", "周瑜");
        hashMap.put("曹操", "曹操");
        hashMap.put("刘备", "刘备");
        hashMap.put("孙权", "孙权");
        hashMap.put("诸葛亮", "诸葛亮");

        for (String key : hashMap.keySet()) {
            int hashCode = key.hashCode();
            System.out.println(String.format("%s的hashcode是%s", key, hashCode));

        }
    }
}
