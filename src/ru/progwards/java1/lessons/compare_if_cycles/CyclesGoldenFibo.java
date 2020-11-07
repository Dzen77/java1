package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
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
    }
    public static void main(String[] args) {
        int x = 2567584;
        int y = 9;
        int f = 5;
        System.out.println("В заданном числе - " + x + " есть цифра " + y + " это: " + containsDigit(x, y));
        System.out.println("Элемент под порядковым номером № " + f + " соответствует числу Фибоначи - " + fiboNumber(f));
        int n = 4;
        System.out.println(fiboNumber(n));
    }
}
