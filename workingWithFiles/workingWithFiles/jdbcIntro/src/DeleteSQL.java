import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteSQL {

    public static void deleteData() throws SQLException {
        Connection connection = null;
        DBHelper helper = new DBHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try{
            connection = helper.getConnection();
            String sql = "delete from city where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            statement.execute();


        }catch(SQLException exception){
            helper.showErrorMessage(exception);
        }
        finally {
            System.out.println("Kayıt silindi.");
            statement.close();
            connection.close();

        }

    }
}
