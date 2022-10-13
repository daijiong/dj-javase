package org.djflying.javase.designpattern.principles.ocp;

/**
 * Java课程
 *
 * @author daijiong
 * @version $Id: JavaCourse.java, v 0.1 2019/5/11 11:29 daijiong Exp $$
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse() {
    }

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
