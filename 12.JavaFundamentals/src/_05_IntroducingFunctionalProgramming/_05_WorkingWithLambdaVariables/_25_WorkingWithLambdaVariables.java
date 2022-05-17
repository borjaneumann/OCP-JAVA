package _05_IntroducingFunctionalProgramming._03_ImplFunctionalInterfacesWithLambdas;

public class _25_WorkingWithLambdaVariables {
    /*
    Variables can appear in three places with respect to lambdas:
    1) the parameter list,
    2) local variables declared inside the lambda body, and
    3) variables referenced from the lambda body.

    All three of these are opportunities for the exam to trick you.

    1) Parameter List
    =================
    Earlier you learned that specifying the type of parameters is optional. Now
    var can be used in a lambda parameter list. That means that all three of
    these statements are interchangeable:

    Predicate<String> p = x -> true;
    Predicate<String> p = (var x) -> true;
    Predicate<String> p = (String x) -> true;

    How do we figure that String is the type? A lambda infers the types from the surrounding context.
    In this case, the lambda is being assigned to a Predicate that takes a
    String. Another place to look for the type is in a method signature.

    Can you figure out the type of x?

    public void whatAmI() {
        test((var x) -> x>2, 123);
    }
    public void test(Predicate<Integer> c, int num) {
        c.test(num);
    }

    If you guessed Integer, you were right. The whatAmI() method creates a
    lambda to be passed to the test() method. Since the test() method
    expects an Integer as the generic, we know that is what the inferred type
    of x will be.

    But wait, there's more! In some cases, you can determine the type without
    even seeing the method signature. What do you think the type of x is here?

    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

    The answer is again Integer. Since we are sorting a list, we can use the
    type of the list to determine the type of the lambda parameter.

    Restrictions on Using var in the Parameter List
    -----------------------------------------------
    While you can use var inside a lambda parameter list, there is a rule you
    need to be aware of. If var is used for one of the types in the parameter
    list, then it must be used for all parameters in the list. Given this rule,
    which of the following lambda expressions do not compile if they were
    assigned to a variable?

    3: (var num) -> 1
    4: var w -> 99
    5: (var a, var b) -> "Hello"
    6: (var a, Integer b) -> true
    7: (String x, var y, Integer z) -> true
    8: (var b, var k, var m) -> 3.14159
    9: (var x, y) -> "goodbye"

    Line 3 compiles and is similar to our previous examples. Line 4 does not
    compile because parentheses, (), are required when using the parameter
    name. Lines 5 and 8 compile because all of the parameters in the list use
    var. Lines 6 and 7 do not compile, though, because the parameter types
    include a mix of var and type names. Finally, line 9 does not compile
    because the parameter type is missing for the second parameter, y. Even
    when using var for all the parameter types, each parameter type must be
    written out.

    Local Variables Inside the Lambda Body
    ======================================
    While it is most common for a lambda body to be a single expression, it is
    legal to define a block. That block can have anything that is valid in a
    normal Java block, including local variable declarations.
    The following code does just that. It creates a local variable named c that
    is scoped to the lambda block.

    (a, b) -> { int c = 0; return 5;}

    Now let's try another one. Do you see what's wrong here?

    (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

    We tried to redeclare a, which is not allowed. Java doesn't let you create a
    local variable with the same name as one already declared in that scope.
    Now let's try a hard one. How many syntax errors do you see in this
    method?

    11: public void variables(int a) {
    12:     int b = 1;
    13:     Predicate<Integer> p1 = a -> {
    14:         int b = 0;
    15:         int c = 0;
    16:         return b == c;} //Attention here!
    17: }

    There are actually three syntax errors. The first is on line 13. The variable
    a was already used in this scope as a method parameter, so it cannot be
    reused. The next syntax error comes on line 14 where the code attempts to
    redeclare local variable b. The third syntax error is quite subtle and on line
    16. See it? Look really closely.

    The variable p1 is missing a semicolon at the end. There is a semicolon
    before the }, but that is inside the block. While you don't normally have to
    look for missing semicolons, lambdas are tricky in this space, so beware!
    Variables Referenced from the Lambda Body

    Lambda bodies are allowed to use static variables, instance variables,
    and local variables if they are final or effectively final. Sound familiar?
    Lambdas follow the same rules for access as local and anonymous classes!
    This is not a coincidence, as behind the scenes, anonymous classes are
    used for lambda expressions. Let's take a look at an example:

    4: public class Crow {
    5:      private String color;
    6:      public void caw(String name) {
    7:          String volume = "loudly";
    8:          Predicate<String> p = s ->
                (name+volume+color).length()==10;
    9: }
    10: }
    On the other hand, if the local variable is not final or effectively final,
    then the code does not compile.

    4: public class Crow {
    5:      private String color;
    6:      public void caw(String name) {
    7:          String volume = "loudly";
    8:          color = "allowed";
    9:          name = "not allowed";
    10:         volume = "not allowed";
    11:         Predicate<String> p =
    12:         s -> (name+volume+color).length()==9; // DOES NOT COMPILE
    13: }
    14: }
    In this example, the values of name and volume are assigned new values on
    lines 9 and 10. For this reason, the lambda expression declared on lines 11
    and 12 does not compile since it references local variables that are not
    final or effectively final. If lines 9 and 10 were removed, then the class
    would compile.
     */
}
