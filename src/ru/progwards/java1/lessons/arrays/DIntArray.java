package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a;

    DIntArray() {
    }
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
    boolean x1 (int pos) {
        if (pos >= 0 && pos < a.length) {
            return true;
        }
        return false;
    }
    public void atInsert(int pos, int num) {
        if (x1(pos) == false)
            return;
        int[] temp = new int[a.length + 1];
        System.arraycopy(a, 0, temp, 0, pos);
        System.arraycopy(a, pos, temp, pos + 1, a.length - pos);
        temp[pos] = num;
        a = temp;
    }
    public void atDelete(int pos) {
        if (x1(pos) == false)
            return;
        int[] temp1 = new int[a.length - 1];
        System.arraycopy(a, 0, temp1, 0, pos);
        System.arraycopy(a, pos + 1, temp1, pos, a.length - pos - 1);
        a = temp1;
    }
    public int at(int pos) {
        if (pos < 0 || pos >= a.length) {
            return 0;
        } else {
            return a[pos];        }
    }
    public static void main(String[] args) {
        DIntArray d = new DIntArray();
        d.add(5);
        d.add(60);
        d.add(8);
        System.out.println("add:  " + Arrays.toString(d.a));
        d.atInsert(2, 17);
        System.out.println("atInsert:  " + Arrays.toString(d.a));
        d.atDelete(1);
        System.out.println("atDelete  " + Arrays.toString(d.a));
        int count = d.at(2);
        System.out.println(count);
    }
}