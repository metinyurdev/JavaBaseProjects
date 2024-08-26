import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
//    static String username = "root";
//    static String password = "12345";
//    static String dbUrl = "jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try{
//            connection = DriverManager.getConnection(dbUrl,username,password);

            connection = helper.getConnection();
            System.out.println("Baglanti olustu");

        } catch (SQLException exception){
            //System.out.println(exception.getMessage());
            helper.showErrorMessage(exception);

        }
        finally {
            connection.close();
        }



    }
}