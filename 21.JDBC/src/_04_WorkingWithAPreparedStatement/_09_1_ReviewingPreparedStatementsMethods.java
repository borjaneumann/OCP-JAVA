package _04_WorkingWithAPreparedStatement;

public class _09_1_ReviewingPreparedStatementsMethods {
    //Important!!!
    /*
    SQL runnable by the execute method
    Method              DELETE      INSERT      SELECT      UPDATE
    ===============================================================
    ps.execute()        Yes         Yes         Yes         Yes
    ps.executeQuery()   No          No          Yes         No
    ps.executeUpdate()  Yes         Yes         No          Yes

    Return types of execute methods
    Method              Return type What is returned for SELECT     What is returned for DELETE/INSERT/UPDATE
    =========================================================================================================
    ps.execute()        boolean     true                            false
    ps.executeQuery()   ResultSet   The rows and columns returned   n/a
    ps.executeUpdate()  int         n/a                             Number of rows added/changed/removed
     */
}
