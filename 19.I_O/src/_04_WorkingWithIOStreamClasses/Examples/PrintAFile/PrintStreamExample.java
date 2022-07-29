package _04_WorkingWithIOStreamClasses.Examples.PrintAFile;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamExample {
    public static void main(String[] args) {
        String[] names = { "Rob", "John", "Mark"};
        try( PrintStream printStream = new PrintStream("printStream.txt")){
            printStream.println("This is some text for printStream");
            for (String name : names) {
                printStream.printf("Hello: " + name +"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
