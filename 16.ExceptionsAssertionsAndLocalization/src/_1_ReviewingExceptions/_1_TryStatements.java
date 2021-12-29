package _1_ReviewingExceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLData;

public class _1_TryStatements {

    public static void main(String[] args) {
        //Try statement
        try {
            //protected code
        }catch (ArithmeticException e) {
            //Handler for IOException
        }catch (IllegalAccessError | IllegalArgumentException e) {
            //Multi catch handler
        } finally {
            //Always runs after try
        }

        //try-with-resources
        //A try‐with‐resources statement looks a lot like a try statement, except that it
        //includes a list of resources inside a set of parentheses, ().
        try (var in = new FileInputStream("data.txt");//required semicolon between resources
            var out = new FileOutputStream("output.txt");){ //Optional semicolon
            //Protected code
        } catch (IOException e) {
            //Exception handler --Optional catch and finally clauses
        }finally{
            //finally block
        }
    }

}
