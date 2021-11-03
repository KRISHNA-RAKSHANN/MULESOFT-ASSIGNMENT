// VIJAYA DURGA KRISHNA PRASAD MARAMALLA

package mulesoft_task;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
   
public class Retreive_records {  
   
    public static void main(String args[])throws Exception{    
        Connection conn = null;  
        try 
        {  
            conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");
            Statement stmt = conn.createStatement();
            
            // retreiving the Records from the table 
            ResultSet rs = stmt.executeQuery("select * from Movies");
           
            while(rs.next()) 
            {
            	String name = rs.getString(1);
            	String actor = rs.getString(2);
            	String actress = rs.getString(3);
            	String director = rs.getString(4);
            	String year = rs.getString(5);
            	System.out.println("Movie name :"+name+"\nActor :"+actor+"\nActress: "+actress+"\nDirector :"+director+"\nYear: "+year+"\n");
            }
                
        }
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
}
   
  
   