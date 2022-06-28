package _04_WorkingWithIOStreamClasses.Examples;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("test.txt"));
            br.write("This is a test to write text into a file");
            br.write("\nThis is the second line of the text");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
