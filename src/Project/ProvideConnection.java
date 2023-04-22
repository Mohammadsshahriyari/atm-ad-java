package Project;
import java.sql.*;

public class ProvideConnection {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myatm","root","root");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
 
}
