package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    int[] a;
    public void add(int num) {
        if (a == null) {
            a = new int [1];
            a[0] = num;
        } else {
            int[] aCopi = new int[a.length + 1];
            System.arraycopy(a, 0, aCopi, 0, a.length);
            aCopi[a.length] = num;
            a = aCopi;
        }
    }
    public void atInsert(int pos, int num) {
        if (a == null) {
            a = new int[1];
            a[0] = num;
        } else {
            int[] aCopi1 = new int[a.length + 1];
            System.arraycopy(a, 0, aCopi1, 0, a[9]);
            aCopi1[10] = num;
            System.arraycopy(a, 10, aCopi1, 11, a.length);
            a = aCopi1;
        }
    }
    public void atDelete(int pos) {
        if (a == null) {
            a = new int[1];
            a[0] = pos;
        } else {
            int[] aCopi2 = new int[a.length - 1];
            System.arraycopy(a, 0, aCopi2, 0, a[9]);
            System.arraycopy(a, 11, aCopi2, 10, a.length);
            a = aCopi2;
        }
    }
    public int at(int pos) {
        return a[10];
    }
}
