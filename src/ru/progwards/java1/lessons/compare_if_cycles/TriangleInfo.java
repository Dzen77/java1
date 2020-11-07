package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean result = ((a + b) > c && (a + c) > b && (c + b) > a);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c) {
        boolean result1 = (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
        return result1;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result2 = (a == b || a == c || b == c);
        return result2;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 3;
        System.out.println("По данным параматрам длин сторон можно построить треугольник - " + isTriangle(a, b, c));
        System.out.println("Этот треугольник является прямоугольным - " + isRightTriangle(a, b, c));
        System.out.println("Этот треугольник является равнобедренным - " + isIsoscelesTriangle(a, b, c));
    }
}
