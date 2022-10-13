package org.djflying.javase.corejava.inheritance;

/**
 * 人抽象类
 *
 * @author dj4817
 * @version $Id: Person.java, v 0.1 2017/11/11 10:37 dj4817 Exp $$
 */
public abstract class Person {

    /** 名称 */
    protected String name;

    /**
     * 无参构造器
     */
    public Person() {
    }

    /**
    * 全参构造器
    *
    * @param name
    */
    public Person(String name) {
        this.name = name;
    }

    /**
     * 获取描述信息
     *
     * @return 描述信息
     */
    public abstract String getDescription();

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }


}
