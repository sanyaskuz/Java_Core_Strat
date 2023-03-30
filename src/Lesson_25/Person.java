package Lesson_25;


import java.io.Serializable;

public class Person implements Serializable {

    private transient int id;

    private  String name;



    public Person(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return  id + ":" + name;
    }
}
