package _1_UsingMethodReferences;

public class _04_CallingConstructors {
    /*
    A constructor reference is a special type of method reference that uses new
    instead of a method, and it instantiates an object. It is common for a
    constructor reference to use a Supplier as shown here:

    30: Supplier<List<String>> methodRef = ArrayList::new;
    31: Supplier<List<String>> lambda = () -> new ArrayList();

    It expands like the method references you have seen so far. In the previous
    example, the lambda doesn't have any parameters.
    Method references can be tricky. In our next example, we will use the
    Function functional interface, which takes one parameter and returns a
    result. Notice that line 32 in the following example has the same method
    reference as line 30 in the previous example:

    32: Function<Integer, List<String>> methodRef = ArrayList::new;
    33: Function<Integer, List<String>> lambda = x -> new ArrayList(x);

    This means you can't always determine which method can be called by
    looking at the method reference. Instead, you have to look at the context to
    see what parameters are used and if there is a return type. In this example,
    Java sees that we are passing an Integer parameter and calls the
    constructor of ArrayList that takes a parameter.
     */
}
