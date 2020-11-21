package ru.progwards.java1.lessons.classes;

public class Animal {
    public Animal() {
    }
    public Animal(double weight) {//конструктор сохраняет вес животного
    }
    public double getWeight() { //метод возвращает вес животного
        return 3.4d;//вес абстрактного животного
    }
    public double getFoodCoeff() {
        return 0.02d;//который возвращает коэффициент веса еды к весу тела животного для класса Animal это 0.02
    }
    public double calculateFoodWeight() {//рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела
        double k = getWeight() * getFoodCoeff();
        return k;
    }
    public AnimalKind getKind () {
        return AnimalKind.ANIMAL;
    }
    public FoodKind getFoodKind () {
        return FoodKind.UNKNOWN;
    }
    public String toString () {
        return "i am " + getKind() + ", " + "eat " + getFoodKind();
    }
    public String toStringFull () {
        return "i am " + getKind() + ", " + "eat " + getFoodKind() + " " + calculateFoodWeight();
    }
    public static void main (String[]args){
        Animal ani = new Animal(1.0);
        Animal ani2 = new Cow();
        Animal ani3 = new Hamster();
        Animal ani4 = new Duck();
        Animal ani5 = new Animal();
        System.out.println(ani);
        System.out.println(ani2);
        System.out.println(ani3);
        System.out.println(ani4);
        System.out.println(ani5.toStringFull());
        System.out.println(ani2.toStringFull());
        System.out.println(ani3.toStringFull());
        System.out.println(ani4.toStringFull());
    }
}