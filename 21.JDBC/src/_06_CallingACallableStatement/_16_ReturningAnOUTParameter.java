package _06_CallingACallableStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class _16_ReturningAnOUTParameter {
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
    /*
    DataBase Specific Behaviour
    ===========================
    some databases allow you to omit the following:
    - Braces ( {})
    - Bind variable ( ?) if it is an OUT parameter
    - Call to registerOutParameter()

    For the exam, you need to answer according to the full requirements,
    which are described in this book. For example, you should answer
    exam questions as if braces are required.
     */

}
