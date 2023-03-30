package Lesson_22;

public class Test {
    public static void main(String [] args){


//        int x = 1;
//        int y = 1;
//
//        System.out.println(x == y);
//
//        Animal animal1 = new Animal(1);
//        Animal animal2 = new Animal(2);
//
//        System.out.println(animal1.equals(animal2));


//        Object object = new Object();
//        object.equals();

        String string1 = "Hello";
        String string2 = "Hello123".substring(0, 5);
//
        System.out.println(string1.equals(string2));
        System.out.println(string1);
        System.out.println(string2);


    }
}
class Animal {
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal orherAnimal = (Animal) obj;

        return this.id == orherAnimal.id;
    }
}