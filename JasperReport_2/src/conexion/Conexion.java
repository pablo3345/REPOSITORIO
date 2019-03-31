/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author pablo
 */
public class Conexion {
    
   public Connection getConexion(){
       Connection con = null;
       
       //las credenciales
       String sDriver = "com.mysql.jdbc.Driver";
       String sURL = "jdbc:mysql://localhost:3306/jasperreport_2";
       
       try {
            Class.forName(sDriver).newInstance();
             con = DriverManager.getConnection(sURL, "root", "1234");
              JOptionPane.showMessageDialog(null, "conexion exitosa");
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectar con la base de datos");
       }
       
       return con;
   
   
   
   
   }
    
    
    
}
