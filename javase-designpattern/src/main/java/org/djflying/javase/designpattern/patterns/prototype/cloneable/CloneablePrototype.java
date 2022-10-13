package org.djflying.javase.designpattern.patterns.prototype.cloneable;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom.
 */
@Data
public class CloneablePrototype implements Cloneable, Serializable {

    private int    age;
    private String name;
    private List   hobbies;

    /**
     * 浅克隆
     * @return
     */
    @Override
    public CloneablePrototype clone() {
        try {
            return (CloneablePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 序列化方式深克隆
     * @return
     */
    public CloneablePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (CloneablePrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深拷贝
     * @return
     */
    public CloneablePrototype deepCloneHobbies() {
        try {
            CloneablePrototype clone = (CloneablePrototype) super.clone();
            clone.hobbies = (List) ((ArrayList) clone.getHobbies()).clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "CloneablePrototype{" + "age=" + age + ", name='" + name + '\'' + ", hobbies=" + hobbies + '}';
    }

}
