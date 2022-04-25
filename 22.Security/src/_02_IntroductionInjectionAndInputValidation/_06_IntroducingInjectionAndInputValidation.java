package _02_IntroductionInjectionAndInputValidation;

import java.sql.Connection;
import java.sql.SQLException;

public class _06_IntroducingInjectionAndInputValidation {
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

    /*
    Using PreparedStatement
    Obviously, we have a problem with using Statement, Statement is insecure because it is vulnerable
    to SQL injection. As Hacker Harry just showed us an attack.

    We switch our code to use PreparedStatement.
    */
    public int getOpening2(Connection conn, String day) throws SQLException {
        String sql = "SELECT opens FROM hours WHERE day = '" + day
                + "'";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next())
                return rs.getInt("opens");
        }
        return -1;
    }

    /*
    Hacker Harry runs his code, and the behavior hasn't changed. We haven't
    fixed the problem! A PreparedStatement isn't magic. It gives you the
    capability to be safe, but only if you use it properly.
    We need to rewrite the SQL statement using bind variables.
    */
    public int getOpening3(Connection conn, String day) throws SQLException {
        String sql = "SELECT opens FROM hours WHERE day = ?";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, day);
            try (var rs = ps.executeQuery()) {
                if (rs.next())
                    return rs.getInt("opens");
            }
        }
        return -1;
    }
    /*
    This time, Hacker Harry's code does behave differently.

    int evil = attack.getOpening(conn, "monday' or day is not null or day = 'sunday"); // -1

    The entire string is matched against the day column. Since there is no match, no rows are returned. This is far better!
    If you remember only two things about SQL and security, remember to
    use a PreparedStatement and bind variables. IMPORTANT!!
     */

    /*
    INVALIDATING INVALID INPUT WITH VALIDATION
    ==========================================
    SQL injection isn't the only type of injection. Command injection is
    another type that uses operating system commands to do something unexpected.
    In our example, we will use the Console class.

    The following code attempts to read the name of a subdirectory of diets
    and print out the names of all the .txt files in that directory:

    Console console = System.console();
    String dirName = console.readLine();
    Path path = Paths.get("c:/data/diets/" + dirName);
    try (Stream<Path> stream = Files.walk(path)) {
        stream.filter(p -> p.toString().endsWith(".txt"))
        .forEach(System.out::println);
    }

    We tested it by typing in mammals and got the expected output.
    c:/data/diets/mammals/Platypus.txt

    Then Hacker Harry came along and typed .. as the directory name.
    c:/data/diets/../secrets/giraffeDueDate.txt
    c:/data/diets/../diets/mammals/Platypus.txt
    c:/data/diets/../diets/birds/turkey.txt

    Oh, no! Hacker Harry knows we are expecting a baby giraffe just from the filenames.
    We will use a whitelist that allows us to specify which values are allowed.

    Console console = System.console();
    String dirName = console.readLine();
    if (dirName.equals("mammal") || dirName.equals("birds")) { //Whitelist
        Path path = Paths.get("c:/data/diets/" + dirName);
        try (Stream<Path> stream = Files.walk(path)) {
            stream.filter(p -> p.toString().endsWith(".txt"))
            .forEach(System.out::println);
        }
    }
    This time when Hacker Harry strikes, he doesn't see any output at all. His input did not match the whitelist.
     */

    /*
    WHITELIST VS. BLACKLIST
    =======================
    A blacklist is a list of things that aren't allowed.
    In the previous example, we could have put the dot ( .) character on a blacklist.
    The problem with a blacklist is that you have to be cleverer than the bad guys. There are a lot of ways to cause harm. For example, you can
    encode characters.

    By contrast, the whitelist is specifying what is allowed.
    You can supply a list of valid characters.
    Whitelisting is preferable to blacklisting for security because a whitelist doesn't need to foresee every possible problem.
    That said, the whitelist solution could require more frequent updates.

    In the previous example, we would have to update the code any time we added a new animal type. Security decisions are often about
    trading convenience for lower risk.
     */

}
