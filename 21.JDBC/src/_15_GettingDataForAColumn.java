import java.sql.Connection;
import java.sql.SQLException;

public class _15_GettingDataForAColumn {
    /*
    There are lots of get methods on the ResultSet interface.
    These are the getter equivalents of the setters in the previous table

    ResultSet get methods
    Method name             Return type
    ====================================
    getBoolean              boolean
    getDouble               double
    getInt                  int
    getLong                 long
    getObject               Object
    getString               String

    Not all of the primitive types are in the table
    There are getByte() and getFloat() methods, but you don't need to
    know about them for the exam. There is no getChar() method.

    The getObject() method can return any type. For a primitive, it uses the
    wrapper class. Let's look at the following example:
    */
    public static void returnAnyType(Connection conn) throws SQLException {
        var sql = "SELECT id, name FROM exhibits";

        try (var ps = conn.prepareStatement(sql);
            var rs = ps.executeQuery()) {
            while(rs.next()) {
                Object idField = rs.getObject("id");
                Object nameField = rs.getObject("name");
                if (idField instanceof Integer) { //show you how to confirm that the type is
                    int id = (Integer) idField;//Integer before casting and unboxing it into an int.
                    System.out.println(id);
                }
                if (nameField instanceof String) { //show you how to confirm that the type is String and cast it as well.
                    String name = (String) nameField;
                    System.out.println(name);
                }
            }
        }
    }
    //You probably won't use getObject() when writing code for a job, but it is
    //good to know about it for the exam.

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
