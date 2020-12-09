package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    static int[] a = {2, 4, -1, 5, 0, 7};

    public void add(int num) {
        if (a == null) {
            a = new int[1];
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
            if (pos >= 0 && pos <= a.length) {
                System.arraycopy(a, 0, aCopi1, 0, a[pos - 1]);
                System.arraycopy(a, pos + 1, aCopi1, pos + 1, aCopi1.length);
                aCopi1[pos] = num;
                a = aCopi1;
            }
        }
    }
    public void atDelete(int pos) {
        if (a == null) {
            a = new int[1];
            a[0] = pos;
        } else {
            int[] aCopi2 = new int[a.length - 1];
            if (a[pos] >= 0 && a[pos] <= a.length) {
                System.arraycopy(a, 0, aCopi2, 0, a[pos - 1]);
                System.arraycopy(a, pos, aCopi2, pos, a.length);
                a = aCopi2;
            }
        }
    }
    public int at(int pos) {
        return a[pos];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(a));
    }
}