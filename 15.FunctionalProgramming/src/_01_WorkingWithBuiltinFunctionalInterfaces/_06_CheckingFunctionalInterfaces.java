package _01_WorkingWithBuiltinFunctionalInterfaces;

public class _6_CheckingFunctionalInterfaces {
    /*
    It's really important to know the number of parameters, types, return value,
    and method name for each of the functional interfaces. Now would be a
    good time to memorize Table 15.1 if you haven't done so already. Let's do
    some examples to practice.

    What functional interface would you use in these three situations?

    - Returns a String without taking any parameters
    - Returns a Boolean and takes a String
    - Returns an Integer and takes two Integers

    Ready? Think about what your answer is before continuing. Really. You
    have to know this cold. OK. The first one is a Supplier<String> because
    it generates an object and takes zero parameters. The second one is a
    Function<String,Boolean> because it takes one parameter and returns
    another type. It's a little tricky. You might think it is a
    Predicate<String>. Note that a Predicate returns a boolean primitive
    and not a Boolean object. Finally, the third one is either a
    BinaryOperator<Integer> or a
    BiFunction<Integer,Integer,Integer>. Since BinaryOperator is a
    special case of BiFunction, either is a correct answer.
    BinaryOperator<Integer> is the better answer of the two since it is more
    specific.
    Let's try this exercise again but with code. It's harder with code. With
    code, the first thing you do is look at how many parameters the lambda
    takes and whether there is a return value. What functional interface would
    you use to fill in the blank for these?
    6: _______<List> ex1 = x -> "".equals(x.get(0));
    7: _______<Long> ex2 = (Long l) -> System.out.println(l);
    8: _______<String, String> ex3 = (s1, s2) -> false;
    Again, think about the answers before continuing. Ready? Line 6 passes
    one List parameter to the lambda and returns a boolean. This tells us that
    it is a Predicate or Function. Since the generic declaration has only one
    parameter, it is a Predicate.
    Line 7 passes one Long parameter to the lambda and doesn't return
    anything. This tells us that it is a Consumer. Line 8 takes two parameters
    and returns a boolean. When you see a boolean returned, think Predicate
    unless the generics specify a Boolean return type. In this case, there are
    two parameters, so it is a BiPredicate.
    Are you finding these easy? If not, review Table 15.1 again. We aren't
    kidding. You need to know the table really well. Now that you are fresh
    from studying the table, we are going to play “identify the error.” These
    are meant to be tricky:
    6: Function<List<String>> ex1 = x -> x.get(0); // DOES NOT
    COMPILE
    7: UnaryOperator<Long> ex2 = (Long l) -> 3.14; // DOES NOT
    COMIPLE
    8: Predicate ex4 = String::isEmpty; // DOES NOT
    COMPILE
    Line 6 claims to be a Function. A Function needs to specify two generics
    —the input parameter type and the return value type. The return value
    type is missing from line 6, causing the code not to compile. Line 7 is a
    UnaryOperator, which returns the same type as it is passed in. The
    example returns a double rather than a Long, causing the code not to
    compile.
    Line 8 is missing the generic for Predicate. This makes the parameter
    that was passed an Object rather than a String. The lambda expects a
    String because it calls a method that exists on String rather than Object.
    Therefore, it doesn't compile.

     */
}
