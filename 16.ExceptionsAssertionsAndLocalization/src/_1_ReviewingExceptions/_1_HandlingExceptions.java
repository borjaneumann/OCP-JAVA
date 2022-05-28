package _1_ReviewingExceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1_HandlingExceptions {

    public static void main(String[] args) {
        /*
        A try statement is used to handle exceptions. It consists of a try clause,
        zero or more catch clauses to handle the exceptions that are thrown, and
        an optional finally clause, which runs regardless of whether an exception
        is thrown.
         */
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
        /*A try‐with‐resources statement looks a lot like a try statement, except that it
        includes a list of resources inside a set of parentheses, ().
        These resources are automatically closed in the reverse order that they are declared at the
        conclusion of the try clause.
        */
        try (var in = new FileInputStream("data.txt");//required semicolon between resources
            var out = new FileOutputStream("output.txt");){ //Optional semicolon
            //Protected code
        } catch (IOException e) {
            //Exception handler --Optional catch and finally clauses
        }finally{
            //finally block
        }
        /*
        Did you notice we used var for the resource type? While var is not
        required, it is convenient when working with streams, database objects,
        and especially generics, whose declarations can be lengthy.
         */
    }

}
