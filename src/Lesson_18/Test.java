package Lesson_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("proc. hir ");
        }

    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);

//        try {

//            System.out.println("next scanner");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!!");
//        }
//        System.out.println("next try catch");


    }
}
