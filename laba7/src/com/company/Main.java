package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Псина", "Огузки", "Конура");
        Cat cat = new Cat("Котик", "Кормик", "Домик");
        Horse horse = new Horse("Кляча", "Травка", "Хлев");
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(horse);
    }
}
class Animal{
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное делает шум");
    }
    public void eat(){
        System.out.println("Животное трапезничает");
    }
    public void sleep(){
        System.out.println("Животное смотрит сны");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
class Dog extends Animal{

    public String bark = "Тявкает";

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Псина " + bark);
    }
    public void eat(){
        System.out.println("Псина харю мнёт");
    }
    @Override
    public void sleep(){
        System.out.println("Псина дрыхнет");
    }
}
class Cat extends Animal{

    public String meow = "Мурлычит";

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Кот " + meow);
    }
    public void eat(){
        System.out.println("Кот трапезничает");
    }
    @Override
    public void sleep(){
        System.out.println("Котик кемарит");
    }
}
class Horse extends Animal{

    public String snort = "ржет";

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    public void makeNoise(){
        System.out.println("Кляча " + snort);
    }
    public void eat(){
        System.out.println("Кляча уминает за обе щеки травку");
    }
    @Override
    public void sleep(){
        System.out.println("Мнёт щёку");
    }
}
class Veterinarian{
    public void treatAnimal(Animal animal){
        System.out.println("Прием у ветеринара");
        System.out.println("Животное: " + animal.getName() + "\tЕда: " + animal.getFood() + "\tМестоположение: " + animal.getLocation());
        animal.makeNoise();
        animal.eat();
        animal.sleep();
        System.out.print("\n \n");
    }
}