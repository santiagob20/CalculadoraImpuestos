/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author santiagob20
 */
public class Conexion {
    public static Connection c;
    public Connection conectarse()
    {
        try 
        {
            String usu = "admin";
            String clave = "admin";
            
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/productos",usu,clave);
            System.out.println("Conexion!!!");
            return c;
       
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la BD ","error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public void desconectarse(){
     
        if(c!=null){
            try {
                if(!c.isClosed()){
                    c.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
