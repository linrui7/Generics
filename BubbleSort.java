package com.test1;
/*
   Author:linrui
   Date:2019/7/23
   Content:
*/


public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 1, 8, 2, 6, 6};
        sort1(arr);
    }

    public static <T extends Comparable<T>> void sort1(T[] list) {
        boolean swapped = true;
        for (int i = 0; i < list.length && swapped; i++) {
            swapped = false;
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        for (T s : list) {
            System.out.print(s);
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] t) {
        boolean swap = true;
        for (int i = 0; i < t.length && swap; i++) {
            swap = false;
            for (int j = 1; j < t.length - i - 1; j++) {
                if (t[j].compareTo(t[j + 1]) > 0) {
                    T tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
                    swap = true;
                }
            }
        }
    }
}
