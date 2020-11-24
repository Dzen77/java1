package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public String toString() {
        String a = Integer.toString(this.real);
        String b = Integer.toString(this.mnim);
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
    ComplexNum sub(ComplexNum C1, ComplexNum C2) {//Метод для вычитания двух комплексных чисел
        ComplexNum temp = new ComplexNum(); //Создаем временную ипеременную
        temp.real = C1.real - C2.real;//добавление действительной части
        temp.mnim = C1.mnim - C2.mnim;//добавление мнимой части
        return temp;//возвращаем разницу
    }
    void printComplexNumber() {//Функция для печати комлексного номера
        System.out.println(real + "+" + mnim + "i");
    }
    public static void main(String[] args) {
        ComplexNum Comp = new ComplexNum(7,12);
        System.out.println(Comp);

        ComplexNum C1 = new ComplexNum(3, 2);//Первый комплексный номер
        ComplexNum C2 = new ComplexNum(9, 5);//Первый комплексный номер
        ComplexNum C3 = new ComplexNum();//Сохранение суммы

        C3 = C3.add(C1, C2);
        C3.printComplexNumber();//Выводим сумму

        C3 = C3.sub(C1, C2);//
        C3.printComplexNumber();//Выводим разницу
    }
}