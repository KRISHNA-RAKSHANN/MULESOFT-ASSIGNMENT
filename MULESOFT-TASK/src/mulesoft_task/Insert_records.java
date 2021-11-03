// VIJAYA DURGA KRISHNA PRASAD MARAMALLA

package mulesoft_task;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
   
public class Insert_records {  
   
    public static void main(String args[])throws Exception{  
        
        String url = "jdbc:sqlite:C://sqlite/Mulesoft.db";  
        Connection conn = null;  
        try 
        {  
        	//path
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            
            // Using the PreparedStatement Interface  to insert records 
            PreparedStatement ps = conn.prepareStatement("insert into Movies values(?,?,?,?,?)");
            Scanner sc = new Scanner(System.in);
          
            System.out.println("Enter the details of movie to be inserted into table");
            
            System.out.println("Enter the Movie Name");
            String name = sc.next();
            
            System.out.println("Enter the Movie Actor");
            String actor = sc.next();
            
            System.out.println("Enter the Movie Actress");
            String actress = sc.next();
            
            System.out.println("Enter the Movie Director");
            String director = sc.next();
            
            System.out.println("Enter the Movie Year of release");
            String year = sc.next();
            
            ps.setString(1, name);
            ps.setString(2, actor);
            ps.setString(3, actress);
            ps.setString(4, director);
            ps.setString(5, year);
            
            ps.executeUpdate();
            
            System.out.println("Inserted Sucessfuly into the table ");
        }
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
}
   
  
   