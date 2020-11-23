package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int x;
    int y;
    public ComplexNum(int a, int b) {
        x = a;
        y = b;
    }
    public String toString() {
        String a = Integer.toString(x);
        String b = Integer.toString(y);
        System.out.println(a + b + "i");
        return (a + b + "i");
    }
}