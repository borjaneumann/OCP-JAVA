package _01_ApplyingTheFinalModifier;

public class _02_AddingFinalToInstanceAndStaticVariables {
    /*Instance Variable
    ===================
    Instance and static class variables can also be marked final. If an
    instance variable is marked final, then it must be assigned a value when it
    is declared or when the object is instantiated. Like a local final variable,
    it cannot be assigned a value more than once, though. The following
    PolarBear class demonstrates these properties:
     */
    public class PolarBear {
        final int age = 10;
        final int fishEaten;
        final String name;
        { fishEaten = 10; }
        public PolarBear() {
            name = "Robert";
        }
        public PolarBear(int height) {
            this();
        }
    }
    /*The rules for static final variables are similar to instance final
    variables, except they do not use static constructors (there is no such
            thing!) and use static initializers instead of instance initializers.
     */
    public static class Panda {
        final static String name = "Ronda";
        static final int bamboo;
//        static final double height; // DOES NOT COMPILE
        static { bamboo = 5;}
    }
    /*The name variable is assigned a value when it is declared, while the
    bamboo variable is assigned a value in a static initializer. The height
    variable is not assigned a value anywhere in the class definition, so that
    line does not compile.
     */
}
