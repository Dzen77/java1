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
    public static void main(String[] args) {
        int x = 2567584;
        int y = 9;
        System.out.println("В заданном числе - " + x + " есть цифра " + y + " это: " + containsDigit(x, y));
    }
}
