package _1_UsingMethodReferences;

public class _02_CallingInstanceMethodsOnAParticularObject {
    /*
    The String class has a startsWith() method that takes one parameter
    and returns a boolean. Conveniently, a Predicate is a functional interface
    that takes one parameter and returns a boolean. Let's look at how to use
    method references with this code:

    18: var str = "abc";
    19: Predicate<String> methodRef = str::startsWith;
    20: Predicate<String> lambda = s -> str.startsWith(s);

    Line 19 shows that we want to call str.startsWith() and pass a single
    parameter to be supplied at runtime. This would be a nice way of filtering
    the data in a list. In fact, we will do that later in the chapter.
    A method reference doesn't have to take any parameters. In this example,
    we use a Supplier, which takes zero parameters and returns a value:

    var random = new Random();
    Supplier<Integer> methodRef = random::nextInt;
    Supplier<Integer> lambda = () -> random.nextInt();

    Since the methods on Random are instance methods, we call the method
    reference on an instance of the Random class.
     */
}
