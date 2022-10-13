package org.djflying.javase.designpattern.patterns.prototype.demo;

import java.io.*;
import java.util.Date;

/**
 * 齐天大圣
 *
 * @author David
 * @version : QiTianDaSheng.java, v 0.1 2020/3/16 10:14 David Exp $$
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    /** 金箍棒 */
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    /**
     * 深克隆
     *
     * @return
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 浅克隆
     *
     * @param target
     * @return
     */
    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return qiTianDaSheng;
    }

}
