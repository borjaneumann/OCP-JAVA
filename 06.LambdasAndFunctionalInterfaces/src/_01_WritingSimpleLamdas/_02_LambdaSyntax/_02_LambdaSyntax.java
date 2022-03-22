package _01_WritingSimpleLamdas._02_LambdaSyntax;

public class _02_LambdaSyntax {
    /*
    Lambdas work with interfaces that have only one abstract method.
    Java relies on context when figuring out what lambda expressions mean.
    The syntax of lambdas is tricky because many parts are optional. These
    two lines do the exact same thing:

        a -> a.canHop()
        (Animal a) -> { return a.canHop(); }

    * A single parameter specified with the name a
    * The arrow operator to separate the parameter and body
    * A body that calls a single method and returns the result of that method

    The second example shows the most verbose form of a lambda that returns a boolean.

    * A single parameter specified with the name a and stating the type is Animal
    * The arrow operator to separate the parameter and body
    * A body that has one or more lines of code, including a semicolon and a
    return statement

    Lambda syntax, including optional parts
    =======================================
    The parentheses can be omitted only if there is a single parameter and its
    type is not explicitly stated. Java does this because developers commonly
    use lambda expressions this way and they can do as little typing as
    possible.

    We can omit braces when we have only a single statement.
    What is different here is that the rules change when you omit the braces.
    Java doesn’t require you to type return or use a semicolon when no braces are
    used. This special shortcut doesn’t work when we have two or more
    statements. At least this is consistent with using {} to create blocks of
    code elsewhere.

    Here’s a fun fact: s -> {} is a valid lambda. If there is no code on
    the right side of the expression, you don’t need the semicolon or
    return statement.

    Valid Lambdas
    =============
    Lambda                                              # parameters
    () -> true                                          0
    a -> a.startsWith("test")                           1
    (String a) -> a.startsWith("test")                  1
    (a, b) -> a.startsWith("test")                      2
    (String a, String b) -> a.startsWith("test")        2

    Invalid lambdas that return boolean
    ===================================
    Invalid lambda                                      Reason
    a, b -> a.startsWith("test")                        Missing parentheses
    a -> { a.startsWith("test"); }                      Missing return
    a -> { return a.startsWith("test") }                Missing semicolon

    The parentheses are optional only when there is one parameter and it doesn’t have a type declared.
     */

}
