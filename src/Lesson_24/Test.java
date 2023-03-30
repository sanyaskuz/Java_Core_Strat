package Lesson_24;

import javax.swing.text.Style;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();

        File file = new File("testFile");
        PrintWriter printWriter = new PrintWriter(file) ;

        printWriter.println(line);
        printWriter.println(line2);

        printWriter.close();

    }
}
