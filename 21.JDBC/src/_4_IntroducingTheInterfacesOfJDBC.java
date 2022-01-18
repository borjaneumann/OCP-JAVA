public class _4_IntroducingTheInterfacesOfJDBC {
    /*
    For the exam you need to know five key interfaces of JDBC.
    With JDBC, the concrete classes come from the JDBC driver. Each
    database has a different JAR file with these classes.

    This driver JAR contains an implementation of these key interfaces along
    with a number of other interfaces. The key is that the provided
    implementations know how to communicate with a database.

    Interfaces in the JDK                       Implementation in the Driver
    ==========================================================================
    Driver                                      FooDriver
    Connection                                  FooConnection
    PreparedStatement  - CallableStatement      FooPreparedStatement  - FooCallableStatement
    ResultSet                                   FooResultSet

    What do these five interfaces do? On a very high level, we have the following:

    Driver: Establishes a connection to the database
    Connection: Sends commands to a database
    PreparedStatement: Executes a SQL query
    CallableStatement: Executes commands stored in the database
    ResultSet: Reads results of a query

    All database interfaces are in the package java.sql, so we will often omit
    the imports.

     */
}
