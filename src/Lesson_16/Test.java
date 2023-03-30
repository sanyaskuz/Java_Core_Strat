package Lesson_16;


interface AbleToEat {
    public void eat();
}
class Animal implements AbleToEat{

    @Override
    public void eat() {
        System.out.println("Eat...");
    }
}

public class Test {
    public static void main(String[] args){
    AbleToEat ableToEat = new Animal();
    ableToEat.eat();
    }
}
