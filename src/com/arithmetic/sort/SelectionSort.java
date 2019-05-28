package com.arithmetic.sort;

import com.util.Arithmetic;
/**
 * 选择排序
 */

/**
 * @author wentong
 * @date 2019-05-28
 */
public class SelectionSort extends Arithmetic {

    /**
     * 选择排序的主要思想是：
     * 1. 每次遍历找出最大/小 的那个值，与当前下标进行交换
     */
    @Override
    public  void sort(Comparable[] array) {
        if (isEmpty(array)) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (less(array, j, min)) {
                    min = j;
                }
            }
            exchangeElement(array, i, min);
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        new SelectionSort().testSort();
    }
}
