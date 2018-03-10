/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

import java.util.List;
import pq3.Producto;

/**
 *
 * @author santiagob20
 */
public interface OperImpuestos {
    
    public void insertar(Producto p);
    public void editar(Producto p);
    public void borrar(Producto p);
    public List<Producto> consultarT();
    
}
