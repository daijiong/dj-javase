package org.djflying.javase.corejava.stream.dishdemo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Description
 *
 * @author dj4817
 * @version $Id: DishDemo.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class DishDemo {

    public static void main(String[] args) {

        Dish pork = new Dish("pork", false, 800, Type.MEAT);
        Dish beef = new Dish("beef", false, 700, Type.MEAT);
        Dish chicken = new Dish("chicken", false, 400, Type.MEAT);
        Dish frenchFries = new Dish("french fries", true, 530, Type.OTHER);
        Dish rice = new Dish("rice", true, 350, Type.OTHER);
        Dish seasonFruit = new Dish("season fruit", true, 120, Type.OTHER);
        Dish pizza = new Dish("pizza", true, 550, Type.OTHER);
        Dish prawns = new Dish("prawns", false, 300, Type.FISH);
        Dish salmon = new Dish("salmon", false, 450, Type.FISH);

        List<Dish> menu = Arrays.asList(pork, beef, chicken, frenchFries, rice, seasonFruit, pizza, prawns, salmon);

        /**
         * filter——过滤，找出素食菜单
         *
         */

        List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());

        //distinct——去重
        List<Dish> vegetarianMenuDistinct = menu.stream().filter(Dish::isVegetarian).distinct().collect(Collectors.toList());

        //limit——截短
        List<Dish> vegetarianMenuTop3 = menu.stream().filter(Dish::isVegetarian).limit(3).collect(Collectors.toList());

        //skip——跳过
        List<Dish> vegetarianMenuSkip3 = menu.stream().filter(Dish::isVegetarian).skip(3).collect(Collectors.toList());

        //map——映射，获取菜的名字
        List<String> dishNames = menu.stream().map(Dish::getName).collect(Collectors.toList());

        //flatMap——扁平化映射，获取菜的名字中不重复的字母列表
        List<String[]> dishNamesWordsError = dishNames.stream()//获得一个字符串流
            .map(word -> word.split(""))//对每个字符串做切割，返回一个string[]流
            .distinct()//对string[]去重，这里不是我们想要的
            .collect(Collectors.toList());//返回结果List<String[]>

        List<String> dishNamesWords = dishNames.stream()//获得一个字符串流
            .map(word -> word.split(""))//对每个字符串做切割，返回一个string[]流
            .flatMap(Arrays::stream)//将string[] 转换成string的流
            .distinct()//对string[]去重，这里不是我们想要的
            .collect(Collectors.toList());//返回结果List<String[]>

        //anyMatch匹配任何一个
        boolean anyMatch = menu.stream().anyMatch(Dish::isVegetarian);

        //allMatch匹配全部
        boolean allMatch = menu.stream().allMatch(dish -> dish.getCalories() < 100);

        //noneMatch-全部不匹配
        boolean noneMatch = menu.stream().noneMatch(dish -> dish.getCalories() > 1000);

        //findFirst 查找第一个
        Optional<Dish> first = menu.stream().findFirst();

        //findAny 查找任意一个
        Optional<Dish> any = menu.stream().findAny();

        //reduce 归约，计算菜单的总热量
        Integer reduce = menu.stream().map(Dish::getCalories).reduce(0, (a, b) -> a + b);
        //求最大热量(存在装箱成本）
        Optional<Integer> reduceOptional = menu.stream().map(Dish::getCalories).reduce(Integer::max);

        //数值流 计算菜单的总热量
        Integer sumCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        int sum = menu.stream().mapToInt(Dish::getCalories).sum();

        //预定义收集器，Collectors
        //获取最大值
        Optional<Dish> max = menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::getCalories)));
        Optional<Dish> maxSimplify = menu.stream().max(Comparator.comparing(Dish::getCalories));

        //获取热量平均值
        Double average = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));

        //获取概要信息
        IntSummaryStatistics summarize = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));

        //将菜单中的菜按类型分组
        Map<Type, List<Dish>> typeListMap = menu.stream().collect(Collectors.groupingBy(Dish::getType));

    }
}
