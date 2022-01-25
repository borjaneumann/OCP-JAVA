public class _2_IntroducingInjectionAndInputValidation {
    /*
    Concepts:
    ========
    1. Injection is an attack where dangerous input runs in a program as part of a
    command. For example, user input is often used in database queries or
    I/O. In this section, we will look at how to protect your code against
    injection using a PreparedStatement and input validation.

    2. An exploit is an attack that takes advantage of weak security.

    3. There are many sources of untrusted data. For the exam, you need to be
    aware of user input, reading from files, and retrieving data from a
    database. In the real world, any data that did not originate from your
    program should be considered suspect.

    PREVENTING INJECTION WITH A PREPAREDSTATEMENT
    =============================================
    Using Statement

    We wrote a method that uses a Statement. We didn't use Statement because it is often unsafe.

    public int getOpening(Connection conn, String day) throws SQLException {
        String sql = "SELECT opens FROM hours WHERE day = '" + day
        +"'";
        try (var stmt = conn.createStatement();
        var rs = stmt.executeQuery(sql)) {
            if (rs.next())
            return rs.getInt("opens");
        }
        return -1;
    }
    Then, we call the code with one of the days in the table.

    int opening = attack.getOpening(conn, "monday"); // 10

    So far, so good. Then Hacker Harry comes along to call the method. He writes this:

    int evil = attack.getOpening(conn,
    "monday' OR day IS NOT NULL OR day = 'sunday"); // 9

    Hacker Harry's parameter results in the following SQL, which we've
    formatted for readability:
    SELECT opens FROM hours
    WHERE day = 'monday'
    OR day IS NOT NULL
    OR day = 'sunday'

    It says to return any rows where day is sunday, monday, or any value that
    isn't null. Since none of the values in Figure 22.2 is null, this means all
    the rows are returned. Luckily, the database is kind enough to return the
    rows in the order they were inserted; our code reads the first row.
     */

}
