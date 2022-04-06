package _03_HandlingExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class _19_1_BasicsOfTryWithResources {
    /*
    Notice that one or more resources can be opened in the try clause. When there
    are multiple resources opened, they are closed in the reverse order from
    which they were created. Also, notice that parentheses are used to list
    those resources, and semicolons are used to separate the declarations. This
    works just like declaring multiple indexes in a for loop.

    Syntax:
    ======
    in the braces any resources that should automatically be closed.
    try(FileInputStream in = new FileInputStream("data.txt"); // required semicolon between resource declarations
        FileOutpuStream out = new FileOutputStream("outout.txt");) { //Last semicolon is optional
        //protected code
     } //Resources are closed at this point catch (IOException e) {
        //Exception handler
        } finally {
        //finally block
        }  //Catch and finally clauses are optional.
     */

    public void readFile(String file) throws IOException {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        }
    }
    /*
    Earlier in the chapter, you learned that a try statement must have one or
    more catch blocks or a finally block. This is still true. The finally
    clause exists implicitly. You just don’t have to type it.
    it turns out a catch block is optional with a try-with-resources statement.

    For the exam, you need to know that the implicit finally block runs before any
    programmer-coded ones.

    Legal vs. illegal configurations with a traditional try statement
                    0 finally blocks    1 finally block     2 or more finally blocks
                    ================================================================
    0 catch blocks  Not legal           Legal               Not legal
    1 or more catch Legal               Legal               Not legal
    blocks

    Legal vs. illegal configurations with a try-with-resources statement
                    0 finally blocks    1 finally block     2 or more finally blocks
                    ================================================================
    0 catch blocks  Legal               Legal               Not legal
    1 or more catch Legal               Legal               Not legal
    blocks

    Remember that the implicit finally block defined by the compiler is not counted here.
    Java requires classes used in a try-with-resources implement the AutoCloseable interface,
    which includes a void close() method.

    Declaring Resources
    ===================
    While try-with-resources does support declaring multiple variables, each
    variable must be declared in a separate statement.Each resource must
    include the data type and be separated by a semicolon (;).

    You can declare a resource using var as the data type in a try-with-resources statement,
    since resources are local variables.

    try (var f = new BufferedInputStream(new
    FileInputStream("it.txt"))) {
        // Process file
    }
    Declaring resources is a common situation where using var is quite
    helpful, as it shortens the already long line of code.
     */
}
