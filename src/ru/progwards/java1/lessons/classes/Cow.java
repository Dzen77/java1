package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    @Override
    public AnimalKind getKind() {
        AnimalKind ani = AnimalKind.COW;
        return ani;
    }
    @Override
    public FoodKind getFoodKind() {
        FoodKind food = FoodKind.HAY;
        return food;
    }
}