package _03_CommonIOStreamOperations;

public class _10_ReviewingCommonIOStreamMethods {
        /*
    These are the common stream methods you should know for this
    chapter. For the read() and write() methods that take primitive arrays,
    the method parameter type depends on the stream type. Byte streams
    ending in InputStream/ OutputStream use byte[], while character
    streams ending in Reader/ Writer use char[].

    Common I/O stream methods
    Stream Class            Method Name                                 Description
    =================================================================================================================================================
    All streams             void close()                                Closes stream and releases resources
    All input streams       int read()                                  Reads a single byte or returns ‐1 if no bytes were available
    Input Stream            int read(byte[] b)                          Reads values into a buffer. Returns number of bytes read
    Reader                  int read(char[] c)                          Reads values into a buffer. Returns number of bytes rea
    Input Stream            int read(byte[] b, int offset, int length)  Reads up to length values into a buffer starting from position offset. Returns
                                                                        number of bytes read.
    Reader                  int read(char[] c, int offset, int length)  Reads up to length values into a buffer starting from position offset. Returns
                                                                        number of bytes read.
    All output streams      void write(int)                             Writes a single byte
    OutputStream            void write(byte[] b)                        Writes an array of values into the stream
    Write r                 void write(char[] c)                        Writes an array of values into the stream
    OutputStream            void write(byte[] b, int offset, int length)Writes length values from an array into the stream, starting with an offset index
    Writer                  void write(char[] c, int offset, int length)Writes length values from an array into the stream, starting with an offset index
    All input streams       boolean markSupported()                     Returns true if the stream class supports mark()
    All input streams       mark(int readLimit)                         Marks the current position in the stream
    All input streams       void reset()                                Attempts to reset the stream to the mark() position
    All input streams       long skip(long n)                           Reads and discards a specified number of characters
    All output streams      void flush()                                Flushes buffered data through the stream

    Remember that input and output streams can refer to both byte and
    character streams throughout this chapter.

     */
}
