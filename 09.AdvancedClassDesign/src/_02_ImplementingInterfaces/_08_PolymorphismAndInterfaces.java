package _02_ImplementingInterfaces;

public class _08_PolymorphismAndInterfaces {
    /*
    While many of the same rules apply, the fact that a class can inherit
    multiple interfaces limits some of the checks the compiler can perform.

    Abstract Reference Types
    ========================
    When working with abstract types, you may prefer to work with the
    abstract reference types, rather than the concrete class. This is especially
    common when defining method parameters.
    public class Zoo {
        public void sortAndPrintZooAnimals(List<String> animals) {
        Collections.sort(animals);
        for(String a : animals) {
            System.out.println(a);
    }}}

    Casting Interfaces
    ==================
    For example, the following is not permitted as the compiler detects that the String and
    Long class cannot be related:
    String lion = "Bert";
    Long tiger = (Long)lion;
    With interfaces, there are limitations to what the compiler can validate.
    For example, does the following program compile?
    1: interface Canine {}
    2: class Dog implements Canine {}
    3: class Wolf implements Canine {}
    4:
    5: public class BadCasts {
    6: public static void main(String[] args) {
    7: Canine canine = new Wolf();
    8: Canine badDog = (Dog)canine;
    9: } }

    In this program, a Wolf object is created and then assigned to a Canine
    reference type on line 7. Because of polymorphism, Java cannot be sure
    which specific class type the canine instance on line 8 is. Therefore, it
    allows the invalid cast to the Dog reference type, even though Dog and
    Wolf are not related. The code compiles but throws a ClassCastException at runtime.
    This limitation aside, the compiler can enforce one rule around interface
    casting. The compiler does not allow a cast from an interface reference to
    an object reference if the object type does not implement the interface. For
    example, the following change to line 8 causes the program to fail to
    compile:
    8: Object badDog = (String)canine; // DOES NOT COMPILE
    Since String does not implement Canine, the compiler recognizes that
    this cast is not possible.

    Interfaces and the instanceof Operator
    ======================================
    In Chapter 3, “Operators,” we showed that the compiler will report an
    error if you attempt to use the instanceof operator with two unrelated
    classes, as follows:
    Number tickets = 4;
    if(tickets instanceof String) {} // DOES NOT COMPILE

    With interfaces, the compiler has limited ability to enforce this rule
    because even though a reference type may not implement an interface, one
    of its subclasses could. For example, the following does compile:

    Number tickets = 5;
    if(tickets instanceof List) {}

    Even though Number does not inherit List, it’s possible the tickets
    variable may be a reference to a subclass of Number that does inherit List.
    As an example, the tickets variable could be assigned to an instance of
    the following MyNumber class (assuming all inherited methods were implemented):

    public class MyNumber extends Number implements List

    That said, the compiler can check for unrelated interfaces if the reference
    is a class that is marked final.

    Integer tickets = 6;
    if(tickets instanceof List) {} // DOES NOT COMPILE

    The compiler rejects this code because the Integer class is marked final
    and does not inherit List. Therefore, it is not possible to create a subclass
    of Integer that inherits the List interface.
     */
}
