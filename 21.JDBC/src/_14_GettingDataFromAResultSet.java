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
     */
}
