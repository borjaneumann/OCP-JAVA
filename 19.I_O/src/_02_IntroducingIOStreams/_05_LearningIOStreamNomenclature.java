package _02_IntroducingIOStreams;

public class _05_LearningIOStreamNomenclature {
    /*
    The java.io API provides numerous classes for creating, accessing, and
    manipulating streams—so many that it tends to overwhelm many new
    Java developers. Stay calm! We will review the major differences between
    each stream class and show you how to distinguish between them.
    Even if you come across a particular stream on the exam that you do not
    recognize, often the name of the stream gives you enough information to
    understand exactly what it does.

    Byte Streams vs. Character Streams
    ==================================
    The java.io API defines two sets of stream classes for reading and
    writing streams: byte streams and character streams.

    Differences between Byte and Character Streams
    ==============================================
    - Byte streams read/write binary data ( 0s and 1s) and have class names that
    end in InputStream or OutputStream.
    - Character streams read/write text data and have class names that end in
    Reader or Writer.

    The API frequently includes similar classes for both byte and character
    streams, such as FileInputStream and FileReader. The difference
    between the two classes is based on how the bytes of the stream are read
    or written.

    It is important to remember that even though character streams do not
    contain the word Stream in their class name, they are still I/O streams. The
    use of Reader/ Writer in the name is just to distinguish them from byte
    streams.

    Throughout the chapter, we will refer to both InputStream and
    Reader as input streams, and we will refer to both OutputStream
    and Writer as output streams.

    The byte streams are primarily used to work with binary data, such as an
    image or executable file, while character streams are used to work with
    text files. Since the byte stream classes can write all types of binary data,
    including strings, it follows that the character stream classes aren't strictly
    necessary. There are advantages, though, to using the character stream
    classes, as they are specifically focused on managing character and string
    data. For example, you can use a Writer class to output a String value to
    a file without necessarily having to worry about the underlying character
    encoding of the file.

    The character encoding determines how characters are encoded and stored
    in bytes in a stream and later read back or decoded as characters. Although
    this may sound simple, Java supports a wide variety of character
    encodings, ranging from ones that may use one byte for Latin characters,
    UTF‐8 and ASCII for example, to using two or more bytes per character,
    such as UTF‐16. For the exam, you don't need to memorize the character
    encodings, but you should be familiar with the names if you come across
    them on the exam.

    CHARACTER ENCODING IN JAVA
    ==========================
    In Java, the character encoding can be specified using the Charset
    class by passing a name value to the static Charset.forName()
    method, such as in the following examples:

    Charset usAsciiCharset = Charset.forName("US-ASCII");
    Charset utf8Charset = Charset.forName("UTF-8");
    Charset utf16Charset = Charset.forName("UTF-16");

    Java supports numerous character encodings, each specified by a
    different standard name value.
    For character encoding, just remember that using a character stream is
    better for working with text data than a byte stream. The character stream
    classes were created for convenience, and you should certainly take
    advantage of them when possible.
    Input vs. Output Streams
    Most InputStream stream classes have a corresponding OutputStream
    class, and vice versa. For example, the FileOutputStream class writes
    data that can be read by a FileInputStream. If you understand the
    features of a particular Input or Output stream class, you should naturally
    know what its complementary class does.
    It follows, then, that most Reader classes have a corresponding Writer
    class. For example, the FileWriter class writes data that can be read by a
    FileReader.
    There are exceptions to this rule. For the exam, you should know that
    PrintWriter has no accompanying PrintReader class. Likewise, the
    PrintStream is an OutputStream that has no corresponding InputStream
    class. It also does not have Output in its name. We will discuss these
    classes later this chapter.

    Low‐Level vs. High‐Level Streams
    ================================
    Another way that you can familiarize yourself with the java.io API is by
    segmenting streams into low‐level and high‐level streams.
    A low‐level stream connects directly with the source of the data, such as a
    file, an array, or a String. Low‐level streams process the raw data or
    resource and are accessed in a direct and unfiltered manner. For example,
    a FileInputStream is a class that reads file data one byte at a time.
    Alternatively, a high‐level stream is built on top of another stream using
    wrapping. Wrapping is the process by which an instance is passed to the
    constructor of another class, and operations on the resulting instance are
    filtered and applied to the original instance. For example, take a look at
    the FileReader and BufferedReader objects in the following sample
    code:

    try (var br = new BufferedReader(new FileReader("zoodata.txt"))) {
    System.out.println(br.readLine());
    }

    In this example, FileReader is the low‐level stream reader, whereas
    BufferedReader is the high‐level stream that takes a FileReader as input.
    Many operations on the high‐level stream pass through as operations to
    the underlying low‐level stream, such as read() or close(). Other
    operations override or add new functionality to the low‐level stream
    methods. The high‐level stream may add new methods, such as
    readLine(), as well as performance enhancements for reading and
    filtering the low‐level data.
    High‐level streams can take other high‐level streams as input. For
    example, although the following code might seem a little odd at first, the
    style of wrapping a stream is quite common in practice:

    try (var ois = new ObjectInputStream(
    new BufferedInputStream(
    new FileInputStream("zoo-data.txt")))) {
    System.out.print(ois.readObject());
    }

    In this example, FileInputStream is the low‐level stream that interacts
    directly with the file, which is wrapped by a high‐level
    BufferedInputStream to improve performance. Finally, the entire object
    is wrapped by a high‐level ObjectInputStream, which allows us to
    interpret the data as a Java object.
    For the exam, the only low‐level stream classes you need to be familiar
    with are the ones that operate on files. The rest of the nonabstract stream
    classes are all high‐level streams.

    USE BUFFERED STREAMS WHEN WORKING WITH FILES
    ============================================
    As briefly mentioned, Buffered classes read or write data in groups,
    rather than a single byte or character at a time. The performance
    gain from using a Buffered class to access a low‐level file stream
    cannot be overstated. Unless you are doing something very
    specialized in your application, you should always wrap a file
    stream with a Buffered class in practice.
    One of the reasons that Buffered streams tend to perform so well in
    practice is that many file systems are optimized for sequential disk
    access. The more sequential bytes you read at a time, the fewer
    round‐trips between the Java process and the file system, improving
    the access of your application. For example, accessing 1,600
    sequential bytes is a lot faster than accessing 1,600 bytes spread
    across the hard drive.

    Stream Base Classes
    ===================
    The java.io library defines four abstract classes that are the parents of all
    stream classes defined within the API: InputStream, OutputStream,
    Reader, and Writer.
    The constructors of high‐level streams often take a reference to the
    abstract class. For example, BufferedWriter takes a Writer object as
    input, which allows it to take any subclass of Writer.
    One common area where the exam likes to play tricks on you is mixing
    and matching stream classes that are not compatible with each other. For
    example, take a look at each of the following examples and see whether
    you can determine why they do not compile:

    new BufferedInputStream(new FileReader("z.txt")); // DOES NOT COMPILE
    new BufferedWriter(new FileOutputStream("z.txt")); // DOES NOT COMPILE
    new ObjectInputStream(new FileOutputStream("z.txt")); // DOES NOT COMPILE
    new BufferedInputStream(new InputStream()); // DOES NOT COMPILE

    The first two examples do not compile because they mix Reader/ Writer
    classes with InputStream/ OutputStream classes, respectively. The third
    example does not compile because we are mixing an OutputStream with
    an InputStream. Although it is possible to read data from an InputStream
    and write it to an OutputStream, wrapping the stream is not the way to do
    so. As you will see later in this chapter, the data must be copied over,
    often iteratively. Finally, the last example does not compile because
    InputStream is an abstract class, and therefore you cannot create an
    instance of it.

    Decoding I/O Class Names
    ========================
    Pay close attention to the name of the I/O class on the exam, as decoding it
    often gives you context clues as to what the class does. For example,
    without needing to look it up, it should be clear that FileReader is a class
    that reads data from a file as characters or strings. Furthermore,
    ObjectOutputStream sounds like a class that writes object data to a byte
    stream.

    Review of java.io Class Name Properties
    =======================================
    A class with the word InputStream or OutputStream in its name is used
    for reading or writing binary or byte data, respectively.
    A class with the word Reader or Writer in its name is used for reading or
    writing character or string data, respectively.
    Most, but not all, input classes have a corresponding output class.
    A low‐level stream connects directly with the source of the data.
    A high‐level stream is built on top of another stream using wrapping.
    A class with Buffered in its name reads or writes data in groups of bytes
    or characters and often improves performance in sequential file systems.
    With a few exceptions, you only wrap a stream with another stream if they
    share the same abstract parent.
    For the last rule, we'll cover some of those exceptions (like wrapping an
    OutputStream with a PrintWriter) later in the chapter.
    Table 19.2 lists the abstract base classes that all I/O streams inherited from.
    TABLE 19.2 The java.io abstract stream base classes

    Class Name              Description
    ========================================================================
    InputStream             Abstract class for all input byte streams
    OutputStream            Abstract class for all output byte streams
    Reader                  Abstract class for all input character streams
    Writer                  Abstract class for all output character streams

    Table 19.3 lists the concrete I/O streams that you should be familiar with
    for the exam. Note that most of the information about each stream, such as
    whether it is an input or output stream or whether it accesses data using
    bytes or characters, can be decoded by the name alone.
    TABLE 19.3 The java.io concrete stream classes

    Class Name              Low/HighLevel           Description
    ===============================================================================================
    FileInputStream         Low                     Reads file data as bytes
    FileOutputStream        Low                     Writes file data as bytes
    FileReader              Low                     Reads file data as characters
    FileWriter              Low                     Writes file data as characters
    BufferedInputStream     High                    Reads byte data from an existing InputStream in a
                                                    buffered manner, which improves efficiency and
                                                    performance
    BufferedOutputStream    High                    Writes byte data to an existing OutputStream in a
                                                    buffered manner, which improves efficiency and
                                                    performance
    BufferedReader          High                    Reads character data from an existing Reader in a
                                                    buffered manner, which improves efficiency and
                                                    performance
    BufferedWriter          High                    Writes character data to an existing Writer in a
                                                    buffered manner, which improves efficiency and
                                                    performance
    ObjectInputStream       High                    Deserializes primitive Java data types and graphs
                                                    of Java objects from an existing InputStream
    ObjectOutputStream      High                    Serializes primitive Java data types and graphs of
                                                    Java objects to an existing OutputStream
    PrintStream             High                    Writes formatted representations of Java objects to
                                                    a binary stream
    PrintWriter             High                    Writes formatted representations of Java objects to
                                                    a character stream
     */
}
