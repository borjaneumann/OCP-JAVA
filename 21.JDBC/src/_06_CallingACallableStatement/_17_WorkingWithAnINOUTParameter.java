package _06_CallingACallableStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class _17_WorkingWithAnINOUTParameter {
    /*
   WORKING WITH AN INOUT PARAMETER
   ===============================
   Finally, it is possible to use the same parameter for both input and output.
   As you read this code, see whether you can spot which lines are required
   for the IN part and which are required for the OUT part.
   */
    public static void workingWithInOutParameter(Connection conn) throws SQLException {
        var sql = "{call double_number(?)}"; //For an IN parameter is required since it passes the parameter.
        try (var cs = conn.prepareCall(sql)) {
            cs.setInt(1, 8); // It's required since it sets the parameter.
            cs.registerOutParameter(1, Types.INTEGER);// It's required to register the parameter.
            cs.execute(); //uses execute() again because we are not returning a ResultSet.
            System.out.println(cs.getInt("num"));
        }
    }

    /*
    Remember that an INOUT parameter acts as both an IN parameter and an
    OUT parameter, so it has all the requirements of both.
     */
}
