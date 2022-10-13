package org.djflying.javase.designpattern.principles.ls;

/**
 * 正方形类
 *
 * @author daijiong
 * @version $Id: Squre.java, v 0.1 2019/5/12 11:31 daijiong Exp $$
 */
public class Squre extends Rectangle {
    /** 长 */
    private Long length;

    /**
     * Getter method for property <tt>length</tt>.
     *
     * @return property value of length
     */
    public Long getLength() {
        return length;
    }

    /**
     * Setter method for property <tt>length</tt>.
     *
     * @param length value to be assigned to property length
     */
    public void setLength(Long length) {
        this.length = length;
    }
}
