package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
        @Override
        public AnimalKind getKind() {
            AnimalKind ani = AnimalKind.DUCK;
            return AnimalKind.DUCK;
        }
        @Override
        public FoodKind getFoodKind() {
            FoodKind food = FoodKind.CORN;
            return FoodKind.CORN;
        }
}