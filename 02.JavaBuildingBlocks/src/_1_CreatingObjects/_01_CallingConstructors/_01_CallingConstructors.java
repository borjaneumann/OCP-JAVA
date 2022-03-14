package _1_CreatingObjects._01_CallingConstructors;

public class _01_CallingConstructors {
    /*
    To create an instance of a class, all you have to do is write new before the
    class name and add parentheses after it. Here’s an example:

    Park p = new Park();

    First you declare the type that you’ll be creating (Park) and give the
    variable a name (p). This gives Java a place to store a reference to the
    object. Then you write new Park() to actually create the object.

    Park() looks like a method since it is followed by parentheses. It’s called
    a constructor, which is a special type of method that creates a new object.
    Now it’s time to define a constructor of your own:

    public class Chick {
        public Chick() {
        System.out.println("in constructor");
        }
    }
    Two key points to note about the constructor:
        * the name of the constructor matches the name of the class
        * there’s no return type.

    The purpose of a constructor is to initialize fields, although you can put
    any code in there. Another way to initialize fields is to do so directly on
    the line on which they’re declared. This example shows both approaches:

    public class Chicken {
        int numEggs = 12; // initialize on line
        String name;
        public Chicken() {
            name = "Duke"; // initialize in constructor
        }
    }
    For most classes, you don’t have to code a constructor—the compiler will
    supply a “do nothing” default constructor for you. There are some
    scenarios that do require you declare a constructor. You’ll learn all about
    them in Chapter 8, “Class Design.”

     */
}
