
package Dao;

import Model.Adminlogin;
import Service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletContext;

public class AdminloginDao {
    public static boolean checkAdmin(Adminlogin comp,ServletContext context)
  {
     boolean status = false;
     Connection con = null;
     try{
         con = GetConnection.getConnection(context);
         String sql = "select * from adminlogin where email = ? and pass = ?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1,comp.getEmail());
         ps.setString(2,comp.getPass());
         ResultSet rs = ps.executeQuery();
         if(rs.next())
           status = true;
                 
     }
     catch(Exception e)
     {
     
     }
     finally{
         try{
           con.close();
         }
         catch(Exception e)
         {
         
         }
     }
     return status;        
  }
}
