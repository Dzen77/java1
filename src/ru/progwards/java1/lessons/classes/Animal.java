package ru.progwards.java1.lessons.classes;

public class Animal {
    Animal() {
    }
    public Animal(double weight) {
    }
    public AnimalKind getKind() {
        AnimalKind ani = AnimalKind.ANIMAL;
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind() {
        FoodKind food = FoodKind.UNKNOWN;
        return FoodKind.UNKNOWN;
    }
    public String toString(){
        return "i am <AnimalKind>" + ", " + "eat <FoodKind>";
    }
}