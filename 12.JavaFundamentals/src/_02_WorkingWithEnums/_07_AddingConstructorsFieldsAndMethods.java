package _02_WorkingWithEnums;

public enum _07_AddingConstructorsFieldsAndMethods {
    /*
    Enums can have more in them than just a list of values. Let's say our zoo
    wants to keep track of traffic patterns for which seasons get the most
    visitors.

    1: public enum Season {
    2:      WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    3:      private final String expectedVisitors;
    4:      private Season(String expectedVisitors) {
    5:      this.expectedVisitors = expectedVisitors;
    6: }
    7: public void printExpectedVisitors() {
    8:      System.out.println(expectedVisitors);
    9: } }

    There are a few things to notice here. The list of enum values
    ends with a semicolon ( ;). While this is optional when our enum is
    composed solely of a list of values, it is required if there is anything in the
    enum besides the values.
     */

/*
    All enum constructors are implicitly private, with the modifier being
    optional. This is reasonable since you can't extend an enum and the
    constructors can be called only within the enum itself. An enum
    constructor will not compile if it contains a public or protected modifier.

    How do we call an enum method? It's easy.
    Season.SUMMER.printExpectedVisitors();
    Notice how we don't appear to call the constructor. We just say that we
    want the enum value.

    CREATING IMMUTABLE OBJECTS
    ==========================
    The immutable objects pattern is an object‐oriented design pattern in
    which an object cannot be modified after it is created. Instead of
    modifying an immutable object, you create a new object that
    contains any properties from the original object you want copied
    over.

    You might have noticed that in each of these enum examples, the list
    of values came first. This was not an accident. Whether the enum is
    simple or contains a ton of methods, constructors, and variables, the
    compiler requires that the list of values always be declared first.

 */
}