package org.djflying.javase.corejava.stream.dishdemo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Description
 *
 * @author dj4817
 * @version $Id: SpecialStream.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class SpecialStream {

    public void SpecialStream() {

        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT), new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER), new Dish("rice", true, 350, Type.OTHER), new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER), new Dish("prawns", false, 300, Type.FISH), new Dish("salmon", false, 450, Type.FISH));

        //求总热量
        menu.stream().mapToInt(Dish::getCalories).sum();

        //分组
        Map<Type, List<Dish>> collect = menu.stream().collect(Collectors.groupingBy(Dish::getType));

        //返回最大卡路里的菜
        menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::getCalories))).ifPresent(d -> System.out.println(d.toString()));

        //求总卡路里
        Integer integer = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        Integer integer2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println(integer);
        System.out.println(integer2);

        //求平均卡路里
        Double aDouble = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(aDouble);

        //汇总信息IntSummaryStatistics{count=9, sum=4200, min=120, average=466.666667, max=800}
        IntSummaryStatistics collect1 = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println(collect1);

        //输出菜名
            String s = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
        System.out.println(s);

    }
}
