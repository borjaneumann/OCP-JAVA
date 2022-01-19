import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _8_UsingClassForName {
    /*
    You might see Class.forName() in code. It was required with older
    drivers (that were designed for older versions of JDBC) before
    getting a Connection. It looks like this:
    */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("org.postgresql.Driver");
    Connection conn = DriverManager.getConnection(
    "jdbc:postgresql://localhost:5432/ocp-book",
    "username",
    "password");
    }
    /*
    Class.forName() loads a class before it is used. With newer drivers,
    Class.forName() is no longer required.

     */

}
