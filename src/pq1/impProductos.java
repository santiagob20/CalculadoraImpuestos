/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pq2.OperImpuestos;
import pq3.Producto;

/**
 *
 * @author santiagob20
 */
public class impProductos implements OperImpuestos {

    Conexion c = new Conexion();
    Producto p = new Producto();
    @Override
    public void insertar(Producto p) {
   
        c.conectarse();
        if(c.conectarse()!=null)
        {
            try {
                PreparedStatement st = c.conectarse().prepareStatement("INSERT INTO productos(nombre_producto,valor_producto,categoria,impuesto,total) VALUES(?,?,?,?,?)");
                st.setString(1, p.getNombre());
                st.setInt(2, p.getValorP());
                st.setString(3, p.getCategoria());
                st.setInt(4, p.getValorImp());
                st.setInt(5, p.getTotal());
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro almacenado");
            } catch (SQLException ex) {
                Logger.getLogger(impProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void editar(Producto p) {
    
    }

    @Override
    public void borrar(Producto p) {
    
    }

    @Override
    public List<Producto> consultarT() {
    return null;
    }
    
}
