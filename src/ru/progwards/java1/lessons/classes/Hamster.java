package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
        @Override
        public AnimalKind getKind() {
            AnimalKind ani1 = AnimalKind.HAMSTER;
            return AnimalKind.HAMSTER;
        }
        @Override
        public FoodKind getFoodKind() {
            FoodKind food1 = FoodKind.CORN;
            return FoodKind.CORN;
        }
}