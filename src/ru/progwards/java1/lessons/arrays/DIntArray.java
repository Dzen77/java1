package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    int[] a;
    public void add(int num) {
        if (a == null) {
            a = new int [1];
            a[0] = num;
        } else {
            int[] aCopi = Arrays.copyOf(a, a.length + 1);
            aCopi[a.length] = num;
            a = aCopi;
        }
    }
    public void atInsert(int pos, int num) {
    }
    public void atDelete(int pos) {
    }
    public int at(int pos) {
        return a[pos];
    }
    public static void main(String[] args) {
    }
}
