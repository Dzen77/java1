package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    double x;
    double y;
    public ComplexNum(double a, double b) {
        x = a;
        y = b;
    }
    public String toString() {
        String a = Double.toString(x);
        String b = Double.toString(y);
        return a + "+" + b + "i";
    }
    int real, mnim; //объявление действительной и мнимой переменных
    ComplexNum() {
    }
    ComplexNum(int tempReal, int tempMnim) {//Конструктор для принятия действительной и мнимой частей
        this.real = tempReal;
        this.mnim = tempMnim;
    }
    ComplexNum add(ComplexNum C1, ComplexNum C2) {//Метод для сложения двух комплексных чисел
        ComplexNum temp = new ComplexNum(); //Создаем временную ипеременную
        temp.real = C1.real + C2.real;//добавление действительной части
        temp.mnim = C1.mnim + C2.mnim;//добавление мнимой части
        return temp;//возвращаем сумму
    }
    public static void main(String[] args) {
        ComplexNum Comp = new ComplexNum(7d,12d);
        System.out.println(Comp);
    }
}