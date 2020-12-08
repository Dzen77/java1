package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] a = {5, 3, 9, -7, 0, 1};;
    public DIntArray () {
    }
    public void add(int num) {
        int aCopi = Arrays.copyOf(a, a.length + 1);
        aCopi[a.length] = num;
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
