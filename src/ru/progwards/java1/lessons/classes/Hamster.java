package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public Hamster() {
    }
    public double getFoodCoeff() {// возвращает коэффициент веса 0.03
        return 0.03d;
    }
    @Override
    public AnimalKind getKind() {
        AnimalKind animal3 = AnimalKind.HAMSTER;
        return animal3;
    }
    @Override
    public FoodKind getFoodKind() {
        FoodKind food3 = FoodKind.CORN;
        return food3;
    }
}