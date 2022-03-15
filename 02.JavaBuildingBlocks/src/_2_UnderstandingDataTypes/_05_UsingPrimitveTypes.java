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

    FLOATING-POINT NUMBERS AND SCIENTIFIC NOTATION
    In most computer systems, floating-point numbers
    are stored in scientific notation. This means the numbers are stored
    as two numbers, a and b, of the form a x 10 .
    To accomplish this, you only store the first dozen or so
    digits of the number. The name scientific notation comes from
    science, where often only the first few significant digits are required
    for a calculation.

    Writing Literals
    When a number is present in the code, it is called a literal.

    Java allows you to specify digits in several other formats:
    * Octal (digits 0–7), which uses the number 0 as a prefix—for example, 017
    * Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X as a
        prefix—for example, 0xFF, 0xff, 0XFf. Hexadecimal is case insensitive so
        all of these examples mean the same value.
    * Binary (digits 0–1), which uses the number 0 followed by b or B as a prefix
        —for example, 0b10, 0B10






     */

}
