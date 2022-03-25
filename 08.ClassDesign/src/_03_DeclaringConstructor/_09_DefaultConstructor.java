package _03_DeclaringConstructor;

public class _09_DefaultConstructor {
    /*
    Every class in Java has a constructor whether you code one or not. If you
    don’t include any constructors in the class, Java will create one for you
    without any parameters. This Java-created constructor is called the default
    constructor and is added anytime a class is declared without any
    constructors. We often refer to it as the default no-argument constructor
    for clarity. Here’s an example:

    public class Rabbit {
        public static void main(String[] args) {
            Rabbit rabbit = new Rabbit(); // Calls default constructor
        }
    }
    In the Rabbit class, Java sees no constructor was coded and creates one.
    This default constructor is equivalent to typing this:
    public Rabbit() {}

    Which of these classes do you think has a default constructor?
    public class Rabbit1 {} //only this one
    public class Rabbit2 {
        public Rabbit2() {}
    }
    public class Rabbit3 {
    public Rabbit3(boolean b) {}
    }
    public class Rabbit4 {
        private Rabbit4() {}
    }

    Note
    ====
    Having only private constructors in a class tells the compiler not to
    provide a default no-argument constructor. It also prevents other
    classes from instantiating the class. This is useful when a class has
    only static methods or the developer wants to have full control of
    all calls to create new instances of the class. Remember, static
    methods in the class, including a main() method, may access
    private members, including private constructors.

     */
}
