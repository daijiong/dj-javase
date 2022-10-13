package org.djflying.javase.algorithms.doublepointer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author llf32758
 * @version Id: DoublePointerTest2, v 0.1 2018/1/10 22:22 llf32758 Exp $
 */

public class DoublePointerTest2 {

    /** logger */
    private static Logger logger = LoggerFactory.getLogger(DoublePointerTest2.class);

    /**
     * https://leetcode.com/problems/remove-element/description/
     */
    @Test
    public void removeElement() {
        //原始数组
        int[] nums = { 3, 2, 4, 7, 8, 3, 2, 3 };
        //需要排除的数字
        int element = 3;

        //第一个指针：记录排除指定元素后的数组末位指针
        int index = 0;
        //第二个指针：i是用来遍历的指针
        for (int i = 0, length = nums.length; i < length; i++) {
            if (nums[i] != element) {
                nums[index] = nums[i];
                logger.info("index：{}，i：{}，当前数组：{}", index, i, nums);
                index++;
            }
        }
        logger.info("排除指定元素后元素个数：{}", index);
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
     */
    @Test
    public void removeDuplicatesFromSortedArray() {
        //原始数组
        int[] nums = { 1, 2, 2, 2, 3, 4, 5, 5, 6, 7 };

        //第一个指针：记录排除重复元素后的数组末位指针
        int index = 0;
        //第二个指针：i从第二个元素开始遍历，因为需要比较和前一个元素的值是否相等
        for (int i = 1, length = nums.length; i < length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
                logger.info("index：{}，i：{}，当前数组：{}", index, i, nums);
            }
        }
        logger.info("排除重复元素后元素个数：{}", index + 1);
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
     * 解法一
     */
    @Test
    public void removeDuplicatesFromSortedArray2Impl1() {
        //原始数组
        int[] nums = { 1, 2, 2, 2, 3, 4, 5, 5, 6, 7 };

        //第一个指针：记录排除重复元素后的数组末位指针
        int index = 0;
        //第二个指针：i从第二个元素开始遍历，因为需要比较和前一个元素的值是否相等
        for (int i = 1, length = nums.length; i < length; i++) {
            if (nums[i] == nums[index] && (index == 0 || nums[index - 1] != nums[index])) {
                index++;
                nums[index] = nums[i];
                logger.info("index：{}，i：{}，当前数组：{}", index, i, nums);
            }

            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
                logger.info("index：{}，i：{}，当前数组：{}", index, i, nums);
            }
        }
        logger.info("排除重复元素后元素个数：{}", index + 1);
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
     * 解法二
     */
    @Test
    public void removeDuplicatesFromSortedArray2Impl2() {
        //原始数组
        int[] nums = { 1, 2, 2, 2, 2, 3, 4, 5, 5, 6, 7 };

        //第一个指针：记录排除重复元素后的数组末位指针
        int index = 2;
        //第二个指针：i从第N+1个元素开始遍历
        for (int i = 2, length = nums.length; i < length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                logger.info("index：{}，i：{}，当前数组：{}", index, i, nums);
                index++;
            }
        }
        logger.info("排除重复元素后元素个数：{}", index);
    }

    /**
     * https://leetcode.com/problems/sort-colors/description/
     * 解法一
     */
    @Test
    public void sortColorsImpl1() {
        //原始数组
        int[] nums = { 1, 0, 1, 2, 1 };

        //第一个指针
        int j = 0;
        //第二个指针
        int k = nums.length - 1;
        //第三个指针
        int i = 0;

        while (i < k + 1) {
            if (nums[i] == 0) {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                j++;
                i++;
            } else if (nums[i] == 2) {
                int t = nums[k];
                nums[k] = nums[i];
                nums[i] = t;
                k--;
            } else {
                i++;
            }
        }
        logger.info("归并后数组：{}", nums);
    }

    /**
     * https://leetcode.com/problems/sort-colors/description/
     * 解法二
     */
    @Test
    public void sortColorsImpl2() {
        //原始数组
        int[] nums = { 1, 0, 1, 2, 1 };

        //第一个指针
        int i = 0;
        //第二个指针
        int j = 0;
        //第三个指针
        int k = 0;
        for (int m = 0; m < nums.length; m++) {
            logger.info("m:{}, i:{}, j:{}, k:{}, nums:{}", m, i, j, k, nums);
            if (nums[m] == 2) {
                nums[k++] = 2;
            } else if (nums[m] == 1) {
                nums[k++] = 2;
                nums[j++] = 1;
            } else if (nums[m] == 0) {
                nums[k++] = 2;
                nums[j++] = 1;
                nums[i++] = 0;
            }
        }
        logger.info("归并后数组：{}", nums);
    }
}
