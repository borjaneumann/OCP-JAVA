package _03_DeclaringConstructor;

public class _11_2_MissingADefaultNoArgumentConstructor {
    /*
    public class Mammal {
        public Mammal(int age) {}
    }
    public class Elephant extends Mammal { // DOES NOT COMPILE
    }

    At compiling time:
    public class Elephant extends Mammal {
        public Elephant() {
            super(); // DOES NOT COMPILE
        }
    }

   Solved!
   Since the Mammal class has at least one constructor declared, the compiler
    does not insert a default no-argument constructor. Therefore, the super()
    call in the Elephant class declaration does not compile. In this case, the
    Java compiler will not help, and you must create at least one constructor in
    your child class that explicitly calls a parent constructor via the super()
    command. We can fix this by adding a call to a parent constructor that
    takes a fixed argument.

    public class Elephant extends Mammal {
        public Elephant() {
            super(10);
        }
    }
    Notice that the class Elephant now
    has a no-argument constructor even though its parent class Mammal
    doesn’t. Subclasses may define explicit no-argument constructors even if
    their parent classes do not, provided the constructor of the child maps to a
    parent constructor via an explicit call of the super() command. This
    means that subclasses of the Elephant can rely on compiler
    enhancements. For example, the following class compiles because
    Elephant now has a no-argument constructor, albeit one defined explicitly:

    public class AfricanElephant extends Elephant {}

    You should be wary of any exam question in which a class defines a
    constructor that takes arguments and doesn’t define a no-argument
    constructor. Be sure to check that the code compiles before answering a
    question about it, especially if any classes inherit it. For the exam, you
    should be able to spot right away why classes such as our first Elephant
    implementation did not compile.

    SUPER() ALWAYS REFERS TO THE MOST DIRECT PARENT
    ===============================================
    A class may have multiple ancestors via inheritance. For constructors,
    though, super() always refers to the most direct parent. In this example,
    calling super() inside the AfricanElephant class always refers to the Elephant
    class, and never the Mammal class.


     */
}
