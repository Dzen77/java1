package ru.progwards.java1.lessons.classes;

public class Duck {
    public class Hamster extends Animal {
        @Override
        public AnimalKind getKind() {
            return AnimalKind.DUCK;
        }
        @Override
        public FoodKind getFoodKind() {
            return FoodKind.CORN;
        }
    }
}