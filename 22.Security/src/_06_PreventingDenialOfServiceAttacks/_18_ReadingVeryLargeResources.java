package _06_PreventingDenialOfServiceAttacks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _18_ReadingVeryLargeResources {
    /*
    READING VERY LARGE RESOURCES
    ============================
    Another source of a denial of service attacks is very large resources.
    Suppose we have a simple method that reads a file into memory, does
    some transformations on it, and writes it to a new file.
     */
    public void transform(Path in, Path out) throws IOException {
        var list = Files.readAllLines(in);
        list.removeIf(s -> s.trim().isBlank());
        Files.write (out, list);
    }
    /*
    On a small file, this works just fine. However, on an extremely large file,
    your program could run out of memory and crash. Hacker Harry strikes
    again! To prevent this problem, you can check the size of the file before
    reading it.
     */
}
