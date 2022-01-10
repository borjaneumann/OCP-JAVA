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

    FORMAT()
    ========
    // PrintStream
    public PrintStream format(String format, Object args…)
    public PrintStream format(Locale loc, String format, Object args…)

    // PrintWriter
    public PrintWriter format(String format, Object args…)
    public PrintWriter format(Locale loc, String format, Object args…)

    printf() ==  format()

    As an example, the following two format() calls print the same text:

    String name = "Lindsey";
    int orderId = 5;

    // Both print: Hello Lindsey, order 5 is ready
    System.out.format("Hello "+name+", order "+orderId+" is ready");
    System.out.format("Hello %s, order %d is ready", name, orderId);

    Common print stream format() symbols
    =================================================================
    Symbol      Description
    %s          Applies to any type, commonly String values
    %d          Applies to integer values like int and long
    %f          Applies to floating‐point values like float and double
    %n          Inserts a line break using the system‐dependent line separator

    String name = "James";
    double score = 90.25;
    int total = 100;
    System.out.format("%s:%n Score: %f out of %d", name, score, total);
    This prints the following:
    James:
    Score: 90.250000 out of 100

    Mixing data types may cause exceptions at runtime. For example, the
    following throws an exception because a floating‐point number is used
    when an integer value is expected:

    System.out.format("Food: %d tons", 2.0); //
    IllegalFormatConversionException


     */

}
