public class _4_StreamClassesNameProperties {
    public static void main(String[] args) {
        /*
        * A class with the word InputStream or OutputStream in its name is used
        for reading or writing binary or byte data, respectively.
        * A class with the word Reader or Writer in its name is used for reading or
        writing character or string data, respectively.
        * Most, but not all, input classes have a corresponding output class.
        * A low‐level stream connects directly with the source of the data.
        * A high‐level stream is built on top of another stream using wrapping.
        * A class with Buffered in its name reads or writes data in groups of bytes
        or characters and often improves performance in sequential file systems.
        * With a few exceptions, you only wrap a stream with another stream if they
        share the same abstract parent.
        For the last rule, we'll cover some of those exceptions (like wrapping an
        OutputStream with a PrintWriter) later in the chapter.

        The java.io abstract stream base classes
        Class Name              Description
        ==================================================================================
        InputStream             Abstract class for all input byte streams
        OutputStream            Abstract class for all output byte streams
        Reader                  Abstract class for all input character streams
        Writer                  Abstract class for all output character streams

        The java.io concrete stream classes
        Class Name              Low/High Level          Description
        * ===================================================================================================================
        FileInputStream         Low                     Reads file data as bytes
        FileOutputStream        Low                     Writes file data as bytes
        FileReader              Low                     Reads file data as characters
        FileWriter              Low                     Writes file data as characters
        BufferedInputStream     High                    Reads byte data from an existing InputStream in a buffered manner,
                                                        which improves efficiency and performance
        BufferedOutputStream    High                    Writes byte data to an existing OutputStream in a buffered manner,
                                                        which improves efficiency and performance
        BufferedReader          High                    Reads character data from an existing Reader in a buffered manner,
                                                        which improves efficiency and performance
        BufferedWriter          High                    Writes character data to an existing Writer in a buffered manner,
                                                        which improves efficiency and performance
        ObjectInputStream       High                    Deserializes primitive Java data types and graphs of Java objects
                                                        from an existing InputStream
        ObjectOutputStream      High                    Serializes primitive Java data types and graphs of Java objects to
                                                        an existing OutputStream
        PrintStream             High                    Writes formatted representations of Java objects to a binary stream
        PrintWriter             High                    Writes formatted representations of Java objects to a character stream

         */

    }
}
