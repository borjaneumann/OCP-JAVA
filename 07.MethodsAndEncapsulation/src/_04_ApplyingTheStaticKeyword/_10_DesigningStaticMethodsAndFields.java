package _04_ApplyingTheStaticKeyword;

public class _10_DesigningStaticMethodsAndFields {
    /*
    When the static keyword is applied to a variable, method, or class, it
    applies to the class rather than a specific instance of the class. In this
    section, you will see that the static keyword can also be applied to
    import statements.

    Static methods don’t require an instance of the class. They are shared
    among all users of the class. You can think of a static variable as being a
    member of the single class object that exists independently of any
    instances of that class.

    public class Koala {
        public static int count = 0; // static variable
        public static void main(String[] args) { // static method
            System.out.println(count);
        }
    }
    Here the JVM basically calls Koala.main() to get the program started.
    You can do this too. We can have a KoalaTester that does nothing but
    call the main() method:

    public class KoalaTester {
        public static void main(String[] args) {
        Koala.main(new String[0]); // call static method
        }
     }
    In addition to main() methods, static methods have two main purposes:
    1) For utility or helper methods that don’t require any object state. Since
    there is no need to access instance variables, having static methods
    eliminates the need for the caller to instantiate an object just to call the
    method.
    2) For state that is shared by all instances of a class, like a counter. All
    instances must share the same state. Methods that merely use that state
    should be static as well.
     */
}
