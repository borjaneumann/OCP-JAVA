package _1_UsingMethodReferences;

public class _01_CallingStaticMethods {
    /*
    The Collections class has a static method that can be used for sorting.
    the Consumer functional interface takes one parameter and
    does not return anything. Here we will assign a method reference and a
    lambda to this functional interface:

    14: Consumer<List<Integer>> methodRef = Collections::sort;
    15: Consumer<List<Integer>> lambda = x -> Collections.sort(x);

    On line 14, we reference a method with one parameter, and Java knows
    that it's like a lambda with one parameter. Additionally, Java knows to
    pass that parameter to the method.

    Wait a minute. You might be aware that the sort() method is overloaded.
    How does Java know that we want to call the version with only one
    parameter? With both lambdas and method references, Java is inferring
    information from the context. In this case, we said that we were declaring
    a Consumer, which takes only one parameter. Java looks for a method that
    matches that description. If it can't find it or it finds multiple ones that
    could match multiple methods, then the compiler will report an error. The
    latter is sometimes called an ambiguous type error.
     */
}
