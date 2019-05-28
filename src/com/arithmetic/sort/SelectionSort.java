package com.arithmetic.sort;

import com.util.ArithmeticUtil;

import java.util.Random;

/**
 * @author wentong
 * @date 2019-05-28
 */
public class SelectionSort {

    /**
     * . 参数校验
     */
    public static void sort(Comparable[] array) {
        if (ArithmeticUtil.isEmpty(array)){
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

    public static void main(String[] args) {
        Integer[] testSelectSort = ArithmeticUtil.getRandomIntegerArray(10);
        ArithmeticUtil.print(testSelectSort);
        sort(testSelectSort);
        ArithmeticUtil.print(testSelectSort);
    }
}
