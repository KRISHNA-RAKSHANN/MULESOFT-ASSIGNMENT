// VIJAYA DURGA KRISHNA PRASAD MARAMALLA

package mulesoft_task;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Test_connection {  
    public static void main(String args[])throws Exception 
    {  
        Connection conn = null;  
        try {  
            //path connection to the database
            String url = "jdbc:sqlite:C:/sqlite/Mulesoft.db";
            
            // create a connection to the database
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}  