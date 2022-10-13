package org.djflying.javase.designpattern.patterns.adapter.poweradapter;

/**
 * 220伏交流电
 *
 * @author daijiong
 * @version : AC220.java, v 0.1 2020/4/3 10:51 daijiong Exp $$
 */
public class AC220 {

    public Integer output(){
        Integer output = 220;
        System.out.println("输出交流电" + output + "伏");
        return output;
    }
}
