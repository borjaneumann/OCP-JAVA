package _06_CallingACallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _14_CallingAProcedureWithoutParameters {
    /*
    CALLING A CALLABLE STATEMENT
    ===========================
    Sometimes you want your SQL to be directly in the database instead of
    packaged with your Java code. This is particularly useful when you have
    many queries and they are complex.

    A stored procedure is code that is compiled in advance and stored in the database.
    Stored procedures are commonly written in a database‐specific variant of SQL, which varies
    among database software providers.

    However, stored procedures
    are database‐specific and introduce complexity of maintaining your
    application. On the exam, you need to know how to call a stored
    procedure but not decide when to use one.

    We will be using four stored procedures in this section. The below table
    summarizes what you need to know about them. In the real world, none of
    these would be good implementations since they aren't complex enough to
    warrant being stored procedures.

    Sample stored procedures
    Name                    Parameter name      Parameter type      Description
    read_e_names()          n/a                 n/a                 Returns all rows in the names table that have a name beginning with an E
    read_names_by_letter()  prefix              IN                  Returns all rows in the names table that have a name beginning with the specified parameter
    magic_number()          Num                 OUT                 Returns the number 42
    double_number()         Num                 INOUT               Multiplies the parameter by two and returns that number


    CALLING A PROCEDURE WITHOUT PARAMETERS
    ======================================
    read_e_names()

    Our read_e_names() stored procedure doesn't take any parameters. It does return a ResultSet.
            */
    public static void read_E_Name(Connection conn) throws SQLException {
        String sql = "{call read_e_names()}"; // A stored procedure is called by putting the word call and the procedure name in braces ( {}).
        try (CallableStatement cs = conn.prepareCall(sql); //creates a CallableStatement object. When we created a PreparedStatement, we used the
             // prepareStatement() method. Here, we use the prepareCall() method instead.
             ResultSet rs= cs.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        }
    }
    //This stored procedure returns the underlying table, so the columns are the same.


}
