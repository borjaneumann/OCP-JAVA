package _05_GettingDataFromAResultSet;

import java.sql.Connection;
import java.sql.SQLException;

public class _13_UsingBindVariables {
    /*
    USING BIND VARIABLES
    ====================
    We've been creating the PreparedStatement and ResultSet in the same
    try‐with‐resources statement. This doesn't work if you have bind variables
    because they need to be set in between. Luckily, we can nest try‐with‐
    resources to handle this. This code prints out the ID for any exhibits
    matching a given name:
    */
    public static void UsingBindVariables(Connection conn) throws SQLException {
        var sql = "SELECT  id FROM exhibits WHERE name = ?";

        try (var ps = conn.prepareStatement(sql)) { //we create the PreparedStatement
            ps.setString(1, "Zebra");//Then we set the bind variable

            try(var rs = ps.executeQuery()) { //after these are both done that we have a nested try‐with‐resources to create the ResultSet.
                while (rs.next()) {
                    int id = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}
