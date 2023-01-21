import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhari
 */
public class DatabaseConnection {
    public Connection conn = null;
    public Statement cn;

    public DatabaseConnection() {
        Koneksi();
    }
    
    public void Koneksi() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas", "root", "");
            
            cn = conn.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
