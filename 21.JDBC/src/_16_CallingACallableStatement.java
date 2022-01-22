import java.sql.*;

public class _16_CallingACallableStatement {

    /*
    CALLING A CALLABLESTATEMENT
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
    /*
    RETURNING AN OUT PARAMETER
    ==========================
    In our previous examples, we returned a ResultSet. Some stored
    procedures return other information. Luckily, stored procedures can have
    OUT parameters for output. The magic_number() stored procedure sets its
    OUT parameter to 42. There are a few differences here:
    */
    public static void returningAnOutParameter(Connection conn) throws SQLException {
        var sql ="{?= call magic_number(?).}"; //( ?=) to specify that the
        //stored procedure has an output value. This is optional since we have the
        //OUT parameter, but it does aid in readability.
        try (var cs = conn.prepareCall(sql)) {
            cs.registerOutParameter(1, Types.INTEGER); //we register the OUT parameter. This is important. It allows
            //JDBC to retrieve the value on line 98
            cs.execute();
            System.out.println(cs.getInt("num"));
        }
    }
    /*
    Remember to always call registerOutParameter() for each OUT or INOUT parameter (which we will
    cover next). We call execute() instead of executeQuery() since we are not
    returning a ResultSet from our stored procedure.
     */




}
