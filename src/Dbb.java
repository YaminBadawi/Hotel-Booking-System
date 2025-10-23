import java.sql.Connection;
import java.sql.DriverManager;

public class Dbb {
    public static void main(String [] args)
    {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realdb","root","1245780");
            if(con!=null){
                System.out.println("true");
                
            }
            
        }
        catch (Exception e){
            System.out.println("false");
            e.printStackTrace();
        }
        
    }

   
}
