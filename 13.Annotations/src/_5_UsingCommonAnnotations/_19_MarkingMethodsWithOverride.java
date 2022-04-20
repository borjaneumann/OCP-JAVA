package _5_UsingCommonAnnotations;

public class _19_MarkingMethodsWithOverride {
    /*
    The @Override is a marker annotation that is used to indicate a method is
    overriding an inherited method, whether it be inherited from an interface
    or parent class. you should know that the overriding method must have:
    - the same signature,
    - the same or broader access modifier,
    - and a covariant return type, and
    - not declare any new or broader checked exceptions.

    Let's take a look at an example:
    public interface Intelligence {
        int cunning();
    }
    public class Canine implements Intelligence {
        @Override public int cunning() { return 500; }
        void howl() { System.out.print("Woof!"); }
    }
    public class Wolf extends Canine {
        @Override
        public int cunning() { return Integer.MAX_VALUE; }
        @Override void howl() { System.out.print("Howl!"); }
    }
    Using these annotations is not required, but using them incorrectly is prohibited.
    The annotations in this section are entirely optional but help improve
    the quality of the code. By adding these annotations, though, you
    help take the guesswork away from someone reading your code. It
    also enlists the compiler to help you spot errors. For example,
    applying @Override on a method that is not overriding another
    triggers a compilation error and could help you spot problems if a
    class or interface is later changed.
     */
}
