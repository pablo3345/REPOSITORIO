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
    //el constructor
    public Conexion() {
    }
    
    

    public Connection getConexion() {
        Connection con = null;

        //las credenciales para la conexion con la base de datos
        String sDriver = "com.mysql.jdbc.Driver";//el driver
        String sURL = "jdbc:mysql://localhost:3306/jugadores"; //3306 es el puerto
        
        try {
            Class.forName(sDriver).newInstance(); // y creamos una nueva instancia
             con = DriverManager.getConnection(sURL, "root", "1234"); // nos retorna lo que es la conexion
              JOptionPane.showMessageDialog(null, "conexion exitosa");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "error al conectar con la base de datos");
            
        }
        return con;

    }

}
