package _03_ConnectingToADatabase;

public class _05_BuildingAJDBCUrl {
    /*
        The first step in doing anything with a database is connecting to it. First,
    we will show you how to build the JDBC URL. Then, we will show you
    how to use it to get a Connection to the database.

    BUILDING A JDBC URL
    ===================
    To access a website, you need to know the URL of the website. To access
    your email, you need to know your username and password. JDBC is no
    different. To access a database, you need to know this information about
    it.

    A JDBC URL has a variety of formats. They have three parts in common.

    The first piece is always the same. It is the protocol jdbc.
    The second part is the subprotocol, which is the name of the database such as derby, mysql, or postgres.
    The third part is the subname, which is a database‐specific format.

    Colons ( :) separate the three parts.

    jdbc:postgres://localhost:5432/zoo

    Protocol -> jdbc
    Subprotocol -> postgres
    Subname -> //localhost:5432/zoo (location and name)

    jdbc:derby:zoo

    Notice the three parts. It starts with jdbc and then comes the subprotocol
    derby, and it ends with the subname, which is the database name. The
    location is not required, because Derby is an in‐memory database.
    A location can be localhost or an IP address or a domain name.

    Other examples of subname are shown here:
    jdbc:postgresql://localhost/zoo
    jdbc:oracle:thin:@123.123.123.123:1521:zoo
    jdbc:mysql://localhost:3306
    jdbc:mysql://localhost:3306/zoo?profileSQL=true

     */
}
