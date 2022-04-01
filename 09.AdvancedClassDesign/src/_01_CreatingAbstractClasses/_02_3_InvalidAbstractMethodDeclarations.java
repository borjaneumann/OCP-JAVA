package _01_CreatingAbstractClasses;

public class _02_3_InvalidAbstractMethodDeclarations {
    /*
    The exam writers are also fond of questions with methods marked as
    abstract for which an implementation is also defined. For example, can
    you see why each of the following methods does not compile?
    public abstract class Turtle {
        public abstract long eat() // DOES NOT COMPILE
        public abstract void swim() {}; // DOES NOT COMPILE
        public abstract int getAge() { // DOES NOT COMPILE
        return 10;
        }
        public void sleep; // DOES NOT COMPILE
        public void goInShell(); // DOES NOT COMPILE
    }

    The first method, eat(), does not compile because it is marked abstract
    but does not end with as semicolon (;). The next two methods, swim() and
    getAge(), do not compile because they are marked abstract, but they
    provide an implementation block enclosed in braces ({}). For the exam,
    remember that an abstract method declaration must end in a semicolon
    without any braces. The next method, sleep, does not compile because it
    is missing parentheses, (), for method arguments. The last method,
    goInShell(), does not compile because it is not marked abstract and
    therefore must provide a body enclosed in braces.

    Abstract and final Modifiers
    ============================
    What would happen if you marked a class or method both abstract and
    final? If you mark something abstract, you are intending for someone
    else to extend or implement it. But, if you mark something final, you are
    preventing anyone from extending or implementing it. These concepts are
    in direct conflict with each other.

    Due to this incompatibility, Java does not permit a class or method to be
    marked both abstract and final. For example, the following code
    snippet will not compile:
        public abstract final class Tortoise { // DOES NOT COMPILE
        public abstract final void walk(); // DOES NOT COMPILE
    }


     */
}
