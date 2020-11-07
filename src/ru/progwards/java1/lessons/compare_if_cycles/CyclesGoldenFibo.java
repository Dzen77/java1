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

    }
    public static boolean isGoldenTriangle(int a, int b, int c) {

    }
    public static void main(String[] args) {
        int x = 2567584;
        int y = 9;
        int f = 5;
        System.out.println("В заданном числе - " + x + " есть цифра " + y + " это: " + containsDigit(x, y));
        System.out.println("Элемент под порядковым номером № " + f + " соответствует числу Фибоначи - " + fiboNumber(f));
    }
}
