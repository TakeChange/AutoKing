
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionClass 
{
    public Connection getConnection() throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/autoking";
        
        String username = "root"; // default username for XAMPP MySQL
        String password = ""; // default password for XAMPP MySQL
        Connection conn = DriverManager.getConnection(url, username,password);
        return conn;
    }
    
}
