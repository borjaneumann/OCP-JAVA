import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _17_ClosingDatabaseResources {
    /*
    it is important to close resources when you are finished with them. This is true for JDBC
    as well. JDBC resources, such as a Connection, are expensive to create.
    Not closing them creates a resource leak that will eventually slow down your program.

    The resources need to be closed in a specific order.
    The ResultSet is closed first, followed by the PreparedStatement (or CallableStatement) and then the Connection.
    While it is a good habit to close all three resources, it isn't strictly necessary.
    Closing a JDBC resource should close any resources that it created. In particular, the following are true:
    - Closing a Connection also closes PreparedStatement (or CallableStatement) and ResultSet.
    - Closing a PreparedStatement (or CallableStatement) also closes the ResultSet.

    It is important to close resources in the right order. This avoids both
    resource leaks and exceptions.

    WRITING A RESOURCE LEAK
    =======================
    you learned that it is possible to declare a type before a try‐with‐resources statement. Do you see why this method is bad?
    */
    public void bad() throws SQLException {
        var url = "jdbc:derby:zoo";
        var sql = "SELECT not_a_column FROM names";
        var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery(); ///Suppose an exception is thrown on this line. The try‐with‐resources
        //block is never entered, so we don't benefit from automatic resource closing.
        // That means this code has a resource leak if it fails. Do not write code like this.

        try (conn; ps; rs) {
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }
    }
    /*
    There's another way to close a ResultSet. JDBC automatically closes a
    ResultSet when you run another SQL statement from the same
    Statement. This could be a PreparedStatement or a CallableStatement.
    How many resources are closed in this code?
    */
    public void closingResources() throws SQLException {
        var url = "jdbc:derby:zoo";
        var sql = "SELECT count(*) FROM names where id = ?";
        try (var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql)) {
            ps.setInt(1,1);
            var rs1 = ps.executeQuery();
            while (rs1.next()) {
                System.out.println("Count: " + rs1.getInt(1));
            }
            ps.setInt(1,2);

            var rs2 = ps.executeQuery();// rs1 is closed because the same PreparedStatement runs another query.
            while(rs2.next()) {
                System.out.println("Count: " + rs2.getInt(1));
            }
            rs2.close(); //rs2 is closed in the method call. Then the try‐with‐resources statement runs and closes the
            // PreparedSatement and Connection objects.
        }
    }
    /*
    DEALING WITH EXCEPTIONS
    ========================
    In most of this chapter, we've lived in a perfect world. Sure, we
    mentioned that a checked SQLException might be thrown by any
    JDBC method—but we never actually caught it. We just declared it
    and let the caller deal with it. Now let's catch the exception.
    */
    public void dealingWithExceptions() {
        var sql = "SELECT not_a_column FROM names";
        var url = "jdbc:derby:zoo";
        try (var conn = DriverManager.getConnection(url);
            var ps = conn.prepareStatement(sql);
            var rs = ps.executeQuery()) {

            while (rs.next())
                System.out.println(rs.getString(1));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
    //Console command: java -cp "C:\db-derby-10.15.2.0-bin\db-derby-10.15.2.0-bin\lib\derby.jar" _17_ClosingDatabaseResources.java
    public static void main(String[] args) {
        var sql = "SELECT not_a_column FROM names";
        var url = "jdbc:derby:zoo";
        try (var conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {

            while (rs.next())
                System.out.println(rs.getString(1));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }

    /*
    java -cp C:\db-derby-10.15.2.0-bin\db-derby-10.15.2.0-bin\lib\derby.jar" _17_ClosingDatabaseResources
     */
}
