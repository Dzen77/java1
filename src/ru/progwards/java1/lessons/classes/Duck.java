package ru.progwards.java1.lessons.classes;

class Duck extends Animal {
    @Override
    public AnimalKind getKind() {
        AnimalKind ani = AnimalKind.DUCK;
        return ani;
    }
    @Override
    public FoodKind getFoodKind() {
        FoodKind food = FoodKind.CORN;
        return food;
    }
}