package _6_GenericMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _8_UnderstandGenericSupertypes {

    //When you have subclasses and superclasses, lower bounds can get
    //tricky.
    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<Exception>();
//        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    /* Line 13 references a List that could be List<IOException> or
    List<Exception> or List<Object>.
    Line 14 does not compile because we could have a List<IOException> and an Exception
    object wouldn't fit in there.
    Line 15 is fine. IOException can be added to any of those types.
    Line 16 is also fine. FileNotFoundException can also be added to any of
    those three types. This is tricky because FileNotFoundException is
     subclass of IOException, and the keyword says super. What
    happens is that Java says, “Well, FileNotFoundException also
    happens to be an IOException, so everything is fine.”*/

}
