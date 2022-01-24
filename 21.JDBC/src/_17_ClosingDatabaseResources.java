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


     */
}
