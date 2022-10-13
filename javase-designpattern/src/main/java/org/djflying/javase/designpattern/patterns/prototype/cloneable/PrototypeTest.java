package org.djflying.javase.designpattern.patterns.prototype.cloneable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom.
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // 创建一个原型对象
        CloneablePrototype cloneablePrototype = new CloneablePrototype();
        // 填充属性，方便测试
        cloneablePrototype.setAge(18);
        cloneablePrototype.setName("prototype");
        List hobbies = new ArrayList<String>();
        hobbies.add("书法");
        hobbies.add("美术");
        cloneablePrototype.setHobbies(hobbies);

        // 浅克隆
//        CloneablePrototype clone = cloneablePrototype.clone();
        // 序列化方式深克隆
//        CloneablePrototype clone = cloneablePrototype.deepClone();
        // 使用ArrayList中的clone()方法克隆列表
        CloneablePrototype clone = cloneablePrototype.deepCloneHobbies();
        clone.getHobbies().add("技术");

        System.out.println("原型对象：" + cloneablePrototype);
        System.out.println("克隆对象：" + clone);
        System.out.println("对象地址：" + (clone == cloneablePrototype));

        System.out.println("克隆对象中的hobbies引用类型地址值：" + clone.getHobbies());
        System.out.println("原型对象中的hobbies引用类型地址值：" + cloneablePrototype.getHobbies());
        System.out.println("hobbies引用地址比较：" + (clone.getHobbies() == cloneablePrototype.getHobbies()));

    }
}
