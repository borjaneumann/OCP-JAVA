package _05_GettingDataFromAResultSet;

import java.sql.Connection;
import java.sql.SQLException;

public class _12_GettingDataForAColumn {
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
}
