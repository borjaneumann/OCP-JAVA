import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _06_PreventingDenialOfServiceAttacks {

    /*
    Intro
    =====
    (DoS) - A denial of service (DoS) attack is when a hacker makes one or more
    requests with the intent of disrupting legitimate requests. Most denial of
    service attacks require multiple requests to bring down their targets.
    Some attacks send a very large request that can even bring down the application
    in one shot. In this book, we will focus on denial of service attacks.
    Unless otherwise specified, a denial of service attack comes from one
    machine. It may make many requests, but they have the same origin.

    (DDoS) - By contrast, a distributed denial of service (DDoS) attack is a denial of
    service attack that comes from many sources at once. For example, many
    machines may attack the target. In this section, we will look at some
    common sources of denial of service issues.

    LEAKING RESOURCES
    =================
    A hacker can take advantage of poorly written code. This simple method counts the number
    of lines in a file using NIO.2
    */
    public long countLines(Path path) throws IOException {
        return Files.lines(path).count();
    }/*
    Hacker Harry likes this method. He can call it in a loop. Since the method
    opens a file system resource and never closes it, there is a resource leak.
    After Hacker Harry calls the method enough times, the program crashes
    because there are no more file handles available.

    We fix the code by using the try‐with‐resources statement.
     */
    public long countLinesFixed (Path path) throws IOException {
        try (var stream = Files.lines(path)) {
            return stream.count();
        }
    }
    /*
    READING VERY LARGE RESOURCES
    ============================
    Another source of a denial of service attacks is very large resources.
    Suppose we have a simple method that reads a file into memory, does
    some transformations on it, and writes it to a new file.
     */
    public void transform( Path in, Path out) throws IOException {
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
