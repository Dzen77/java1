package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a; //объявление действительной переменной
    int b; //объявление мнимой переменной
    ComplexNum(int a, int b) {//Конструктор для принятия действительной и мнимой частей
        this.a = a;
        this.b = b;
    }
    public ComplexNum add(ComplexNum num) {//Метод для сложения двух комплексных чисел
        return new ComplexNum(this.a + num.a, this.b + num.b);//возвращаем сумму частей
    }
    void printComplexNumber() {//Функция для печати комлексного номера
        System.out.println(this.a + "+" + this.b + "i");
    }
    public String toString() {
        return a + "+" + b + "i";
    }
    public static void main(String[] args) {
        ComplexNum C1 = new ComplexNum(1,7);
        ComplexNum C2 = new ComplexNum(5,3);
        System.out.println(C1.add(C2));
        C1.printComplexNumber();
        C2.printComplexNumber();
    }
}