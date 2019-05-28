package com.arithmetic.sort;


/**
 * 插入排序
 */

import com.util.Arithmetic;

/**
 * @author wentong
 * @date 2019-05-28
 */
public class InsertionSort extends Arithmetic {

    @Override
    public void sort(Comparable[] array) {
        if (isEmpty(array)) {
            return;
        }
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && less(array, j, j - 1); j--) {
                exchangeElement(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        new InsertionSort().testSort();
    }
}
