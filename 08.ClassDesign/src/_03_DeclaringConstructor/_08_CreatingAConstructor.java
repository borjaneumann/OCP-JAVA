package _03_DeclaringConstructor;

public class _08_CreatingAConstructor {
    /*
    A constructor is a special method that matches the name of the class
    and has no return type. It is called when a new instance of the class is created.

    public class Bunny {
        public Bunny() {
            System.out.println("constructor");
        }
    }

    Not a constructor
    =================
    public class Bunny {
        public bunny() { } // DOES NOT COMPILE
        public void Bunny() { }
    }
    Not var as parameter
    ====================
    Like method parameters, constructor parameters can be any valid class,
    array, or primitive type, including generics, but may not include var. The
    following does not compile:
    class Bonobo {
        public Bonobo(var food) { // DOES NOT COMPILE
        }
    }
    Constructor overloading
    =======================
    A class can have multiple constructors, so long as each constructor has a
    unique signature. In this case, that means the constructor parameters must
    be distinct. Like methods with the same name but different signatures,
    declaring multiple constructors with different signatures is referred to as
    constructor overloading. The following Turtle class has four distinct
    overloaded constructors:
    public class Turtle {
        private String name;
        public Turtle() {
            name = "John Doe";
        }
        public Turtle(int age) {}
        public Turtle(long age) {}
        public Turtle(String newName, String... favoriteFoods) {
            name = newName;
        }
    }
    Instantiation
    =============
    Constructors are used when creating a new object. This process is called
    instantiation because it creates a new instance of the class. A constructor
    is called when we write new followed by the name of the class we want to
    instantiate. Here’s an example:
    new Turtle()
    When Java sees the new keyword, it allocates memory for the new object.
    It then looks for a constructor with a matching signature and calls it.



     */
}

