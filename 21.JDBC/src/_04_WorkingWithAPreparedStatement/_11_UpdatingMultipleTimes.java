package _04_WorkingWithAPreparedStatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class _11_UpdatingMultipleTimes {
    /*Updating Multiple Times
    =======================
    Suppose we get two new elephants and want to add both. We can use the same PreparedStatement object.
    */
    public static void updatingMultipleTimes(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 20);
            ps.setInt(2, 1);
            ps.setString(3, "Ester");
            ps.executeUpdate();
            ps.setInt(1, 21);
            ps.setString(3, "Elias");
            ps.executeUpdate();
        }
    }

    /*
    Note that we set all three parameters when adding Ester, but only two for
    Elias. The PreparedStatement is smart enough to remember the
    parameters that were already set and retain them. You only have to set the
    ones that are different.

    BATCHING STATEMENTS
    ===================
    JDBC supports batching so you can run multiple statements in fewer
    trips to the database.
    For example, if you need to insert 1,000 records into the database, then inserting
    them as a single network call (as opposed to 1,000 network calls) is
    usually a lot faster.

    You don't need to know the addBatch() and executeBatch()
    methods for the exam, but they are useful in practice.
    */
    public static void register(Connection conn, int firstKey, int type, String... names) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }
            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }
    /*
    Now we call this method with two names:
    register(conn, 100, 1, "Elias", "Ester");

    The output shows the array has two elements since there are two
    different items in the batch. Each one added one row in the database.
    [1, 1]

    When using batching, you should call executeBatch() at a set
    interval, such as every 10,000 records (rather than after ten million).
    Waiting too long to send the batch to the database could produce
    operations that are so large that they freeze the client (or even worse
    the database!).
     */
}
