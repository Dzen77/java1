package ru.progwards.java1.lessons.classes;

public class Animal {
    public Animal() {
    }
    public Animal(double weight) {
    }
    public AnimalKind getKind () {
        AnimalKind animal1 = AnimalKind.ANIMAL;
        return animal1;
    }
    public FoodKind getFoodKind () {
        FoodKind food1 = FoodKind.UNKNOWN;
        return food1;
    }
    @Override
    public String toString () {
        return "i am " + getKind() + ", " + "eat " + getFoodKind();
    }
    public static void main (String[]args){
        Animal ani = new Animal(3.5);
        Animal ani2 = new Cow();
        Animal ani3 = new Hamster();
        Animal ani4 = new Duck();
        System.out.println(ani);
        System.out.println(ani2);
        System.out.println(ani3);
        System.out.println(ani4);
    }
}