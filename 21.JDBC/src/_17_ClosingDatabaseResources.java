public class _17_ClosingDatabaseResources {
    /*
    it is important to close resources when you are finished with them. This is true for JDBC
    as well. JDBC resources, such as a Connection, are expensive to create.
    Not closing them creates a resource leak that will eventually slow down your program.

    The resources need to be closed in a specific order.
    The ResultSet is closed first, followed by the PreparedStatement (or CallableStatement) and then the Connection.
    While it is a good habit to close all three resources, it isn't strictly necessary.
    Closing a JDBC resource should close any resources that it created. In particular, the following are true:
    - Closing a Connection also closes PreparedStatement (or CallableStatement) and ResultSet.
    - Closing a PreparedStatement (or CallableStatement) also closes the ResultSet.

    It is important to close resources in the right order. This avoids both
    resource leaks and exceptions.

     */
}
