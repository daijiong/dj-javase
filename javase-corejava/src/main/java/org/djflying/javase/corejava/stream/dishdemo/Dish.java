package org.djflying.javase.corejava.stream.dishdemo;

/**
 * 一盘菜
 *
 * @author dj4817
 * @version $Id: Dish.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class Dish {

    /**
     * 名称
     */
    private final String  name;
    /**
     * 是否是素食
     */
    private final boolean vegetarian;
    /**
     * 卡路里
     */
    private final int     calories;
    /**
     * 类型
     */
    private final Type    type;

    /**
     * 构造函数
     *
     * @param name
     * @param vegetarian
     * @param calories
     * @param type
     */
    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" + "name='" + name + '\'' + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + '}';
    }
}
