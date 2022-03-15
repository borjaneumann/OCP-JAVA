package _2_UnderstandingDataTypes;

public class _05_UsingPrimitveTypes {
    /*
    Java has eight built-in data types, referred to as the Java primitive types.
    These eight data types represent the building blocks for Java objects,
    because all Java objects are just a complex collection of these primitive
    data types. That said, a primitive is not an object in Java nor does it
    represent an object. A primitive is just a single value in memory, such as a
    number or character.

    Primitive types
    Keyword         Type                        Example
    ======================================================
    boolean         true or false               true
    byte            8-bit integral value        123
    short           16-bit integral value       123
    int             32-bit integral value       123
    long            64-bit integral             value 123L
    float           32-bit floating-point       value 123.45f
    double          64-bit floating-point value 123.456
    char            16-bit Unicode value        'a'

    SIGNED AND UNSIGNED: SHORT AND CHAR

    You should be aware that short and char are closely
    related, as both are stored as integral types with the same 16-bit
    length.
    The primary difference is that short is signed, which means
    it splits its range across the positive and negative integers.
    Alternatively, char is unsigned, which means range is strictly
    positive including 0. Therefore, char can hold a higher positive
    numeric value than short, but cannot hold any negative numbers.
    The compiler allows them to be used interchangeably in some cases,
    as shown here:
    */
    public static void main(String[] args) {
        short bird = 'd';
        char mammal = (short)83;
        //Printing each variable displays the value associated with their type.
        System.out.println(bird); // Prints 100
        System.out.println(mammal); // Prints S
    }

    /*
    This usage is not without restriction, though. If you try to set a value
    outside the range of short or char, the compiler will report an error.

    short reptile = 65535; // DOES NOT COMPILE
    char fish = (short)-1; // DOES NOT COMPILE

    A byte is 8 bits. A bit has two possible values.
    Thus a byte can hold 2*8(power) = 256 numbers because it is signed -128 to 127
    including 0.



     */

}
