package _05_WorkingWithAdvancedStreamPipelineConcepts;

import java.util.Optional;

public class _22_ChainingOptionals {
    /*
    By now, you are familiar with the benefits of chaining operations in a
    stream pipeline. A few of the intermediate operations for streams are
    available for Optional.
    Suppose that you are given an Optional<Integer> and asked to print the
    value, but only if it is a three‐digit number. Without functional
    programming, you could write the following:
    */
    static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }
    /*
    It works, but it contains nested if statements.That's extra complexity.
    Let's try this again with functional programming.
    */
    private static void threeDigit1(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
    /*
    This is much shorter and more expressive.With lambdas, the
    exam is fond of carving up a single statement and identifying
    the pieces with a comment.We've done that here to show what happens
    with both the functional programming and nonfunctional programming approaches.
    Suppose that we are given an empty Optional.

    The first approach returns false for the outer if statement.The second approach sees
    an empty Optional and has both map() and filter() pass it through.Then ifPresent() sees
    n empty Optional and doesn't call the Consumer a parameter.

    The next case is where we are given an Optional.of(4). The first approach returns
    false for the inner if statement.The second approach maps the number 4 to "4".
    the filter() then returns an empty Optional T since the filter doesn't match,
    and ifPresent() doesn't call the Consumer parameter.

    The final case is where we are given an Optional.of(123). The first approach returns true
    for both if statements.The second approach maps the number 123to "123".
    The filter() then returns the same Optional, and ifPresent() now does call
    the Consumer parameter. Now suppose that we wanted to get an Optional<Integer> representing
    the length of the String contained in another Optional.Easy enough.

    Optional<Integer> result = optional.map(String::length);

    What if we had a helper method that did the logic of calculating something for us that
    returns Optional<Integer>? Using map doesn't work.

    Optional<Integer> result = optional
            .map(ChainingOptionals::calculator); // DOES NOT COMPILE

    The problem is that calculator returns Optional<Integer>.The map() method adds
    another Optional, giving us Optional<Optional<Integer>>.Well,that's no good.
    The solution is to call flatMap() instead.

    Optional<Integer> result = optional
            .flatMap(ChainingOptionals::calculator);

    This one works because flatMap removes the unnecessary layer.In other words,
    it flattens the result. Chaining calls to flatMap() is useful when you want
    to transform one Optional type to another.

    CHECKED EXCEPTIONS AND FUNCTIONAL INTERFACES
    =============================================
    You might have noticed by now that most functional interfaces do not declare
    checked exceptions. This is normally OK.However, it is a problem when working
    with methods that declare checked exceptions.Suppose that we have a class with a
    method that throws a checked exception .

    import java.io .*;
    import java.util .*;

    public class ExceptionCaseStudy {
        private static List<String> create() throws
                IOException {
            throw new IOException();
        }
    }

    Now we use it in a stream.

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    Nothing new here.The create() method throws a checked exception.The calling
    method handles or declares it.Now what about this one?

    public void bad() throws IOException {
        Supplier<List<String>> s =
                ExceptionCaseStudy::create; // DOES NOT COMPILE
    }

    The actual compiler error is as follows:unhandled exception type IOException
    Say what now?The problem is that the lambda to which this method reference expands
    does not declare an exception.The Supplier interface does not allow checked exceptions.

    There are two approaches to get around this problem.One is to catch the exception
    and turn it into an unchecked exception.

    public void ugly() {
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }

    This works.But the code is ugly.One of the benefits of functional programming is
    that the code is supposed to be easy to read and concise.Another alternative is to
    create a wrapper method with the try/catch.

    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Now we can use the safe wrapper in our Supplier without issue.

    public void wrapped() {
        Supplier<List<String>> s2 =
                ExceptionCaseStudy::createSafe;
    }
     */
}
