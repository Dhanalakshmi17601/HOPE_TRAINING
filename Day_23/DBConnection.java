import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students", "root", "root@123");

            System.out.println("DataBase Connected! Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
