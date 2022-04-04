package _02_RecognizingExceptionClasses._02_CheckedExceptionClasses;

import java.io.File;
import java.io.FileInputStream;

public class _11_FileNotFoundException {

    /*
    Subclass of IOException thrown programmatically when code tries to reference
    a file that does not exist
     */

    public static void main(String[] args) throws java.io.FileNotFoundException {
        File file = new File("anyFile");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("Hello");
    }
}

