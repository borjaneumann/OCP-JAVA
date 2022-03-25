package _03_DeclaringConstructor;

public class _11_1_UnderstandingCompilerEnhancements {
    /*
    Java compiler automatically inserts a call
    to the no-argument constructor super() if you do not explicitly call
    this() or super() as the first line of a constructor.

    The compiler will automatically convert them all to the last example:
    public class Donkey {}
    public class Donkey {
        public Donkey() {}
    }
    public class Donkey {
    public Donkey() {
            super();
        }
    }

    ARE CLASSES WITH ONLY PRIVATE CONSTRUCTORS CONSIDERED FINAL?
    The answer is “yes,” but only an inner class defined in the class itself can extend it. An inner
    class is the only one that would have access to a private constructor
    and be able to call super().

     */
}
