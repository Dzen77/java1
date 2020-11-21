package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    public Cow() {
    }
    public double getFoodCoeff() { //метод который возвращает коэффициент веса 0.05
        return 0.05d;
    }
    @Override
    public AnimalKind getKind() {
        AnimalKind animal2 = AnimalKind.COW;
        return animal2;
    }
    @Override
    public FoodKind getFoodKind() {
        FoodKind food2 = FoodKind.HAY;
        return food2;
    }
}