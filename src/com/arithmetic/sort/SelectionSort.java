package com.arithmetic.sort;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author wentong
 * @date 2019-05-28
 */
public class SelectionSort {

    /**
     * . 参数校验
     */
    public static void sort(Comparable array[]) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            Comparable temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void print(Comparable array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] testSelectSort = new Integer[10];
        for (int i = 0; i < testSelectSort.length; i++) {
            Random random = new Random();
            testSelectSort[i] = random.nextInt(100);
        }
        print(testSelectSort);
        sort(testSelectSort);
        print(testSelectSort);
    }
}
