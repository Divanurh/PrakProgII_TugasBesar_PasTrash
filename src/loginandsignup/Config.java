
package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author MSI CORE I7
 */
public class Config {
    public static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/userdb";
            String username="root";
            String password="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return mysqlconfig;
    }
}
