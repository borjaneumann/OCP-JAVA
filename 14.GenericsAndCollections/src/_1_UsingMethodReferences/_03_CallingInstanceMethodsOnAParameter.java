package _1_UsingMethodReferences;

public class _03_CallingInstanceMethodsOnAParameter {
    /*
    This time, we are going to call an instance method that doesn't take any
    parameters. The trick is that we will do so without knowing the instance in
    advance.

    23: Predicate<String> methodRef = String::isEmpty;
    24: Predicate<String> lambda = s -> s.isEmpty();

    Line 23 says the method that we want to call is declared in String. It
    looks like a static method, but it isn't. Instead, Java knows that
    isEmpty() is an instance method that does not take any parameters. Java
    uses the parameter supplied at runtime as the instance on which the
    method is called.

    Compare lines 23 and 24 with lines 19 and 20 of our instance example.
    They look similar, although one references a local variable named str,
    while the other only references the functional interface parameters.
    You can even combine the two types of instance method references. We
    are going to use a functional interface called a BiPredicate, which takes
    two parameters and returns a boolean.

    26: BiPredicate<String, String> methodRef = String::startsWith;
    27: BiPredicate<String, String> lambda = (s, p) -> s.startsWith(p);

    Since the functional interface takes two parameters, Java has to figure out
    what they represent. The first one will always be the instance of the object
    for instance methods. Any others are to be method parameters.
    Remember that line 26 may look like a static method, but it is really a
    method reference declaring that the instance of the object will be specified
    later. Line 27 shows some of the power of a method reference. We were
    able to replace two lambda parameters this time.
     */
}
