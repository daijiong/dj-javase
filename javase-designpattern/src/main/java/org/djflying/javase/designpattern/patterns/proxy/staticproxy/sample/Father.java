package org.djflying.javase.designpattern.patterns.proxy.staticproxy.sample;

/**
 * 父亲类
 *
 * @author daijiong
 * @version : Father.java, v 0.1 2020/3/14 19:33 daijiong Exp $$
 */
public class Father {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("老爸：老爸给你去物色相亲对象");
        son.findLove();
        System.out.println("老爸：儿子，我只能帮你到这里了，剩下的就靠你自己了");
    }
}
