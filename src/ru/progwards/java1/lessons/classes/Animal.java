package ru.progwards.java1.lessons.classes;

class Animal {
    Animal() {
    }
    public Animal(double weight) {
    }
    public AnimalKind getKind() {
        AnimalKind ani = AnimalKind.ANIMAL;
        return ani;
    }
    public FoodKind getFoodKind() {
        FoodKind food = FoodKind.UNKNOWN;
        return food;
    }
    public String toString(){
        return "i am <AnimalKind>" + ", " + "eat <FoodKind>";
    }
}