package com.util;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author wentong
 * @date 2019-05-28
 */
public class ArithmeticUtil {

    public static void print(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isEmpty(Comparable[] array){
        if (array == null || array.length == 0){
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(Comparable[] array){
        return !isEmpty(array);
    }

    public static Integer[] getRandomIntegerArray(int size){
        if (size < 0 || size > Integer.MAX_VALUE){
            throw new IllegalArgumentException("非法的数组大小");
        }
        Integer[] integers = new Integer[size];
        for (int i = 0; i < integers.length; i++) {
            Random random = new Random();
            integers[i] = random.nextInt(100);
        }
        return integers;
    }

    public static void exchangeElement(Comparable[] array, int x, int y){
        checkSubscriptIsLegal(array, x);
        checkSubscriptIsLegal(array, y);
        Comparable temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void checkSubscriptIsLegal(Comparable[] array, Integer subscript){
        if (isEmpty(array)){
            throw new IllegalArgumentException("数组为空");
        }
        if (subscript < 0 || subscript >= array.length){
            throw new IllegalArgumentException("下标越界");
        }
    }

}
