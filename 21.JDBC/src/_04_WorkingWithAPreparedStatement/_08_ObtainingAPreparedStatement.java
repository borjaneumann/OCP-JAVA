package _04_WorkingWithAPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class _08_ObtainingAPreparedStatement {
    /*
    To run SQL, you need to tell a PreparedStatement about it.
    Getting a PreparedStatement from a Connection is easy.
    */
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection
                ("jdbc:derby:zoo"); PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM exhibits")) {
            // work with ps
        } catch (SQLException e) {
            e.printStackTrace();
        }
    /*
    An instance of a PreparedStatement represents a SQL statement that you
    want to run using the Connection. It does not actually execute the query yet!

    Passing a SQL statement when creating the object is mandatory. You
    might see a trick on the exam.
    try (var ps = conn.prepareStatement()) { // DOES NOT COMPILE
    }

    The previous example does not compile, because SQL is not supplied at
    the time a PreparedStatement is requested. We also used var in this
    example. We will write JDBC code both using var and the actual class
    names to get you used to both approaches.
    }
     */
    }
}
