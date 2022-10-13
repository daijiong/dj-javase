package org.djflying.javase.designpattern.patterns.prototype.demo;

/**
 * 克隆测试类
 *
 * @author David
 * @version : CloneTest.java, v 0.1 2020/3/16 10:14 David Exp $$
 */
public class CloneTest {

    public static void main(String[] args) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            // 深克隆
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.deepClone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng qiTianDaSheng1 = new QiTianDaSheng();
        // 浅克隆
        QiTianDaSheng n = qiTianDaSheng1.shallowClone(qiTianDaSheng1);
        System.out.println("浅克隆：" + (qiTianDaSheng1.jinGuBang == n.jinGuBang));

    }
}
