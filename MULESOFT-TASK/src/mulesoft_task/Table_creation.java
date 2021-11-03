// VIJAYA DURGA KRISHNA PRASAD MARAMALLA
package mulesoft_task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sqlitetutorial.net
 */
public class Table_creation{

    public static void main(String args[])throws Exception{

        try{
        	//path
        	 Connection conn = DriverManager.getConnection("jdbc:sqlite:C://sqlite/Mulesoft.db");	
        	
        	 // Using the Statement Interface
        	 Statement stmt = conn.createStatement();
        	 
        	 //creation of the table 
        	 String sql = "CREATE TABLE IF NOT EXISTS Movies (\n"  
        	                + " name text NOT NULL,\n"  
       		                + " actor text NOT NULL,\n"  
       		                + " actress text NOT NULL,\n"
       		                + " director text NOT NULL,\n"
       		                + " year text \n"
       		                + ");"; 

            stmt.execute(sql);
            System.out.println("Table created Succesfully into the database ");
            
        } 
        	catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }   
}