import javax.naming.Name;
import java.sql.*;

public class World {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/world?username=root&password=root&useSSL=false"
            );
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM city");

            while(result.next()) {
                System.out.println(result.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
