package com.arithmetic.sort;


/**
 * 插入排序
 */

import com.util.ArithmeticUtil;

/**
 * @author wentong
 * @date 2019-05-28
 */
public class InsertionSort {

    public static void sort(Comparable[] array) {
        if (ArithmeticUtil.isEmpty(array)) {
            return;
        }
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--){
                ArithmeticUtil.exchangeElement(array, j, j-1);
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Integer[] randomIntegerArray = ArithmeticUtil.getRandomIntegerArray(10);
        sort(randomIntegerArray);
        ArithmeticUtil.isSort(randomIntegerArray);
    }
}
