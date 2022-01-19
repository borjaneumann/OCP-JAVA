import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _10_ExecutingAPreparedStatement {

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

     */

}
