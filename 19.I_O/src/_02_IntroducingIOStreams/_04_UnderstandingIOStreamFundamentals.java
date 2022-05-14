package _02_IntroducingIOStreams;

public class _04_UnderstandingIOStreamFundamentals {
    /*
    The contents of a file may be accessed or written via a stream, which is a
    list of data elements presented sequentially. Streams should be
    conceptually thought of as a long, nearly never‐ending “stream of water”
    with data presented one “wave” at a time.

    The stream can be so large that once we start reading it, we have no idea
    where the beginning or the end is. We just have a pointer to our current
    position in the stream and read data one block at a time.

    Each type of stream segments data into a “wave” or “block” in a particular
    way. For example, some stream classes read or write data as individual
    bytes. Other stream classes read or write individual characters or strings of
    characters. On top of that, some stream classes read or write larger groups
    of bytes or characters at a time, specifically those with the word Buffered
    in their name.

    ALL JAVA I/O STREAMS USE BYTES
    ==============================
    Although the java.io API is full of streams that handle characters,
    strings, groups of bytes, and so on, nearly all are built on top of
    reading or writing an individual byte or an array of bytes at a time.
    The reason higher‐level streams exist is for convenience, as well as
    performance.
    For example, writing a file one byte at a time is time‐consuming and
    slow in practice because the round‐trip between the Java application
    and the file system is relatively expensive. By utilizing a
    BufferedOutputStream, the Java application can write a large
    chunk of bytes at a time, reducing the round‐trips and drastically
    improving performance.
    Although streams are commonly used with file I/O, they are more
    generally used to handle the reading/writing of any sequential data source.
    For example, you might construct a Java application that submits data to a
    website using an output stream and reads the result via an input stream.

    I/O STREAMS CAN BE BIG
    ======================
    When writing code where you don't know what the stream size will
    be at runtime, it may be helpful to visualize a stream as being so
    large that all of the data contained in it could not possibly fit into
    memory. For example, a 1 terabyte file could not be stored entirely
    in memory by most computer systems (at the time this book is being
    written). The file can still be read and written by a program with
    very little memory, since the stream allows the application to focus
    on only a small portion of the overall stream at any given time.

     */

}
