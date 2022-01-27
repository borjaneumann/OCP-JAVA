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

    /*
    INCLUDING POTENTIALLY LARGE RESOURCES
    =====================================
    An INCLUSION ATTACK is when multiple files or components are embedded
    within a single file. Any file that you didn't create is suspect. Some types
    can appear smaller than they really are. For example, some types of
    images can have a “zip bomb” where the file is heavily compressed on
    disk. When you try to read it in, the file uses much more space than you
    thought.

    Extensible Markup Language (XML) files can have the same problem.
    One attack is called the “BILLION LAUGHS ATTACK” where the file gets
    expanded exponentially.
    The reason these files can become unexpectedly large is that they can
    include other entities. This means something that is 1 KB can become
    exponentially larger if it is included enough times.

    While handling large files is beyond the scope of the exam, you should
    understand how and when these issues can come up.
    Inclusion attacks are often known for when they include potentially
    hosted content. For example, imagine you have a web page that
    includes a script on another website. You don't control the script, but
    Hacker Harry does. Including scripts from other websites is
    dangerous regardless of how big they are.
     */

    /*
    OVERFLOWING NUMBERS
    ===================
    When checking file size, be careful with an int type and loops. Since an
    int has a maximum size, exceeding that size results in integer overflow.
    Incrementing an int at the maximum value results in a negative number,
    so validation might not work as expected. In this example, we have a
    requirement to make sure that we can add a line to a file and have the size
    stay under a million.*/

    public static void main(String[] args) {
        System.out.println(enoughRoomToAddLine(100));
        System.out.println(enoughRoomToAddLine(2_000_000));
        System.out.println(enoughRoomToAddLine(Integer.MAX_VALUE));
    }
    public static boolean enoughRoomToAddLine(int requestedSize) {
        int maxLength = 1_000_000;
        String newLine = "END OF FILE";
        int newLineSize = newLine.length();
        return requestedSize + newLineSize < maxLength;
    }/*
    The output of this program is as follows:
    true
    false
    true

    The first true should make sense. We start with a small file and add a
    short line to it. This is definitely under a million. The second value is
    false because two million is already over a million even after adding our
    short line.

    Then we get to the final output of true. We start with a giant number that
    is over a million. Adding a small number to it exceeds the capacity of an
    int. Java overflows the number into a very negative number. Since all
    negative numbers are under a million, the validation doesn't do what we
    want it to.
    When accepting numeric input, you need to verify it isn't too large or too
    small. In this example, the input value requestedSize should have been
    checked before adding it to newLineSize.
     */

}
