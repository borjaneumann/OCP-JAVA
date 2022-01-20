import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class _13_WorkingWithParameters {
    //Suppose our zoo acquires a new elephant and we want to register it in our names table.

    public static void register0(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(6, 1, 'Edith')";
        try (var ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    /*
    However, everything is hard‐coded. We want to be able to pass in the
    values as parameters. However, we don't want the caller of this method to
    need to write SQL or know the exact details of our database.

    Instead of specifying the three values in the SQL, we can use a question mark ( ?) instead.
    A bind variable is a placeholder that lets you specify the actual values at runtime.
    A bind variable is like a parameter, and you will see bind variables referenced as both variables and parameters.
    We can rewrite our SQL statement using bind variables.

    String sql = "INSERT INTO names VALUES(?, ?, ?)";
     */
    public static void register(Connection conn, int key, int type, String name) throws SQLException {
        String sql = "INSERT INTO names VALUES(?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }
    }

    /*
    You can think of the bind variables as a list of parameters where each one gets set in turn.
    Notice how the bind variables can be set in any order.

    Remember that JDBC starts counting columns with 1 rather than 0.
    A common exam (and interview) question tests that you know this!

    The rule is only that they are each set before the query is
    executed. Let's see what happens if you don't set all the bind variables.
    */
    public static void register2(Connection conn, int key, int type) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            // missing the set for parameter number 3
            ps.executeUpdate();
        }
    }

    //What about if you try to set more values than you have as bind variables?
    public static void register3(Connection conn, int key, int type, String name) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);// The number of values assigned is not the same as the number of specified or implied columns.
            ps.executeUpdate();
        }
    }
    /*
    PreparedStatement methods
    Method name         Parameter type          Example database type
    ======================================================================
    setBoolean          Boolean                 BOOLEAN
    setDouble           Double                  DOUBLE
    setInt              Int                     INTEGER
    setLong             Long                    BIGINT
    setObject           Object                  Any type
    setString           String                  CHAR, VARCHAR
     */

    /*
    Notice the setObject() method works with any Java type. If you pass a primitive,
    it will be autoboxed into a wrapper type. That means we can rewrite our example as follows:
    */
    public static void register4(Connection conn, int key, int type, String name) throws SQLException {
        String sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, key);
            ps.setObject(2, type);
            ps.setObject(3, name);
            ps.executeUpdate();
        }
    }

    /*
    The following code is incorrect. Do you see why?

    ps.setObject(1, key);
    ps.setObject(2, type);
    ps.setObject(3, name);
    ps.executeUpdate(sql); // INCORRECT, WE ARE PASSING SQL HERE

    The problem is that the last line passes a SQL statement.
    With a PreparedStatement, we pass the SQL in when creating the object.

    Updating Multiple Times
    =======================
    Suppose we get two new elephants and want to add both. We can use the same PreparedStatement object.
    */
    public static void updatingMultipleTimes(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 20);
            ps.setInt(2, 1);
            ps.setString(3, "Ester");
            ps.executeUpdate();
            ps.setInt(1, 21);
            ps.setString(3, "Elias");
            ps.executeUpdate();
        }
    }

    /*
    Note that we set all three parameters when adding Ester, but only two for
    Elias. The PreparedStatement is smart enough to remember the
    parameters that were already set and retain them. You only have to set the
    ones that are different.
     */
    /*
    BATCHING STATEMENTS
    ===================
    JDBC supports batching so you can run multiple statements in fewer
    trips to the database.
    For example, if you need to insert 1,000 records into the database, then inserting
    them as a single network call (as opposed to 1,000 network calls) is
    usually a lot faster.

    You don't need to know the addBatch() and executeBatch()
    methods for the exam, but they are useful in practice.
    */
    public static void register(Connection conn, int firstKey, int type, String... names) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }
            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }
    /*
    Now we call this method with two names:
    register(conn, 100, 1, "Elias", "Ester");

    The output shows the array has two elements since there are two
    different items in the batch. Each one added one row in the database.
    [1, 1]

    When using batching, you should call executeBatch() at a set
    interval, such as every 10,000 records (rather than after ten million).
    Waiting too long to send the batch to the database could produce
    operations that are so large that they freeze the client (or even worse
    the database!).
     */


}
