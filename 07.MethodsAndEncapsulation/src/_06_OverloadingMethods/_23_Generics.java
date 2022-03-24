package _06_OverloadingMethods;

public class _23_Generics {
    /*
    You might be surprised to learn that these are not valid overloads:

    public void walk(List<String> strings) {}
    public void walk(List<Integer> integers) {} // DOES NOT COMPILE

    Java has a concept called type erasure where generics are used only at
    compile time. That means the compiled code looks like this:

    public void walk(List strings) {}
    public void walk(List integers) {} // DOES NOT COMPILE

    We clearly can’t have two methods with the same method signature, so
    this doesn’t compile. Remember that method overloads must differ in at
    least one of the method parameters.

     */

}
