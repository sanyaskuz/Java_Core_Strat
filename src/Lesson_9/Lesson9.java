package Lesson_9;

import Animal.Animal;
import Animal.Dog;

public class Lesson9 {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        animal.eat();
        dog.showName();

    }
}
