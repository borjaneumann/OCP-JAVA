package _04_WorkingWithIOStreamClasses.Examples.PrintAFile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriteExanple {
    public static void main(String[] args) {
        String[] names = { "Rob", "John", "Mark"};
        try( PrintWriter printWriter = new PrintWriter("printWriter.txt")){
            printWriter.println("This is some text for printWriter");
            for (String name : names) {
                printWriter.printf("Hello: " + name +"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
