package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int c = number/100;
        int b = (number - c * 100)/10;
        int w = b * 10;
        int a = (number - c * 100 - b * 10);
        int u = a * 100;
        int result = u + w + c;
        return result;
    }
    public static void main(String[] args) {
        int number = 537;
        int num = reverseDigits(number);
        System.out.println(num);
    }
}
