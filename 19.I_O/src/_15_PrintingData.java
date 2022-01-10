public class _15_PrintingData {

    /*
    PrintStream and PrintWriter are high‐level output print streams classes
    that are useful for writing text data to a stream. We cover these classes
    together, because they include many of the same methods. Just remember
    that one operates on an OutputStream and the other a Writer.

    The print stream classes have the distinction of being the only I/O stream
    classes we cover that do not have corresponding input stream classes. And
    unlike other OutputStream classes, PrintStream does not have Output in
    its name.

    The print stream classes include the following constructors:

    public PrintStream(OutputStream out)
    public PrintWriter(Writer out)

    For convenience, these classes also include constructors that automatically
    wrap the print stream around a low‐level file stream class, such as
    FileOutputStream and FileWriter.

    public PrintStream(File file) throws FileNotFoundException
    public PrintStream(String fileName) throws FileNotFoundException
    public PrintWriter(File file) throws FileNotFoundException
    public PrintWriter(String fileName) throws FileNotFoundException

    Furthermore, the PrintWriter class even has a constructor that takes an
    OutputStream as input. This is one of the few exceptions in which we can
    mix a byte and character stream.
    public PrintWriter(OutputStream out)

    When working with String data, you should use a Writer, so our
    examples in this part of the chapter use PrintWriter. Just be aware that
    many of these examples can be easily rewritten to use a PrintStream.

    PRINT()
    =======
    Under the covers, these methods often just perform String.valueOf() on the
    argument and call the underlying stream's write() method to add it to the
    stream. For example, the following sets of print/ write code are
    equivalent:

    try (PrintWriter out = new PrintWriter("zoo.log")) {
    out.write(String.valueOf(5)); // Writer method
    out.print(5); // PrintWriter method

    var a = new Chimpanzee();
    out.write(a==null ? "null": a.toString()); // Writer method
    out.print(a); // PrintWriter method
    }

    PRINTLN()
    =========
    Virtually identical to the print() methods, except that they also print a line break
    after the String value is written.
    Like the file.separator property, the line.separatorvalue is available from two places,
    as a Java system property and via a static method.

    System.getProperty("line.separator");
    System.lineSeparator();


     */

}
