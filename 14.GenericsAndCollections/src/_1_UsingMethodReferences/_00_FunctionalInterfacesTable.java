package _1_UsingMethodReferences;

public class _00_FunctionalInterfacesTable {
    /*
    Functional interfaces       Return type     Method name     # parameters
    =========================================================================
    Supplier<T>                 T               get()           0
    Consumer<T>                 void            accept(T)       1 (T)
    BiConsumer<T, U>            void            accept(T,U)     2 (T, U)
    Predicate<T>                boolean         test(T)         1 (T)
    BiPredicate<T, U>           boolean         test(T, U)      2 (T, U)
    Function<T, R>              R               apply(T)        1 (T)
    BiFunction<T, U, R>         R               apply(T,U)      2 (T, U)
    UnaryOperator<T>            T               apply(T)        1 (T)

    Method references are another way to make the code easier to read.

    public class Duckling {
    public static void makeSound(String sound) {
            LearnToSpeak learner = s -> System.out.println(s);
            DuckHelper.teacher(sound, learner);
        }
    }
    Not bad. There's a bit of redundancy, though. The lambda declares one
    parameter named s. However, it does nothing other than pass that
    parameter to another method. A method reference lets us remove that
    redundancy and instead write this:

    LearnToSpeak learner = System.out::println;

    The :: operator tells Java to call the println() method later. It will take a
    little while to get used to the syntax. Once you do, you may find your code
    is shorter and less distracting without writing as many lambdas.

    There are four formats for method references:
    - Static methods
    - Instance methods on a particular instance
    - Instance methods on a parameter to be determined at runtime
    - Constructors

     */
}
