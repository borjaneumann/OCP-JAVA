package _04_ApplyingTheStaticKeyword;

public class _15_StaticImports {
    /*
    In Chapter 1, you saw that we could import a specific class or all the
    classes in a package:

    import java.util.ArrayList;
    import java.util.*;

    We could use this technique to import two classes:

    import java.util.List;
    import java.util.Arrays;
    public class Imports {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("one", "two");
        }
    }
    There is another type of import called a static import.
    Regular imports are for importing classes.
    Static imports are for importing static members of classes.
    An example of when static imports shine is when
    you are referring to a lot of constants in another class.

    The previous method has one static method call: Arrays.asList.
    Rewriting the code to use a static import yields the following:
    import java.util.List;
    import static java.util.Arrays.asList; // static import
    public class StaticImports {
        public static void main(String[] args) {
            List<String> list = asList("one", "two"); // no Arrays.
        }
    }
    WHY DOES NOT COMPILE?
    import static java.util.Arrays; // DOES NOT COMPILE
    import static java.util.Arrays.asList;
    static import java.util.Arrays.*; // DOES NOT COMPILE
    public class BadStaticImports {
        public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE
        }
    }

   The compiler will complain if you try to explicitly do a static
   import of two methods with the same name or two static variables with the same name.
   Here’s an example:

        import static statics.A.TYPE;
        import static statics.B.TYPE; // DOES NOT COMPILE

   Luckily, when this happens, we can just refer to the static members via
   their class name in the code instead of trying to use a static import.
     */
}
