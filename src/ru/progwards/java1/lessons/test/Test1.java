package ru.progwards.java1.lessons.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {5, 3, 9, -7, 0, 1};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }
}