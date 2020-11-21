package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public Hamster() {
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