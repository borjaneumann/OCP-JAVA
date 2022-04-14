package _04_WorkingWithAPreparedStatement;

public class _07_WorkingWithAPreparedStatementIntro {
    /*
    In Java, you have a choice of working with a

        - Statement,
        - PreparedStatement, or
        - CallableStatement.

    The latter two are subinterfaces of Statement

    A Statement and PreparedStatement are similar to each other, except that a
    PreparedStatement takes parameters, while a Statement does not.

    A Statement just executes whatever SQL query you give it.

    While it is possible to run SQL directly with Statement, you shouldn't.
    PreparedStatement is far superior for the following reasons:

    1. Performance: In most programs, you run similar queries multiple times.
    A PreparedStatement figures out a plan to run the SQL well and remembers it.

    2. Security: As you will see in Chapter 22, “Security,” you are protected
    against an attack called SQL injection when using a PreparedStatement
    correctly.

    3. Readability: It's nice not to have to deal with string concatenation in
    building a query string with lots of parameters.

    4. Future use: Even if your query is being run only once or doesn't have any
    parameters, you should still use a PreparedStatement. That way future
    editors of the code won't add a variable and have to remember to change to
    PreparedStatement then.
     */
}
