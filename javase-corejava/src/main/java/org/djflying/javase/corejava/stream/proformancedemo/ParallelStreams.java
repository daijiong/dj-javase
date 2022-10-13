package org.djflying.javase.corejava.stream.proformancedemo;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 累加
 *
 * @author dj4817
 * @version $Id: A.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
class ParallelStreams {
    /**
     * for循环累加
     * @param n 从1-n进行累加
     * @return 累加结果
     */
    static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    /**
     * Stream顺序累加
     * @param n 从1-n进行累加
     * @return 累加结果
     */
    static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
    }

    /**
     * 并行Stream迭代
     * @param n 从1-n进行累加
     * @return 累加结果
     */
    static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
    }

    /**
     * 用longStream 累加
     * @param n 从1-n进行累加
     * @return 累加结果
     */
    static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);
    }

    /**
     * 用longStream 累加
     * @param n 从1-n进行累加
     * @return 累加结果
     */
    static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }
}
