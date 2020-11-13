package ru.progwards.java1.lessons.classes;

public class Main {
    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }
    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }
    public static void main(String[] args) {
        System.out.println(AnimalKind.ANIMAL);
        System.out.println(FoodKind.UNKNOWN);
        }
}
