package org.djflying.javase.designpattern.patterns.proxy.staticproxy.sample;

import org.djflying.javase.designpattern.patterns.proxy.Person;

/**
 * 儿子类
 *
 * @author daijiong
 * @version : Son.java, v 0.1 2020/3/14 19:32 daijiong Exp $$
 */
public class Son implements Person {

    /**
     * 找对象
     */
    @Override
    public void findLove() {
        System.out.println("儿子：我要找美女");
    }
}
