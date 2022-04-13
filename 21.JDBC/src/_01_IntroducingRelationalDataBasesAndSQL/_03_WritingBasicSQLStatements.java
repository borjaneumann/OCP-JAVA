package _01_IntroducingRelationalDataBasesAndSQL;

public class _03_WritingBasicSQLStatements {

    /*
    They are referred to as CRUD (Create, Read, Update, Delete).
    The SQL keywords don't match the acronym, so pay attention to the SQL keyword of each in the below Table

    CRUD operations
    Operation           SQL Keyword         Description
    Create              INSERT              Adds a new row to the table
    Read                SELECT              Retrieves data from the table
    Update              UPDATE              Changes zero or more rows in the table
    Delete              DELETE              Removes zero or more rows from the table

    Unlike Java, SQL keywords are case insensitive. This means select,
    SELECT, and Select are all equivalent. Many people use uppercase for the
    database keywords so that they stand out. It's also common practice to use
    snake case (underscores to separate “words”) in column names. We follow
    these conventions. Note that in some databases, table and column names
    may be case sensitive.

    Examples
    ========
    Like Java primitive types, SQL has a number of data types. Most are self‐
    explanatory, like INTEGER. There's also DECIMAL, which functions a lot like
    a double in Java. The strangest one is VARCHAR, standing for “variable
    character,” which is like a String in Java. The variable part means that
    the database should use only as much space as it needs to store the value.

    The INSERT statement is usually used to create one new row in a table; here's an example:
    INSERT INTO exhibits VALUES (3, 'Asian Elephant', 7.5);

    The SELECT statement reads data from the table.
    SELECT * FROM exhibits WHERE ID = 3;

    Alternatively, you can list the columns that you want returned.
    SELECT name, num_acres FROM exhibits WHERE id = 3;

    It is preferable to list the column names for clarity. It also helps in case the
    table changes in the database.
    You can also get information about the whole result without returning
    individual rows using special SQL functions.
    SELECT COUNT(*), SUM(num_acres) FROM exhibits;

    Even if there are no rows in the table, the query returns one row that
    contains zero as the answer.
    The UPDATE statement changes zero or more rows in the database.
    UPDATE exhibits SET num_acres = num_acres + .5 WHERE name = 'Asian Elephant';

    The DELETE statement deletes one or more rows in the database.
    DELETE FROM exhibits WHERE name = 'Asian Elephant';
     */


}
