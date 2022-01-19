import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    /*The DriverManager class is in the JDK, as it is an API that comes with
            Java. It uses the factory pattern, which means that you call a static
    method to get a Connection, rather than calling a constructor. The factory
    pattern means that you can get any implementation of the interface when
calling the method. The good news is that the method has an easy‐to‐
    remember name— getConnection().
    To get a Connection from the Derby database, you write the following:
            import java.sql.*;

     */
        public static void main(String[] args) throws SQLException {

            Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
            System.out.println(conn);
        }
    /*
    Exception in thread "main" java.sql.SQLException: No suitable driver found for jdbc:derby:zoo
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:702)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:251)
	at _7_GettingADatabaseConnection$TestConnect.main(_7_GettingADatabaseConnection.java:46)

	 SQLException is a checked exception.

	 java -cp "C:\db-derby-10.15.2.0-bin\db-derby-10.15.2.0-bin\lib\derby.jar" _7_GettingADatabaseConnection.java

     it will return: org.apache.derby.impl.jdbc.EmbedConnection@1979080261 (XID = 210), (SESSIONID = 1), (DATABASE = zoo), (DRDAID = null)

    There is also a signature that takes a username and password.
    */
//    public static void main(String[] args) throws SQLException {
//        Connection conn = DriverManager.getConnection(
//        "jdbc:postgresql://localhost:5432/ocp-book",
//        "username",
//        "Password20182");
//        System.out.println(conn); //org.postgresql.jdbc4.Jdbc4Connection@eed1f14
//    }
    /*
    Unless the exam specifies a command line, you can assume that the
    correct JDBC driver JAR is in the classpath. The exam creators explicitly
    ask about the driver JAR if they want you to think about it.
    The nice thing about the factory pattern is that it takes care of the logic of
    creating a class for you. You don't need to know the name of the class that
    implements Connection, and you don't need to know how it is created.
    You are probably a bit curious, though.
     */


}
