package ru.progwards.java1.lessons.classes;

class Animal {
    double weight;
    Animal() {
    }
    public Animal(double weight) {
    }
    public double getWeight() {
        return weight;
    }
    public double getFoodCoeff() {
        return 0.02;
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
    public String toStringFull() {
        return "i am <AnimalKind>" + ", " + "eat <FoodKind>" + ", " + "<CalculateFoodWeight>";
    }
}