package TryAndCatch;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class TryWithResources {
    //it turns out a
    //catch block is optional with a try-with-resources statement
    //The finally clause exists implicitly. You just don’t have to type it
    public static void main(String[] args) {
    }
    public void readFile (String file) throws IOException {
        try (FileInputStream is = new FileInputStream("myfile.txt")){
            //read file data
        }
    }
    private final static String INPUT = "in.txt";
    private final static String OUTPUT = "out.txt";

    //variables must be declared in different statements

    public void multipleVariables() throws IOException {
        try(BufferedReader rd = new BufferedReader(new FileReader(INPUT));
            FileWriter wr = new FileWriter(OUTPUT);
            StringWriter str = new StringWriter()){

        }
    }

    //var
    public void usingVar () {
        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))){
            //process file
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

//Earlier in the chapter, you learned that a try statement must have one or
//more catch blocks or a finally block. This is still true. The finally
//clause exists implicitly. You just don’t have to type it.
