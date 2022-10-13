package org.djflying.javase.corejava.stream.findappledemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 找苹果，可能有很多可以根据重量，或根据颜色
 *
 * @author dj4817
 * @version $Id: A.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class FindApple {

    /**
     * 测试主方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //测试数据
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("yellow", 10));
        inventory.add(new Apple("red", 6));
        inventory.add(new Apple("green", 9));

        //Demo1 原始方法调用
        new FindApple().findGreenApple1(inventory);
        new FindApple().findWeightApple1(inventory);

        //Demo2 策略模式使用
        new FindApple().findApple(inventory, new AppleCheckColorImpl());
        new FindApple().findApple(inventory, new AppleCheckWeightImpl());

        //Demo3 匿名函数简化使用
        new FindApple().findApple(inventory, apple -> apple.color.equals("green"));
        new FindApple().findApple(inventory, new AppleCheck() {
            @Override
            public boolean check(Apple apple) {
                return apple.weight > 150;
            }
        });
        //Lambda简化使用(Java8)
        new FindApple().findApple(inventory, apple -> apple.color.equals("green"));
        new FindApple().findApple(inventory, apple -> apple.weight > 150);

        //Demo4 使用流,抽象List类型(Java8，并行，stream可用于所有Collection)
        inventory.stream().filter(apple -> apple.color.equals("green")).collect(Collectors.toList());
        inventory.stream().filter(apple -> apple.weight > 150).collect(Collectors.toList());
        //自定义collectors
        List<Apple> collect = inventory.stream().filter(apple -> apple.weight > 150).collect(new ToListCollectors<>());

    }

    /**
     * Demo1 最原始的实现
     *
     * @param inventory
     * @return
     */
    public List<Apple> findGreenApple1(List<Apple> inventory) {
        List<Apple> list = new ArrayList<>();
        for (Apple a : inventory) {
            if (a.color.equals("green")) {
                list.add(a);
            }
        }
        return list;
    }

    /**
     * Demo1 最原始的实现
     *
     * @param inventory
     * @return
     */
    public List<Apple> findWeightApple1(List<Apple> inventory) {
        List<Apple> list = new ArrayList<>();
        for (Apple a : inventory) {
            if (a.weight > 150) {
                list.add(a);
            }
        }
        return list;
    }

    //Demo2 策略模式，传递方法，行为参数化
    public List<Apple> findApple(List<Apple> inventory, AppleCheck check) {
        List<Apple> list = new ArrayList<>();
        for (Apple a : inventory) {
            if (check.check(a)) {
                list.add(a);
            }
        }
        return list;
    }
    //Demo2 end
}
