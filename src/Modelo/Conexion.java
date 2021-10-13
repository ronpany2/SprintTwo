
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author RONNY PANTOJA
 */
public class Conexion {
    public static Connection getConnection(){
        Connection con = null;
        String bd = "hangardb";
        String url = "jdbc:mysql://localhost:3306/"+bd;
        String user = "root";
        String password = "darcy";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url,user,password);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
    
}
