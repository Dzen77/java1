package ru.progwards.java1.lessons.classes;

class Hamster extends Animal {
        @Override
        public AnimalKind getKind() {
            AnimalKind ani1 = AnimalKind.HAMSTER;
            return ani1;
        }
        @Override
        public FoodKind getFoodKind() {
            FoodKind food1 = FoodKind.CORN;
            return food1;
        }
}