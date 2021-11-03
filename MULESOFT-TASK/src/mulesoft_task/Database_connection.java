// VIJAYA DURGA KRISHNA PRASAD MARAMALLA

package mulesoft_task;
import java.sql.Connection;  
import java.util.*;
import java.sql.DatabaseMetaData;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Database_connection {  
  
    public static void main(String args[]) {  
        try {  
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the name of databse to be created ");
        	String dbname = sc.next();
        	
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/"+dbname+".db");  
            if (conn != null)
            {  
                DatabaseMetaData meta = conn.getMetaData();  
                System.out.println("Connected Suceesfully ");
                System.out.println("The driver name is " + meta.getDriverName());  
                System.out.println("A new database "+dbname+" has been created.");  
            }  
   
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
  
    
}  