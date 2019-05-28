package com.util;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author wentong
 * @date 2019-05-28
 */
public abstract class Arithmetic {

    private Comparable[] array;

    public abstract void sort(Comparable[] array);

    public void testSort(int size) throws IllegalAccessException {
        array = getRandomIntegerArray(size);
        print(array);
        sort(array);
        print(array);
        isSort(array);
    }

    public void testSort() throws IllegalAccessException {
        testSort(16);
    }

    public static void print(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isEmpty(Comparable[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Comparable[] array) {
        return !isEmpty(array);
    }

    public static Integer[] getRandomIntegerArray(int size) {
        if (size < 0 || size > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("非法的数组大小");
        }
        Integer[] integers = new Integer[size];
        for (int i = 0; i < integers.length; i++) {
            Random random = new Random();
            integers[i] = random.nextInt(100);
        }
        return integers;
    }

    public static void exchangeElement(Comparable[] array, int x, int y) {
        checkSubscriptIsLegal(array, x);
        checkSubscriptIsLegal(array, y);
        Comparable temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void checkSubscriptIsLegal(Comparable[] array, Integer subscript) {
        if (isEmpty(array)) {
            throw new IllegalArgumentException("数组为空");
        }
        if (subscript < 0 || subscript >= array.length) {
            throw new IllegalArgumentException("下标越界");
        }
    }

    public static void isSort(Comparable[] array) throws IllegalAccessException {
        if (isNotEmpty(array)) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i+1])>0){
                    print(array);
                    throw new IllegalAccessException("排序失败");
                }
            }
        }
    }

    public static boolean less(Comparable[] arrays, int x, int y){
        checkSubscriptIsLegal(arrays, x);
        checkSubscriptIsLegal(arrays, y);
        if (arrays[x].compareTo(arrays[y]) < 0){
            return true;
        }
        return false;
    }
}
