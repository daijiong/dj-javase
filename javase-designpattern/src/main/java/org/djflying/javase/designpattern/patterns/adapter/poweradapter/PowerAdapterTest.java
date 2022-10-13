package org.djflying.javase.designpattern.patterns.adapter.poweradapter;

/**
 * 电源适配器测试类
 *
 * @author daijiong
 * @version : PowerAdapterTest.java, v 0.1 2020/4/3 11:02 daijiong Exp $$
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        // 将220伏交流电插入到电源适配器
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        // 电源适配器输出5伏直流电
        powerAdapter.output();
    }
}
