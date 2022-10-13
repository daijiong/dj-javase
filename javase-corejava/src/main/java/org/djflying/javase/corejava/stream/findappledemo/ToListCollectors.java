package org.djflying.javase.corejava.stream.findappledemo;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * 自定义收集器，实现toList功能
 * Created by ls07234 on 2017/8/4.
 */
public class ToListCollectors<T> implements Collector<T, List<T>, List<T>> {

    /**
     * 一个供应源，用来得到收集累加结果的对象
     * @return 一个()->T 方法，无入参，出参是一个结果收集对象，比如toList里的List
     */
    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }

    /**
     * 累加器，用来计算累加的操作,需要给泛型<List<T>,T>
     * @return 一个（A,T)->void，入参是累加的结果和流中的下一个元素，无出参，比如toList里将T累加到A
     */
    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }

    /**
     * 合并操作，因为计算可能是分块的，最后需要将收集器合并起来，比如toList中，两个List合并
     * @return 一个（T,T)->T方法
     */
    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    /**
     * 结束方法，收集器收集完成后的处理,比如toList收集后的结果List即为返回的类型，所以不需要转换
     * @return 一个A->R
     */
    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, Characteristics.CONCURRENT));
    }
}
