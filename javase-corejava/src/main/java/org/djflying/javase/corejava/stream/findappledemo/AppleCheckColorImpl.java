package org.djflying.javase.corejava.stream.findappledemo;


/**
 * Description
 *
 * @author dj4817
 * @version $Id: A.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class AppleCheckColorImpl implements AppleCheck {

    @Override
    public boolean check(Apple apple) {
        return apple.color.equals("green");
    }
}
