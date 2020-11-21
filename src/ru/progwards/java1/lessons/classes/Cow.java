package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
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