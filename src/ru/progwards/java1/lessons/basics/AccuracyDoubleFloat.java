package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    final static double PI = 3.14;
    final static float PI1 = 3.14f;
    public static double volumeBallDouble(double radius) {
        double volumeEarth = (4.0 / 3.0) * PI * (radius * radius * radius);//формула расчета объема Земли в double
        return volumeEarth;
    }
    public static float volumeBallFloat(float radius) {
        float volumeEarth1 = (4.0f / 3.0f) * PI1 * (radius * radius * radius);//формула расчета объема Земли в float
        return volumeEarth1;
    }
    public static double calculateAccuracy(double radius) {
        double count = volumeBallDouble(radius);
        double count1 = volumeBallFloat((float)radius);
        double result = count - count1;
        return result;
    }
    public static void main(String[] args) {
        double radius = 6_371.2;
        System.out.println(volumeBallDouble(radius));
        System.out.println(volumeBallFloat((float)radius));
        System.out.println(calculateAccuracy(radius));
    }
}