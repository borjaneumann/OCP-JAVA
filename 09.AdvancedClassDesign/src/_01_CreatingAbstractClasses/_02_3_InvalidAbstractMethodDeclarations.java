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

    INVALID MODIFIERS
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

    Abstract and private Modifiers
    ==============================
    A method cannot be marked as both abstract and private.
    public abstract class Whale {
        private abstract void sing(); // DOES NOT COMPILE
        }
    public class HumpbackWhale extends Whale {
        private void sing() {
            System.out.println("Humpback whale is singing");
        }
    }
    Note: While it is not possible to declare a method abstract and private,
    it is possible (albeit redundant) to declare a method final and
    private.

    Why does not compile?
    public abstract class Whale {
        protected abstract void sing();
    }
    public   class HumpbackWhale extends Whale {
            private void sing() { // DOES NOT COMPILE
            System.out.println("Humpback whale is singing");
        }
    }
    Abstract and static Modifiers
    =============================
    A static method cannot be overridden.
    It is defined as belonging to the class, not an instance of the class.
    If a static method cannot be overridden, then it follows that it also cannot be marked
    abstract since it can never be implemented. For example, the following
    class does not compile:

    abstract class Hippopotamus {
        abstract static void swim(); // DOES NOT COMPILE
    }

     */
}
