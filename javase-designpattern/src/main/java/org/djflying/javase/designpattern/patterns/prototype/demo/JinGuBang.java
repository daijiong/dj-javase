package org.djflying.javase.designpattern.patterns.prototype.demo;

import java.io.Serializable;

/**
 * 金箍棒
 *
 * @author David
 * @version : JinGuBang.java, v 0.1 2020/3/16 10:14 David Exp $$
 */
public class JinGuBang implements Serializable {
    /** 高 */
    public float h = 100;
    /**  */
    public float d = 10;

    /**
     * 变长
     */
    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    /**
     * 变短
     */
    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
