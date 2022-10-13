package org.djflying.javase.designpattern.patterns.prototype.simple;

import lombok.Data;

/**
 * Created by Tom.
 */
@Data
public class Prototype implements IPrototype {

    private int    age;
    private String name;

    /**
     * 浅克隆
     * @return
     */
    @Override
    public Prototype clone() {
        Prototype prototype = new Prototype();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "Prototype{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
