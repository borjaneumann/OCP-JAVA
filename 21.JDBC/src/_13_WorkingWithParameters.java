import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _13_WorkingWithParameters {
    /*Suppose our zoo acquires a new elephant and we want to register it in our names table.

    public static void register(Connection conn) throws
            SQLException {
        var sql = "INSERT INTO names VALUES(6, 1, 'Edith')";
        try (var ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }
    However, everything is hard‐coded. We want to be able to pass in the
    values as parameters. However, we don't want the caller of this method to
    need to write SQL or know the exact details of our database.

    Instead of specifying the three values in the SQL, we can use a question mark ( ?) instead.
    A bind variable is a placeholder that lets you specify the actual values at runtime.
    A bind variable is like a parameter, and you will see bind variables referenced as both variables and parameters.
    We can rewrite our SQL statement using bind variables.

    String sql = "INSERT INTO names VALUES(?, ?, ?)";
     */
    public static void register (Connection conn, int key, int type, String name) throws SQLException {
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
    public static void register3 (Connection conn, int key, int type, String name) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);// The number of values assigned is not the same as the number of specified or implied columns.
            ps.executeUpdate();
        }
    }



}
