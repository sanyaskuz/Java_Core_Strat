package Losson_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
       ;

        File file = new File("testFile");



        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int count = 0;
        for(String number : numbersString){
            numbers[count++]  = Integer.parseInt(number);

        }
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();

    }
}
