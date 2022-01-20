public class _11_ProcessingDataWithExecute {
    /*
    There's a third method called execute() that can run either a query or an
    update.
    It returns a boolean so that we know whether there is a ResultSet.
    That way, we can call the proper method to get more detail.

    The pattern looks like this:

    boolean isResultSet = ps.execute();
    if (isResultSet) {
        try (ResultSet rs = ps.getResultSet()) {
        System.out.println("ran a query");
        }
    } else {
        int result = ps.getUpdateCount();
        System.out.println("ran an update");
    }

    If the PreparedStatement refers to sql that is a SELECT, the boolean is
    true and we can get the ResultSet. If it is not a SELECT, we can get the
    number of rows updated.

    What do you think happens if we use the wrong method for a SQL statement?

    var sql = "SELECT * FROM names";
    try (var conn = DriverManager.getConnection("jdbc:derby:zoo");
    var ps = conn.prepareStatement(sql)) {
        var result = ps.executeUpdate();
    }

    This throws a SQLException similar to the following:
    Statement.executeUpdate() cannot be called with a statement that returns a ResultSet.

    We can't get a compiler error since the SQL is a String.
    We also get a SQLException when using executeQuery() with SQL that changes the database.
    Statement.executeQuery() cannot be called with a statement that returns a row count.
    Again, we get an exception because the driver can't translate the query into
    the expected return type.


     */
}
