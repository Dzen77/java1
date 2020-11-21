package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    Duck (double weight) {
        super(weight);
    }
    public double getFoodCoeff() {// возвращает коэффициент веса 0.04
        return 0.04d;
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }
}