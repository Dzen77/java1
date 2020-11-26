package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a; //объявление  переменной действительной части
    int b; //объявление переменной мнимой части
    ComplexNum(int a, int b) {//Конструктор для создания комплексного числа
        this.a = a;
        this.b = b;
    }
    public ComplexNum add(ComplexNum num) {//Метод для сложения двух комплексных чисел
        return new ComplexNum(this.a + num.a, this.b + num.b);//возвращаем сумму частей
    }
    public ComplexNum sub(ComplexNum num) {//Метод для сложения двух комплексных чисел
        return new ComplexNum(this.a - num.a, this.b - num.b);//возвращаем сумму частей
    }
    public ComplexNum mul(ComplexNum num) {
        int a = this.a, b = this.b, c = num.a, d = num.b;
        return new ComplexNum(a * c - b * d, b * c + a * d);
    }
    public ComplexNum div(ComplexNum num) {
        int a = this.a, b = this.b, c = num.a, d = num.b;
        return new ComplexNum((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
    }
    void printComplexNumber() {//Функция для печати комплексного номера
        System.out.println(this.a + "+" + this.b + "i");
    }
        public String toString() {
        return a + "+" + b + "i";
    }
    public static void main(String[] args) {
        ComplexNum C1 = new ComplexNum(1,7);
        ComplexNum C2 = new ComplexNum(5,2);
        System.out.println(C1.add(C2));
        System.out.println(C1.sub(C2));
        System.out.println(C1.mul(C2));
        System.out.println(C1.div(C2));
    }
}