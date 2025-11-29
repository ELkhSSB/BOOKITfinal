package ajin9raw;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
public class connexionDb {
    public static Connection getConnection(){
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet_jaa","root","salma");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"connection Failed");
        }
        return con;
    }
    
}
