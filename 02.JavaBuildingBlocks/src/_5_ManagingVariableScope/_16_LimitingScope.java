package _5_ManagingVariableScope;

public class _16_LimitingScope {
    /*
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }
    There are two local variables in this method.
    The piecesOfCheese variable is a method
    parameter and, as discussed earlier, it also acts like a local variable in
    terms of garbage collection and scope. Both of these variables are said to
    have a scope local to the method. This means they cannot be used outside
    of where they are defined.
     */
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
//        System.out.println(bitesOfCheese); // DOES NOT COMPILE. The variable
                                             //bitesOfCheese has a smaller scope.
    }


}
