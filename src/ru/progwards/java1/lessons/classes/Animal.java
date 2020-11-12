package ru.progwards.java1.lessons.classes;

public class Animal {
    Animal() {
    }
    public Animal(double weight) {
    }
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }
    public String toString(){
        return "i am <AnimalKind>" + ", " + "eat <FoodKind>";
    }
}