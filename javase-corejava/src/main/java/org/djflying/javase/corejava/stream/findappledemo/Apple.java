package org.djflying.javase.corejava.stream.findappledemo;

/**
 * 苹果
 *
 * @author dj4817
 * @version $Id: Apple.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class Apple {

    /**
     * 重量
     */
    public Integer weight;
    /**
     * 颜色
     */
    public String  color;

    /**
     * 构造函数
     *
     * @param weight
     */
    public Apple(Integer weight) {
        this.weight = weight;
    }

    /**
     * 构造函数
     *
     * @param color
     * @param weight
     */
    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}