package _06_CallingACallableStatement;

import java.sql.Connection;
import java.sql.SQLException;

public class _15_PassingAnINParameter {
    /*
    PASSING AS "IN" PARAMETER
    =========================
    A stored procedure that always returns the same thing is only somewhat
    useful. We've created a new version of that stored procedure that is more
    generic. The read_names_by_letter() stored procedure takes a parameter
    for the prefix or first letter of the stored procedure. An IN parameter is
    used for input.
    There are two differences in calling it compared to our previous stored
    procedure.

    */
    public static void read_names_by_letter(Connection conn) throws SQLException {
        var sql = "{call read_names_by_letter(?)";
        try (var cs = conn.prepareCall(sql)) {
            cs.setString("prefix", "z"); //we set the value of that parameter

            try (var rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }
        }
    }
    /*
    Unlike with PreparedStatement, we can use either the parameter number (starting
    with 1) or the parameter name. That means these two statements are equivalent:
    cs.setString(1, "Z");
    cs.setString("prefix", "Z");
     */
}
