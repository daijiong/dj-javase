package org.djflying.javase.designpattern.patterns.singleton.register;

/**
 * 注册式代码（枚举）
 *
 * @author daijiong
 * @version : EnumSingleton.java, v 0.1 2020/3/13 15:15 daijiong Exp $$
 */
public enum EnumSingleton {

                           INSTANCE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
