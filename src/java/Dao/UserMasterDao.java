package Dao;

import Model.UserMaster;
import java.sql.Connection;

import java.sql.ResultSet;
import Service.GetConnection;
import java.sql.PreparedStatement;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class UserMasterDao {
    
    public static boolean registerCompany(UserMaster comp,ServletContext context)
     {
    boolean status=false;
    Connection con=null;
    try{
        
        con= GetConnection.getConnection(context);
        String sql="insert into usermaster(name,email,c_pass,contact,address)values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, comp.getName());
        ps.setString(2, comp.getEmail());
        ps.setString(3, comp.getC_pass());
        ps.setInt(4, comp.getContact());
        ps.setString(5, comp.getAddress());
        if(ps.executeUpdate()!=0)
            status=true;
        else
            status=false;
       
         }catch(Exception e)
          {
           status=false;
           e.printStackTrace();
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
    public static int checkUser(UserMaster comp,ServletContext context)
  {
     
  
     int user_id=0; 
     Connection con = null;
     try{
         con = GetConnection.getConnection(context);
         String sql = "select * from usermaster where email=? and c_pass=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(1,comp.getEmail());
         ps.setString(2,comp.getC_pass());
         
         ResultSet rs = ps.executeQuery();
         if(rs.next())
         {
         user_id=rs.getInt(1);
         }      
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
     return user_id ;        
  } 
    public static String getdetail(int comp,ServletContext context)
  {
    String name=null;
    
     Connection con = null;
     try{
         con = GetConnection.getConnection(context);
         String sql = "select * from usermaster where user_id=?";
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1,comp);
         
         
         ResultSet rs = ps.executeQuery();
         if(rs.next())
         {
         name=rs.getString(1);
         }      
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
     return name ;        
  }   
    
 }
