package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    public Duck() {
    }
    public double getFoodCoeff() {// возвращает коэффициент веса 0.04
        return 0.04d;
    }
    @Override
    public AnimalKind getKind() {
        AnimalKind animal4 = AnimalKind.DUCK;
        return animal4;
    }
    @Override
    public FoodKind getFoodKind() {
        FoodKind food3 = FoodKind.CORN;
        return food3;
    }
}