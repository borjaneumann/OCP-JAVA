package _4_DeclaringAssertions;

public class _15_WritingAssertionsCorrectly {
    /*
    One of the most important rules you should remember from this section is:
    assertions should never alter outcomes.

    This is especially true because assertions can, should, and probably
    will be turned off in a production environment.

    For example, the following assertion is not a good design because it alters
    the value of a variable:

    int x = 10;
    assert ++x> 10; // Not a good design!

    When assertions are turned on, x is incremented to 11; but when assertions
    are turned off, the value of x is 10. This is not a good use of assertions
    because the outcome of the code will be different depending on whether
    assertions are turned on.

    Assertions are used for debugging purposes, allowing you to verify that
    something that you think is true during the coding phase is actually true at
    runtime.
     */
}
