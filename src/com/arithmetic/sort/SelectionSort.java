package com.arithmetic.sort;

import com.util.ArithmeticUtil;

import java.util.Random;
/**
 * 选择排序
 */

/**
 * @author wentong
 * @date 2019-05-28
 */
public class SelectionSort {

    /**
     * 选择排序的主要思想是：
     * 1. 每次遍历找出最大/小 的那个值，与当前下标进行交换
     */
    public static void sort(Comparable[] array) {
        if (ArithmeticUtil.isEmpty(array)) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            ArithmeticUtil.exchangeElement(array, i, min);
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Integer[] testSelectSort = ArithmeticUtil.getRandomIntegerArray(10);
        sort(testSelectSort);
        ArithmeticUtil.isSort(testSelectSort);
    }
}
