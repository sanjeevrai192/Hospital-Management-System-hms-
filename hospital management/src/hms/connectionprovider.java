
package hms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionprovider {
   
    public static Connection getcon(){
   
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        
     
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Mahadev@123");
      
           return con;
          
       }catch(Exception e){
           return null;
       }
       
   
    }
    
 
    
}
