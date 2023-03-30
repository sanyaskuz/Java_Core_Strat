package Lesson_14;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
//        Java5
        //    List animals = new ArrayList<>();
        //    animals.add("Cat");
        //    animals.add("Dog");
        //    animals.add("Frog");
        //
        //    String animal = (String) animals.get(1);
        //    System.out.println(animal);

//Generic
        List<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = animals.get(2);
        System.out.println(animal);
//        Java 7
        List<String> animals2 = new ArrayList<>();




    }
    class Animal{

    }
}
