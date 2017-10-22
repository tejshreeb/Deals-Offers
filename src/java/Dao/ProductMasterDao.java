
package Dao;

import Model.ProductMaster;

import Service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletContext;

public class ProductMasterDao {
     public static boolean ProductDetail(ProductMaster comp,ServletContext context)
     {
    boolean status=false;
    Connection con=null;
    try{
        
        con= GetConnection.getConnection(context);
        String sql="insert into productmaster(P_name,P_category,P_type,Price,Brand,image,Description,Quantity,P_visibile)values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, comp.getP_name());
        ps.setString(2, comp.getP_category());
        ps.setString(3, comp.getP_type());
        ps.setString(4, comp.getPrice());
        ps.setString(5, comp.getBrand());
        ps.setString(6, comp.getImage());
        ps.setString(7, comp.getDescription());
        ps.setInt(8, comp.getQuantity());
        ps.setBoolean(9, comp.isP_visibile());
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
}
