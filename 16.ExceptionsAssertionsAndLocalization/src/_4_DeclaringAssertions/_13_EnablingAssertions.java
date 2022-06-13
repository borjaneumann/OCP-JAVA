package _4_DeclaringAssertions;

public class _13_EnablingAssertions {

    /*
    ENABLING ASSERTIONS
    ===================
    By default, assert statements are ignored by the JVM at runtime. To
    enable assertions, use the ‐enableassertions flag on the command line.
    java -enableassertions Rectangle
    You can also use the shortcut ‐ea flag.
    java -ea Rectangle

    the following command enables assertions only for classes in the com.demos package
    and any subpackages: java -ea:com.demos… my.programs.Mai

    The ellipsis ( …) means any class in the specified package or subpackages.
    You can also enable assertions for a specific class.
    java -ea:com.demos.TestColors my.programs.Main

    DISABLING ASSERTIONS
    ====================
    Sometimes you want to enable assertions for the entire application but
    disable it for select packages or classes. Java offers the
    ‐disableassertions or ‐da flag for just such an occasion.
    The following command enables assertions for the com.demos package but disables
    assertions for the TestColors class:
    java -ea:com.demos… -da:com.demos.TestColors my.programs.Main

    BAD USE OF ASSERTIONS
    int x = 10;
    assert ++x> 10; // Not a good design!

    When assertions are turned on, x is incremented to 11; but when assertions
    are turned off, the value of x is 10. This is not a good use of assertions
    because the outcome of the code will be different depending on whether
    assertions are turned on.
     */

}
