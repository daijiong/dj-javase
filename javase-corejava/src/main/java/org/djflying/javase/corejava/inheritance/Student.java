package org.djflying.javase.corejava.inheritance;

/**
 * 学生类
 *
 * @author dj4817
 * @version $Id: Student.java, v 0.1 2017/11/11 10:37 dj4817 Exp $$
 */
public class Student extends Person {

    /** 专业 */
    private String major;

    /**
     * 无参构造器
     */
    public Student() {
    }

    /**
     * 全参构造器
     *
     * @param name
     * @param major
     */
    public Student(String name, String major) {

        super(name);
        this.major = major;
    }

    /**
     * 获取描述信息
     *
     * @return 描述信息
     */
    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }

}
