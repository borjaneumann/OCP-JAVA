package _03_DeclaringConstructor;

public class _10_CallingOverloadedConstructorsWithThis {
    /*
    Remember, a single class can have multiple constructors. This is referred
    to as constructor overloading because all constructors have the same
    inherent name but a different signature.

    public class Hamster {
        private String color;
        private int weight;
        public Hamster(int weight) { // First constructor
            this.weight = weight;
            color = "brown";
        }
        public Hamster(int weight, String color) { // Second constructor
            this.weight = weight;
            this.color = color;
        }
    }
    There is a bit of duplication, as this.weight is assigned twice in the same
    way in both constructors. In programming, even a bit of duplication tends
    to turn into a lot of duplication as we keep adding “just one more thing.”
    What we really want is for the first constructor to call
    the second constructor with two parameters. So, how can you have a
    constructor call another constructor? You might be tempted to write this:

    public Hamster(int weight) {
        Hamster(weight, "brown"); // DOES NOT COMPILE
                                  // Constructors can be called only by writing new before
                                  // the name of the constructor.
    }
    public Hamster(int weight) {
        new Hamster(weight, "brown"); // Compiles, but incorrect
    }
    SOLUTION!!
    =========
    Java provides a solution: this()—yes, the same keyword we used to refer
    to instance members. When this() is used with parentheses, Java calls
    another constructor on the same instance of the class.
    public Hamster(int weight) {
        this(weight, "brown");
    }
    Special rule 1
    --------------
    Calling this() has one special rule you need to know. If you choose to
    call it, the this() call must be the first statement in the constructor. The
    side effect of this is that there can be only one call to this() in any
    constructor.

    public Hamster(int weight) {
        System.out.println("in constructor");
        // Set weight and default color
        this(weight, "brown"); // DOES NOT COMPILE
    }

    Special rule 2
    --------------
    There’s one last rule for overloaded constructors you should be aware of.
    Consider the following definition of the Gopher class:
    public class Gopher {
        public Gopher(int dugHoles) {
            this(5); // DOES NOT COMPILE
        }
    }
    The compiler is capable of detecting that this constructor is calling itself
    infinitely. Since this code can never terminate, the compiler stops and
    reports this as an error. Likewise, this also does not compile:
    public class Gopher {
        public Gopher() {
            this(5); // DOES NOT COMPILE
    }
    public Gopher(int dugHoles) {
            this(); // DOES NOT COMPILE
        }
    }
    In this example, the constructors call each other, and the process continues
    infinitely. Since the compiler can detect this, it reports this as an error.

    THIS VS. THIS()
    ===============
    Despite using the same keyword, this and this() are very
    different. The first, this, refers to an instance of the class, while the
    second, this(), refers to a constructor call within the class. The
    exam may try to trick you by using both together, so make sure you
    know which one to use and why.
     */
}
