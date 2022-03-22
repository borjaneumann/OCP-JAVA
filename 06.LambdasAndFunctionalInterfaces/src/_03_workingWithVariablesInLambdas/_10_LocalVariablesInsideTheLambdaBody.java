package _03_workingWithVariablesInLambdas;

public class _10_LocalVariablesInsideTheLambdaBody {
    /*
    While it is most common for a lambda body to be a single expression, it is
    legal to define a block. That block can have anything that is valid in a
    normal Java block, including local variable declarations.
    The following code does just that. It creates a local variable named c that
    is scoped to the lambda block.

    (a, b) -> { int c = 0; return 5;}

    Redeclaring variables is not allowed:
    (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

    Find 3 syntax errors below!
    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a -> {
            int b = 0;
            int c = 0;
            return b == c;}
    }
     */

}
