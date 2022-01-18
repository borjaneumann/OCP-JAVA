public class _31_Files_ReadAllLinesVSFiles_Lines {
    /*
    For the exam, you need to know the difference between readAllLines() and lines().
    Both of these examples compile and run:

    Files.readAllLines(Paths.get("birds.txt")).forEach(System.out::println);
    Files.lines(Paths.get("birds.txt")).forEach(System.out::println);

    The first line reads the entire file into memory and performs a print
    operation on the result, while the second line lazily processes each
    line and prints it as it is read.

    The advantage of the second code snippet is that it does not require
    the entire file to be stored in memory at any time.

    You should also be aware of when they are mixing incompatible
    types on the exam. Do you see why the following does not compile?

    Files.readAllLines(Paths.get("birds.txt"))
    .filter(s -> s.length()> 2)
    .forEach(System.out::println);

    The readAllLines() method returns a List, not a Stream, so the
    filter() method is not available.
     */

}
