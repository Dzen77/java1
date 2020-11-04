package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final static double PI = 3.14;
    public static Double sphereSquare(Double r) {
        double s = 4 * PI * r * r;//расчет площади поверхности сферы
        return s;
    }
    public static Double earthSquare() {
        double r = 6_371.2;//радиус Земли в километрах
        double terraSquare = sphereSquare(r);//обращаемся к формуле расчета площади поверхности сферы
        return terraSquare;
    }
    public static Double mercurySquare() {
        double r = 2_439.7;//радиус Меркурия в километрах
        double mercury = sphereSquare(r);
        return mercury;
    }
    public static Double jupiterSquare() {
        double r = 71_492;//радиус Юпитера в километрах
        double jupi = sphereSquare(r);
        return jupi;
    }
    public static Double earthVsMercury() {
        double r = 6_371.2;//радиус Земли в километрах
        double terraSquare = sphereSquare(r);//обращаемся к формуле расчета площади поверхности сферы
        double r1 = 2_439.7;//радиус Меркурия в километрах
        double mercury = sphereSquare(r1);//обращаемся к формуле расчета площади поверхности сферы
        double earthVSmerc = terraSquare / mercury;
        return earthVSmerc;
    }
    public static Double earthVsJupiter() {
        double r = 6_371.2;//радиус Земли в километрах
        double terraSquare = sphereSquare(r);//обращаемся к формуле расчета площади поверхности сферы
        double r2 = 71_492;//радиус Юпитера в километрах
        double jupi = sphereSquare(r2);
        double earthVSjupi = terraSquare / jupi;
        return earthVSjupi;
    }
    public static void main(String[] args) {
        double r = 1.74;
        double sphere = sphereSquare(r);//обращаемся к функции расчета площади поверхности сферы
        System.out.println(sphere);
        double earth = earthSquare();//обращаемся к функции расчета площади поверхности Земли
        System.out.println(earth);
        double mrc = mercurySquare();//обращаемся к функции расчета площади поверхности Меркурия
        System.out.println(mrc);
        double jpiter = jupiterSquare();//обращаемся к функции расчета площади поверхности Юпитера
        System.out.println(jpiter);
        double erth_merc = earthVsMercury();//отношение площади поверхности Земли к площади поверхности Меркурия
        System.out.println(erth_merc);
        double erth_jupi = earthVsJupiter();//отношение площади поверхности Земли к площади поверхности Юпитера
        System.out.println(erth_jupi);
    }
}
