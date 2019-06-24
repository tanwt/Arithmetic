package com.arithmetic.sort;

import com.util.Arithmetic;

/**
 * @author wentong
 * @date 2019-06-24
 */
public class QuickSort extends Arithmetic {
    @Override
    public void sort(Comparable[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(Comparable[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int j = partition(array, start, end);
        sort(array, start, j - 1);
        sort(array, j + 1, end);
    }

    private static int partition(Comparable[] array, int start, int end) {
        int i = start;
        int j = end + 1;
        Comparable v = array[start];
        while (true){
            // 从左边找到一个比指定值大的
            while (less(array[++i], v)){
                if(i == end){
                    break;
                }
            }
            // 从右边找到一个比指定值小的
            while (less(v, array[--j])){
                if (j == start){
                    break;
                }
            }
            if (i >= j){
                break;
            }
            // 把比指定值小的数放左边，大的数放右边
            exchangeElement(array, i, j);
        }
        // 交换指定值保证指定值左边的比他小，右边的比他大
        exchangeElement(array, start, j);
        return j;
    }

    public static void main(String[] args) throws IllegalAccessException {
        new QuickSort().testSort(10);
    }
}
