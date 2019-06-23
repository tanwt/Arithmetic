package com.arithmetic.sort;

import com.util.Arithmetic;

/**
 * @author wentong
 * @date 2019-06-23
 */
public class MergeSort extends Arithmetic {
    @Override
    public void sort(Comparable[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(Comparable[] array, int start, int end) {
        if(end <= start){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    private static void merge(Comparable[] array, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        Comparable[] copy = new Comparable[array.length];
        for (int k = start; k <= end; k++) {
            copy[k] = array[k];
        }
        for (int k = start; k <= end; k++) {
            if (i > mid) {
                array[k] = copy[j++];
            } else if (j > end) {
                array[k] = copy[i++];
            } else if (less(copy, i, j)) {
                array[k] = copy[i++];
            } else {
                array[k] = copy[j++];
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        new MergeSort().testSort(10);
    }
}
