package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a < c && b < c) {
            return c;
        } else {
            if (a < b && c < b) {
                return b;
            }
        }
        return a;
    }
    public static int minSide(int a, int b, int c) {
        if (a > c && b > c) {
            return c;
        } else {
            if (a > b && c > b) {
                return b;
            }
        }
        return a;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b && a == c) {
        }
        return a == b && a == c;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        int result = maxSide(a, b, c);
        System.out.println(result);
        int result1 = minSide(a, b, c);
        System.out.println(result1);
        if (a == b && a == c) {
            System.out.println("Треугольник равносторонний? - " + (a == b && a == c));
        } else {
            System.out.println("Треугольник равносторонний? - " + (a == b && a == c));
        }
    }
}
