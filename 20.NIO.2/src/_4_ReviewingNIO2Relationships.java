public class _4_ReviewingNIO2Relationships {

    /*
        NIO.2 makes extensive use of the factory
        pattern. You should become comfortable with this paradigm. Many of
        your interactions with NIO.2 will require two types: an abstract class or
        interface and a factory or helper class. Figure 20.2 shows the relationships
        among NIO.2 classes, as well as select java.io and java.net classes.

        When working with NIO.2, keep an eye on
        whether the class name is singular or plural. The classes with plural names
        include methods to create or operate on class/interface instances with
        singular names. Remember, a Path can also be created from the Path
        interface, using the static factory of() method.

        class java.nio.file.Files, which we'll
        cover later in the chapter. For now, you just need to know that it is a
        helper or utility class that operates primarily on Path instances to read or
        modify actual files and directories.

        The java.io.File is the I/O class you worked with in Chapter 19,
        while Files is an NIO.2 helper class. Files operates on Path
        instances, not java.io.File instances. We know this is confusing,
        but they are from completely different APIs!


     */
}
