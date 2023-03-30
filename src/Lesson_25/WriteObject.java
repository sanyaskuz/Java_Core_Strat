package Lesson_25;

import java.io.*;

public class WriteObject {
    public static void main(String[] args){
        Person[] people = {new Person(1, "Bob"),new Person(2, "Nike"),new Person(3, "Tom")};

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
//            FileOutputStream fos = new FileOutputStream("people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

//            oos.writeInt(people.length);
//
//            for (Person person: people
//                 ) {
//                oos.writeObject(person);
//
//            }

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
