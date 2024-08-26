import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertSQL {

    public static void insertData() throws SQLException {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);
            statement.execute();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {


            System.out.println("Kayıt eklendi.");
            statement.close();
            connection.close();
        }
    }
}
