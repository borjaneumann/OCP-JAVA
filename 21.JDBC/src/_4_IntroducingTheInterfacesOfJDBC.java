import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _4_IntroducingTheInterfacesOfJDBC {
    /*
    For the exam you need to know five key interfaces of JDBC.
    With JDBC, the concrete classes come from the JDBC driver. Each
    database has a different JAR file with these classes.

    This driver JAR contains an implementation of these key interfaces along
    with a number of other interfaces. The key is that the provided
    implementations know how to communicate with a database.

    Interfaces in the JDK                       Implementation in the Driver
    ==========================================================================
    Driver                                      FooDriver
    Connection                                  FooConnection
    PreparedStatement  - CallableStatement      FooPreparedStatement  - FooCallableStatement
    ResultSet                                   FooResultSet

    What do these five interfaces do? On a very high level, we have the following:

    Driver: Establishes a connection to the database
    Connection: Sends commands to a database
    PreparedStatement: Executes a SQL query
    CallableStatement: Executes commands stored in the database
    ResultSet: Reads results of a query

    All database interfaces are in the package java.sql, so we will often omit
    the imports.

    In this next example, we show you what JDBC code looks like end to end.
    If you are new to JDBC, just notice that three of the five interfaces are in
    the code. If you are experienced, remember that the exam uses
    DriverManager instead of DataSource.
    */
    public static class MyFirstDatabaseConnection {
        public static void main(String[] args) throws SQLException {
            String url = "jdbc:derby:zoo";
            try (Connection conn = DriverManager.getConnection(url);
                 PreparedStatement ps = conn.prepareStatement(
            "SELECT name FROM animal");
                 ResultSet rs = ps.executeQuery()) {
            while (rs.next())
            System.out.println(rs.getString(1));
            }
        }
    }
    /*
    If the URL were using our imaginary Foo driver, DriverManager would
    return an instance of FooConnection. Calling prepareStatement() would
    then return an instance of FooPreparedStatement, and calling
    executeQuery() would return an instance of FooResultSet. Since the
    URL uses derby instead, it returns the implementations that derby has
    provided for these interfaces.
     */
}
