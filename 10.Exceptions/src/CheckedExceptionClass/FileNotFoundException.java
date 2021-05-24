package CheckedExceptionClass;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundException {

    public static void main(String[] args) throws java.io.FileNotFoundException {
        File file = new File("anyFile");
        FileInputStream fis = new FileInputStream(file);
        System.out.println("Hello");
    }
}

