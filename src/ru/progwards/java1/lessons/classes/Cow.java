package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    public double getFoodCoeff() { //метод который возвращает коэффициент веса 0.05
        return 0.05d;
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }
    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }
}