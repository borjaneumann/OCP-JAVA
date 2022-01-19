public class _7_GettingADatabaseConnection {

    /*
    GETTING A DATABASE CONNECTION
    =============================
    There are two main ways to get a Connection:

    DriverManager or DataSource.

    DriverManager is the one covered on the exam. Do not use a
    DriverManager in code someone is paying you to write. A DataSource
    has more features than DriverManager. For example, it can pool
    connections or store the database connection information outside the
    application.

    USING A DATASOURCE
    ==================
    In real applications, you should use a DataSource rather than
    DriverManager to get a Connection.

    1) there's no reason why you should have to know the database password.
    It's far better if the database team or another team can set up a data source that
    you can reference.
    2) A DataSource maintains a connection pool so that you can keep reusing the
    same connection rather than needing to get a new one each time.
    Even the Javadoc says DataSource is preferred over DriverManager.


     */

}
