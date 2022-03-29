package _05_UnderstandingPolymorphism;

public class _21_TheInstanceOfOperator {
    /*
    The instanceof operator can be used to check whether an object belongs
    to a particular class or interface and to prevent ClassCastExceptions at runtime.
    The following code snippet doesn’t throw an exception at runtime and
    performs the cast only if the instanceof operator returns true:

    if(rodent instanceof Capybara) {
        Capybara capybara = (Capybara)rodent;
    }
    Just as the compiler does not allow casting an object to unrelated types, it
    also does not allow instanceof to be used with unrelated types. We can
    demonstrate this with our unrelated Bird and Fish classes:

    public static void main(String[] args) {
        Fish fish = new Fish();
        if (fish instanceof Bird) { // DOES NOT COMPILE
            Bird bird = (Bird) fish; // DOES NOT COMPILE
        }
    }
    In this snippet, neither the instanceof operator nor the explicit cast
    operation compile.

     */

}
