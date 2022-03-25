package _03_DeclaringConstructor;

public class _13_0_OrderOfInitialization {
    /*
    Class Initialization
    ====================
    Loading the class. First, you need to initialize the class, which involves invoking all static
    members in the class hierarchy, starting with the highest superclass and
    working downward. This is often referred to as loading the class.

    The most important rule with class initialization is that it happens at most
    once for each class. The class may also never be loaded if it is not used in
    the program.

    Initialize Class X
    1. If there is a superclass Y of X, then initialize class Y first.
    2. Process all static variable declarations in the order they appear in the class.
    3. Process all static initializers in the order they appear in the class

    public class Animal {
        static { System.out.print("A"); }
        }
        public class Hippo extends Animal {
            static { System.out.print("B"); }
            public static void main(String[] grass) {
                System.out.print("C");
                new Hippo();
                new Hippo();
                new Hippo();
        }
    }
    It prints ABC exactly once. Since the main() method is inside the Hippo
    class, the class will be initialized first, starting with the superclass and
    printing AB. Afterward, the main() method is executed, printing C. Even
    though the main() method creates three instances, the class is loaded only
    once.

    Important!
    For the exam, you just need to know that a class must be initialized
    before it is referenced or used. Also, the class containing the
    program entry point, aka the main() method, is loaded before the
    main() method is executed.

     */
}
