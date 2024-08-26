import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateSQL {

    public static void updateData() throws SQLException {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            String sql = "update city set population=100000 where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            statement.execute();


        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            System.out.println("Kayıt guncellendi.");
            statement.close();
            connection.close();

        }

    }
}
