package org.djflying.javase.designpattern.patterns.adapter.poweradapter;

/**
 * 电源适配器
 *
 * @author daijiong
 * @version : PowerAdapter.java, v 0.1 2020/4/3 10:56 daijiong Exp $$
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    /**
     * 输出5伏直流电
     *
     * @return
     */
    @Override
    public Integer output() {
        Integer ac220Output = ac220.output();
        // 220伏交流电转化为5伏直流电
        Integer dc5Output = ac220Output / 44;
        System.out.println("经过电源适配器转化，将" + ac220Output + "伏交流电转化为" + dc5Output + "伏直流电");
        return dc5Output;
    }
}
