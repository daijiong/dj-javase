package org.djflying.javase.designpattern.principles.ls;

/**
 * 长方形类
 *
 * @author daijiong
 * @version $Id: Rectangle.java, v 0.1 2019/5/12 11:29 daijiong Exp $$
 */
public class Rectangle {
    /** 高 */
    private Long height;
    /** 宽 */
    private Long width;

    /**
     * Getter method for property <tt>height</tt>.
     *
     * @return property value of height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Setter method for property <tt>height</tt>.
     *
     * @param height value to be assigned to property height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * Getter method for property <tt>width</tt>.
     *
     * @return property value of width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Setter method for property <tt>width</tt>.
     *
     * @param width value to be assigned to property width
     */
    public void setWidth(Long width) {
        this.width = width;
    }
}
