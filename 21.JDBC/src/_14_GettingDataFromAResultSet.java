import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class _14_GettingDataFromAResultSet {

    /*
    A database isn't useful if you can't get your data.

    READING A RESULTSET
    ===================
    */
    public static void workingWithResultSet(Connection conn) {
        String sql = "SELECT id, name FROM exhibits";
        Map<Integer, String> idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /*
    It outputs this: {1=African Elephant, 2=Zebra}

    We use the executeQuery() method on line 20, since we want to have a ResultSet returned.
    On line 21, we loop through the results. Each time through the loop represents one
    row in the ResultSet.
    Lines 22 and 23 show you the best way to get the columns for a given row.

    A ResultSet has a cursor, which points to the current location in the data.
    The cursor starts out pointing to the location before the first row
    in the ResultSet. On the first loop iteration, rs.next() returns true, and
    the cursor moves to point to the first row of data. On the second loop
    iteration, rs.next() returns true again, and the cursor moves to point to
    the second row of data. The next call to rs.next() returns false. The
    cursor advances past the end of the data. The false signifies that there is
    no more data available to get.

    We did say the “best way.” There is another way to access the columns.
    You can use an index instead of a column name. The column name is
    better because it is clearer what is going on when reading the code. It also
    allows you to change the SQL to reorder the columns.
    On the exam, either you will be told the names of the columns in a
    table or you can assume that they are correct. Similarly, you can
    assume that all SQL is correct.

    Rewriting this same example with column numbers looks like the
    following:
    */
    public static void workingWithResultSetColumnNumbers(Connection conn) {

        String sql = "SELECT id, name FROM exhibits";
        Map<Integer, String> idToNameMap = new HashMap<>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt(1); // column positions, they always start from 1
                String name = rs.getString(2); // column positions
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /*
    Sometimes you want to get only one row from the table. Maybe you need
    only one piece of data. Or maybe the SQL is just returning the number of
    rows in the table. When you want only one row, you use an if statement
    rather than a while loop.

     */
    public static void onlyOneRow(Connection conn) {

        String sql = "SELECT count(*) FROM exhibits";

        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if(rs.next()) {
                int count =rs.getInt(1);
                System.out.println(count);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //Alternatively, you can use the column name.
    public static void rowByColumnName(Connection conn) throws SQLException {
        var sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("count");
                System.out.println(count);
            }
        }
    }

    //Let's try to read a column that does not exist.
    public static void readingNonExistingColumn(Connection conn) {
        var sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("total");
                System.out.println(count);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //This throws a SQLException with a message like this: Column 'total' not found.

    /*
    Attempting to access a column name or index that does not exist throws a
    SQLException, as does getting data from a ResultSet when it isn't
    pointing at a valid row. You need to be able to recognize such code. Here
    are a few examples to watch out for.

    Do you see what is wrong here when no rows match?
    var sql = "SELECT * FROM exhibits where name='Not in table'";
    try (var ps = conn.prepareStatement(sql);
    var rs = ps.executeQuery()) {
        rs.next();
        rs.getInt(1); // SQLException
    }
    Calling rs.next() works. It returns false. However, calling a getter
    afterward does throw a SQLException because the result set cursor does
    not point to a valid position. If there actually were a match returned, this
    code would have worked.

    Do you see what is wrong with the following?
    var sql = "SELECT count(*) FROM exhibits";
    try (var ps = conn.prepareStatement(sql);
    var rs = ps.executeQuery()) {
        rs.getInt(1); // SQLException
    }
    Not calling rs.next() at all is a problem. The result set cursor is still
    pointing to a location before the first row, so the getter has nothing to point to.

    How about this one?
    var sql = "SELECT count(*) FROM exhibits";
    try (var ps = conn.prepareStatement(sql);
    var rs = ps.executeQuery()) {
        if (rs.next())
        rs.getInt(0); // SQLException
    }
    Since column indexes begin with 1, there is no column 0 to point to and a
    SQLException is thrown. Let's try one more example.

    What is wrong with this one?
    var sql = "SELECT name FROM exhibits";
    try (var ps = conn.prepareStatement(sql);
    var rs = ps.executeQuery()) {
    if (rs.next())
        rs.getInt("badColumn"); // SQLException
    }
    Trying to get a column that isn't in the ResultSet is just as bad as an
    invalid column index, and it also throws a SQLException.

    To sum up this section, it is important to remember the following:
    1) Always use an if statement or while loop when calling rs.next().
    2) Column indexes begin with 1.
     */



}
