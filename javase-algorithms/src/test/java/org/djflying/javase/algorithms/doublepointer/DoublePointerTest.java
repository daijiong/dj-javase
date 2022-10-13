package org.djflying.javase.algorithms.doublepointer;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author wyj40124
 * @version Id: DoublePointerTest, v 0.1 2018/1/9 9:23 wyj40124 Exp $
 */
public class DoublePointerTest {

    private static final int[] num     = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private static final int   summary = 7;

    /* -----------------示例1 求一个有序数组中和为n的元素----------------- */

    /**
     * 【例子1】 ：求一个有序数组中和=8的下标。
     * 设置两个不同的指针 ，或者头，或者尾。在一个递增的序列中，
     * 根据结果分类，说明指针的下一步应该怎么移动。
     * 结果分类：
     * a[i]+b[j]==8则i++，j- -都相互靠近;
     * a[i]+b[j] < 8 ,需要移动指针i ,i++;
     * a[i]+b[j] > 8 ,需要移动指针j ,j- -;
     *
     * 【知识点】
     * 一个while循环+3个条件判断语句来控制指针的走向：
     */
    @Test
    public void 双指针算法求一个有序数组中和为n的下标() throws Exception {
        int i = 0;
        int j = num.length - 1;
        int count = 0;
        while (i < j) {
            if (num[i] + num[j] == summary) {
                System.out.println("双指正计算,结果:" + num[i] + "+" + num[j] + "=" + summary);
                i++;
                j--;
            } else if (num[i] + num[j] > summary) {
                j--;
            } else {
                i++;
            }
            count++;
        }
        System.out.println("双指针算法,总计循环:" + count + "次");
    }

    @Test
    public void gen求一个有序数组中和为n的下标() throws Exception {
        int count = 0;
        for (int i = 0; i < num.length - 2; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                if (num[i] + num[j] == summary) {
                    System.out.println("普通计算,结果:" + num[i] + "+" + num[j] + "=" + summary);
                }
                count++;
            }
        }
        System.out.println("普通算法,总计循环:" + count + "次");
    }

    /* -----------------示例2 归并排序----------------- */
    private static final int[] a = { 4, 8, 12, 28, 56, 76 };

    private static final int[] b = { 3, 9, 10, 17, 25, 30, 40, 59, 70, 80 };

    /**
     * 【例子2】 ：归并排序
     * 两个递增序列A，B 需要合并成递增序列C
     */
    @Test
    public void 双指针算法归并排序() throws Exception {
        int i = 0;
        int j = 0;
        int size = a.length + b.length;
        int[] c = new int[size];
        int k = 0;
        int count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i];
                i++;
            } else {
                c[k++] = b[j];
                j++;
            }
            count++;
        }
        // 尾巴a
        while (i < a.length) {
            c[k++] = a[i];
            i++;
            count++;
        }
        // 尾巴b
        while (j < b.length) {
            c[k++] = b[j];
            j++;
            count++;
        }
        System.out.println("结果:" + Arrays.toString(c) + ",循环数:" + count);
    }

    @Test
    public void 冒泡排序() throws Exception {
        //int[] unsorted = { 3, 2, 6, 9, 5, 4 };
        int[] unsorted = ArrayUtils.addAll(a, b);
        System.out.println("排序前结果:" + Arrays.toString(unsorted));
        int count = 0;
        int temp = 0;
        for (int i = unsorted.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (unsorted[j + 1] < unsorted[j]) {
                    temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println("结果:" + Arrays.toString(unsorted) + ",循环数:" + count);
    }

    /* -----------------示例3 求连续自然数之和要等于n----------------- */

    /**
     * 对于一个整数n，输出它所有可能的连续自然数之和的算式，要求是这些连续自然数之和要等于n
     * @throws Exception 异常
     */
    @Test
    public void 双指针解法连续自然数之和等于n() throws Exception {
        int n = 100;
        int group = 0;
        int count = 0;
        int i = 1;
        int j = 2;
        while (i <= n / 2 && j < n) {
            int sum = (i + j) * (j - i + 1) / 2; //数学等差数列公式  (第一个数+最后一个数) * 个数 / 2
            if (sum == n) {
                group++;
                System.out.print("第" + group + "组:");
                for (int k = i; k <= j; k++) {
                    if (k == j) {
                        System.out.print(k);
                    } else {
                        System.out.print(k + ",");
                    }

                }
                System.out.println();
                System.out.println("-----------");
                i++;
                j++;
            } else if (sum < n) {
                j++;
            } else {
                i++;
            }
            count++;
        }
        System.out.println("总计:" + group + "组结果,循环次数:" + count);
    }

    @Test
    public void gen连续自然数之和等于n() throws Exception {

        int n = 100;
        int count = 0;
        int group = 0;

        for (int i = 1; i <= n / 2; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = (i + j) * (j - i + 1) / 2;
                if (sum == n) {
                    System.out.println("第" + group + "组:" + i + "~" + j);
                    break;
                } else if (sum > n) {
                    break;
                }
                count++;
            }
        }
        System.out.println("循环次数:" + count);
    }
}