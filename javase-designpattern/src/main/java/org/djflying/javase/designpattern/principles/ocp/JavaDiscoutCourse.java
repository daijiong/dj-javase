package org.djflying.javase.designpattern.principles.ocp;

/**
 * 优惠Java课程
 *
 * @author daijiong
 * @version $Id: JavaDiscoutCourse.java, v 0.1 2019/5/11 11:32 daijiong Exp $$
 */
public class JavaDiscoutCourse extends JavaCourse {


    public JavaDiscoutCourse() {
    }

    public JavaDiscoutCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取原来的价格
     *
     * @return
     */
    public Double getOriginalPrice() {
        return super.getPrice();
    }

    /**
     * 获取优惠之后的价格
     *
     * @return
     */
    public Double getDiscoutPrice() {
        return super.getPrice() * 0.61;
    }
}
