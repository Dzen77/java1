package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    int[] a = {5, 3, 9, -7, 0, 1};
    public static void sort(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < 5; ++i) {
            for (int j = i + 1; a[i] > a[j]; ++j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    public static void main(String[] args){
    }
}
