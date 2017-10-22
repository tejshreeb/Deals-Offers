package Service;
import java.sql.*;
import javax.servlet.ServletContext;

public class GetConnection {
    public static Connection con=null;
    public static Connection getConnection(ServletContext context)
    {
    String driver = context.getInitParameter("driver");
    String db_url=context.getInitParameter("db_url");
    String username=context.getInitParameter("username");
    String pass=context.getInitParameter("password");
    try{
       Class.forName(driver);
       con=DriverManager.getConnection(db_url,username,pass);
    }catch(Exception e){}
    return con;
    }    
}
