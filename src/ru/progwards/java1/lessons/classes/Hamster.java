package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public double getFoodCoeff() {// возвращает коэффициент веса 0.03
        return 0.03d;
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }
}