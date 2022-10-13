package org.djflying.javase.designpattern.patterns.proxy.dynamicproxy.jdk;

import org.djflying.javase.designpattern.patterns.proxy.Person;

/**
 * 女孩
 *
 * @author daijiong
 * @version : Girl.java, v 0.1 2020/3/14 20:47 daijiong Exp $$
 */
public class Girl implements Person {

    /**
     * 找对象
     */
    @Override
    public void findLove() {
        System.out.println("女孩：我要找帅哥男朋友");
    }
}
