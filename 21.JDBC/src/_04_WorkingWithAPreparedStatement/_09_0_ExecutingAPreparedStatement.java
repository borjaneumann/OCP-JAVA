package _04_WorkingWithAPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _09_0_ExecutingAPreparedStatement {
    /*
    Modifying Data with executeUpdate()
    ===================================
    Let's start out with statements that change the data in a table. That would
    be SQL statements that begin with DELETE, INSERT, or UPDATE. They
    typically use a method called executeUpdate(). The name is a little tricky
    because the SQL UPDATE statement is not the only statement that uses this
    method.
    The method takes the SQL statement to run as a parameter. It returns the
    number of rows that were inserted, deleted, or changed. Here's an example
    of all three update types:
     */
    public static void main(String[] args) throws SQLException {
        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'none'";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn);

        try (var ps = conn.prepareStatement(insertSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }
        try (var ps = conn.prepareStatement(updateSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 0
        }
        try (var ps = conn.prepareStatement(deleteSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }

    /*
    "C:\db-derby-10.15.2.0-bin\db-derby-10.15.2.0-bin\lib\derby.jar" _10_ExecutingAPreparedStatement.java
    Output:
    org.apache.derby.impl.jdbc.EmbedConnection@1323531427 (XID = 213), (SESSIONID = 1), (DATABASE = zoo), (DRDAID = null)
    1
    0
    1

    Line 27 creates the insert statement, and line 28 runs that statement to
    insert one row. The result is 1 because one row was affected.
    Line 31 creates the update statement, and line 32 checks the whole table for
    matching records to update. Since no records match, the result is 0.
    Line 35 creates the delete statement, and line 36 deletes the row created on line
    28. Again, one row is affected, so the result is 1.

    Reading Data with executeQuery()
    ===============================
    Next, let's look at a SQL statement that begins with SELECT. This time, we use the executeQuery() method.
    */

        var sql = "SELECT * FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            // work with rs
        }
    }
    /*
    On line 59, we create a PreparedStatement for our SELECT query. On line
    60, we actually run it. Since we are running a query to get a result, the
    return type is ResultSet. In the next section, we will show you how to
    process the ResultSet.

    Processing Data with execute()
    ==============================
    There's a third method called execute() that can run either a query or an update.
    It returns a boolean so that we know whether there is a ResultSet.
    That way, we can call the proper method to get more detail.

    The pattern looks like this:

    boolean isResultSet = ps.execute();
    if (isResultSet) {
        try (ResultSet rs = ps.getResultSet()) {
        System.out.println("ran a query");
        }
    } else {
        int result = ps.getUpdateCount();
        System.out.println("ran an update");
    }

    If the PreparedStatement refers to sql that is a SELECT, the boolean is
    true and we can get the ResultSet. If it is not a SELECT, we can get the
    number of rows updated.

    What do you think happens if we use the wrong method for a SQL statement?

    var sql = "SELECT * FROM names";
    try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
    var ps = conn.prepareStatement(sql)) {
        var result = ps.executeUpdate();
    }

    This throws a SQLException similar to the following:
    Statement.executeUpdate() cannot be called with a statement that returns a ResultSet.

    We can't get a compiler error since the SQL is a String.
    We also get a SQLException when using executeQuery() with SQL that changes the database.
    Statement.executeQuery() cannot be called with a statement that returns a row count.
    Again, we get an exception because the driver can't translate the query into
    the expected return type.

     */

}
