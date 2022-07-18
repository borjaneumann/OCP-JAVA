package _04_WorkingWithIOStreamClasses;

import java.io.*;

public class _11_ReadingAndWritingBinaryData {
    /*
    Some of the techniques for accessing streams may seem a bit new to you, but as you
    will see, they are similar among different stream classes. The I/O stream classes
    include numerous overloaded constructors and methods. Hundreds in fact.

    READING AND WRITING BINARY DATA
    ===============================
    FileInputStream and FileOutputStream

    public FileInputStream(File file) throws FileNotFoundException
    public FileInputStream(String name) throws FileNotFoundException
    public FileOutputStream(File file) throws FileNotFoundException
    public FileOutputStream(String name) throws FileNotFoundException
     */

    void copyFile(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
             var out = new FileOutputStream(dest)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
    //If the destination file already exists, this
    //implementation will overwrite it, since the append flag was not sent. The
    //copy() method copies one byte at a time until it reads a value of ‐1.
}
