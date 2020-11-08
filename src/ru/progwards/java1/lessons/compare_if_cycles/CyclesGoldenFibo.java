package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0) {
            return true;
        }
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            } else {
                number = number/10;
            }
        } return false;
    }
    public static int fiboNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        double z = 1;
        if (a == b || a == c || b == c) {
            if (a - b == 0) {
                double a1 = a;
                z = a1/c;
            } if (a - c == 0) {
                double b1 = b;
                z = a/b1;
                } if (b - c == 0) {
                double b1 = b;
                z = b1 / a;
                } if (1.617_03 < z && z < 1.619_03) {
                return true;
            }
            }
        return false;
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        System.out.println("В заданном числе - " + x + " есть цифра " + y + "  это: " + containsDigit(x, y));
        int f = 7;
        System.out.println("Элемент под порядковым номером № " + f + " соответствует числу Фибоначи - " + fiboNumber(f));
        int a = 34;
        int b = 34;
        int c = 55;
        System.out.println(isGoldenTriangle(a, b, c));
    }
}