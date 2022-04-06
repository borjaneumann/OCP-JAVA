package _03_HandlingExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class _19_0_FinallyClosingResources {
    /*
    Resources : Oftentimes, your application works with files, databases, and various
    connection objects. Commonly, these external data sources are referred to as resources.
    In many cases, you open a connection to the resource,
    whether it’s over the network or within a file system. You then read/write
    the data you want. Finally, you close the resource to indicate you are done
    with it.

    What happens if you don’t close a resource when you are done with it? In
    short, a lot of bad things could happen. If you are connecting to a
    database, you could use up all available connections, meaning no one can
    talk to the database until you release your connections.

    Although you commonly hear about memory leaks as causing programs to fail, a
    resource leak is just as bad and occurs when a program fails to release its
    connections to a resource, resulting in the resource becoming inaccessible.
    Writing code that simplifies closing resources is what this section is about.

     */
    public void readFile(String file) {
       FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");// Read file data
            } catch (IOException e) {
            e.printStackTrace();
            } finally {
            if(is != null) {
                try {
                    is.close();
                    } catch (IOException e2) {
                    e2.printStackTrace();
                    }
                }
            }
        }
    /*
    Half the lines of code in this method are just closing a resource. And the
    more resources you have, the longer code like this becomes. For example,
    you may have multiple resources and they need to be closed in a particular
    order. You also don’t want an exception from closing one resource to
    prevent the closing of another resource.
    To solve this, Java includes the try-with-resources statement to
    automatically close all resources opened in a try clause. This feature is
    also known as automatic resource management, because Java
    automatically takes care of the closing.

     */
    public void readFileWithResources (String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")){
            //read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*IMPLICIT FINALLY BLOCKS
    Behind the scenes, the compiler replaces a try-with-resources block
    with a try and finally block. We refer to this “hidden” finally
    block as an implicit finally block since it is created and used by the
    compiler automatically. You can still create a programmer-defined
    finally block when using a try-with-resources statement; just be
    aware that the implicit one will be called first.

     */

}
