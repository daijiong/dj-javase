package org.djflying.javase.corejava.stream.proformancedemo;

import java.util.function.Function;

/**
 * Stream性能测试
 *
 * @author dj4817
 * @version $Id: A.java, v 0.1 2017/8/25 15:37 dj4817 Exp $$
 */
public class Performance {
    public static void main(String[] args) {
        System.out.println("For sum done in:" + measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
        System.out.println("Stream sum done in:" + measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");
        System.out.println("Parallel Stream sum done in:" + measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + " msecs");
        System.out.println("Long Stream sum done in:" + measureSumPerf(ParallelStreams::rangedSum, 10_000_000) + " msecs");
        System.out.println("Long Stream sum done in:" + measureSumPerf(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs");
    }

    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        //运行10次取最小值
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            if (duration < fastest)
                fastest = duration;
        }
        return fastest;
    }
}
