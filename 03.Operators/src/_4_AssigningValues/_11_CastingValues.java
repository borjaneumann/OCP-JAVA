package _4_AssigningValues;

public class _11_CastingValues {
    /*
    Casting is a unary operation where one data type is explicitly interpreted as another data type.
    It is required when converting to a smaller or narrowing data type.

    Here are some examples of casting:
        int fur = (int)5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short)(4 + 10);
        long feathers = 10(long); // DOES NOT COMPILE
        float egg = 2.0 / 9; // DOES NOT COMPILE
        int tadpole = (int)5 * 2L; // DOES NOT COMPILE
        short frog = 3 - 2.0; // DOES NOT COMPILE

    Spaces between the cast and the value are optional.

    Reviewing Primitive Assignments
    int fish = 1.0; // DOES NOT COMPILE
    short bird = 1921222; // DOES NOT COMPILE
    int mammal = 9f; // DOES NOT COMPILE
    long reptile = 192301398193810323; // DOES NOT COMPILE

    Applying Casting
    We can fix the previous set of examples by casting the results to a smaller
    data type. Remember, casting primitives is required any time you are
    going from a larger numerical data type to a smaller numerical data type,
    or converting from a floating-point number to an integral value.

    int trainer = (int)1.0;
    short ticketTaker = (short)1921222; // Stored as 20678
    int usher = (int)9f;
    long manager = 192301398193810323L;

    OVERFLOW AND UNDERFLOW
    Overflow is when a number is so large that it will no longer fit
    within the data type, so the system “wraps around” to the lowest
    negative value and counts up from there, similar to how modulus
    arithmetic works.
    underflow is when the number is too low to fit in the data type,
    such as storing -200 in a byte field.

    short mouse = 10;
    short hamster = 3;
    short capybara = mouse * hamster; // DOES NOT COMPILE

    short mouse = 10;
    short hamster = 3;
    short capybara = (short)(mouse * hamster);

    Important!
    By casting a larger value into a smaller data type, you are instructing the
    compiler to ignore its default behavior.

    Casting can appear anywhere in an expression, not just
    on the assignment. For example, let’s take a look at a modified form of the
    previous example:

    short mouse = 10;
    short hamster = 3;
    short capybara = (short)mouse * hamster; // DOES NOT COMPILE
    short gerbil = 1 + (short)(mouse * hamster); // DOES NOT COMPILE

    Casting was a unary operation. That means the cast in the first line is
    applied to mouse, and mouse alone. After the cast is complete, both
    operands are promoted to int since they are used with the binary
    multiplication operator (*), making the result an int and causing a
    compiler error.
    In the second example, casting is performed successfully, but the resulting
    value is automatically promoted to int because it is used with the binary
    arithmetic operator (+).





     */

}
