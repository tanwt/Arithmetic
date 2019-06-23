package com.arithmetic.sort;

import com.util.Arithmetic;

import java.util.PriorityQueue;
/**
 * 希尔排序
 * 对插入排序的优化，优化了最小值在最右端的情况
 */

/**
 * @author wentong
 * @date 2019-05-28
 */
public class ShellSort extends Arithmetic {

    @Override
    public void sort(Comparable[] array) {
        if (isEmpty(array)){
            return;
        }
        int length = array.length;
        int h = 1;
        while (h < length / 3) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && less(array, j, j - h); j = j - h) {
                    exchangeElement(array, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        new ShellSort().testSort();
    }
}
