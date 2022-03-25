package _03_DeclaringConstructor;

public class _13_1_InstanceInitialization {
    /*
    Instance initialization is a bit more complicated
    than class initialization, because a class or superclass may have many
    constructors declared but only a handful used as part of instance
    initialization.

    Initialize Instance of X
    ========================
    1. If there is a superclass Y of X, then initialize the instance of Y first.
    2. Process all instance variable declarations in the order they appear in the
    class.
    3. Process all instance initializers in the order they appear in the class.
    4. Initialize the constructor including any overloaded constructors referenced
    with this().

    See if you can figure out what the following application outputs:

    public class ZooTickets {
            private String name = "BestZoo";
            { System.out.print(name+"-"); }
            private static int COUNT = 0;
            static { System.out.print(COUNT+"-"); }
            static { COUNT += 10; System.out.print(COUNT+"-"); }

            public ZooTickets() {
                System.out.print("z-");
            }

            public static void main(String... patrons) {
                new ZooTickets(); // 0-10-BestZoo-z-
            }
        }

    Next, let’s try a simple example with inheritance.
    =================================================
    class Primate {
        public Primate() {
            //super() -> Placed by the compiler
            System.out.print("Primate-");
        }
    }
    class Ape extends Primate {
        public Ape(int fur) {
            //super() -> Placed by the compiler
            System.out.print("Ape1-");
        }
        public Ape() {
            //super() -> Placed by the compiler
            System.out.print("Ape2-");
        }
    }
    public class Chimpanzee extends Ape {
        public Chimpanzee() {
            super(2);
            System.out.print("Chimpanzee-");
        }
        public static void main(String[] args) {
            new Chimpanzee(); // Primate-Ape1-Chimpanzee-
        }
    }

    What do you think happens here?

    public class Cuttlefish {
        private String name = "swimmy";
        { System.out.println(name); }
        private static int COUNT = 0;
        static { System.out.println(COUNT); }
        { COUNT++; System.out.println(COUNT); }
        public Cuttlefish() {
            System.out.println("Constructor");
        }
        public static void main(String[] args) {
            System.out.println("Ready");
            new Cuttlefish();
        }
        Output:
        0
        Ready
        swimmy
        1
        Constructor
    }
    There is no superclass declared, so we can skip any steps that relate to
    inheritance. We first process the static variables and static initializers
    —lines 4 and 5, with line 5 printing 0. Now that the static initializers are
    out of the way, the main() method can run, which prints Ready. Lines 2, 3,
    and 6 are processed, with line 3 printing swimmy and line 6 printing 1.
    Finally, the constructor is run on lines 8–10, which print Constructor.

    class GiraffeFamily {
        static { System.out.print("A"); }
        { System.out.print("B"); }
        public GiraffeFamily(String name) {
            this(1);
            System.out.print("C");
        }
        public GiraffeFamily() {
            System.out.print("D");
        }
        public GiraffeFamily(int stripes) {
            System.out.print("E");
        }
    }
    public class Okapi extends GiraffeFamily {
        static { System.out.print("F"); }

        public Okapi(int stripes) {
            super("sugar");
            System.out.print("G");
        }
        { System.out.print("H"); }

        public static void main(String[] grass) {
            new Okapi(1);
            System.out.println();
            new Okapi(2);
        }
    }
    The program prints the following:
    AFBECHG
    BECHG

    This example is tricky for a few reasons. There are multiple overloaded
    constructors, lots of initializers, and a complex constructor pathway to
    keep track of. Luckily, questions like this are rare on the exam. If you see
    one, just write down what is going on as you read the code.
 */
}
