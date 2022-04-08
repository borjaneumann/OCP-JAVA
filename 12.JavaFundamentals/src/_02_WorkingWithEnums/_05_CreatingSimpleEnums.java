package _02_WorkingWithEnums;

public class _05_CreatingSimpleEnums {
    /*
    In programming, it is common to have a type that can only have a finite
    set of values, such as days of the week, seasons of the year, primary
    colors, etc. An enumeration is like a fixed set of constants.

    In Java, an enum, short for “enumerated type,” can be a top‐level type like a class or
    interface, as well as a nested type like an inner class.

    Using an enum is much better than using a bunch of constants because it
    provides type‐safe checking. With numeric or String constants, you can
    pass an invalid value and not find out until runtime. With enums, it is
    impossible to create an invalid enum value without introducing a compiler
    error.
    Enumerations show up whenever you have a set of items whose types are
    known at compile time. Common examples include the compass
    directions, the months of the year, the planets in the solar system, or the
    cards in a deck (well, maybe not the planets in a solar system, given that
    Pluto had its planetary status revoked).

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    Behind the scenes, an enum is a type of class that mainly contains static
    members. It also includes some helper methods like name(). Using an
    enum is easy.

    Enum values are considered constants and are commonly written
    using snake case, often stylized as snake_case. This style uses an
    underscore ( _) to separate words with constant values commonly
    written in all uppercase. For example, an enum declaring a list of ice
    cream flavors might include values like VANILLA, ROCKY_ROAD,
    MINT_CHOCOLATE_CHIP, and so on.

    Behind the scenes, an enum is a type of class that mainly contains static
    members. It also includes some helper methods like name(). Using an
    enum is easy.
    Enums print the name of the enum when toString() is
    called. They can be compared using == because they are like static
    final constants. In other words, you can use equals() or == to compare
    enums, since each enum value is initialized only once in the Java Virtual
    Machine (JVM).
    An enum provides a values() method to get an array of all of the values.
    You can use this like any normal array, including in an enhanced for loop,
    often called a for‐each loop.

    One thing that you can't do is extend an enum.
    public enum ExtendedSeason extends Season { } // DOES NOT COMPILE
    The values in an enum are all that are allowed. You cannot add more by
    extending the enum.




     */
}
