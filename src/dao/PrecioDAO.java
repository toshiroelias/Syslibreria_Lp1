/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dto.PrecioDTO;
import interfaces.InterfacePrecio;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public class PrecioDAO implements InterfacePrecio{

    //conexion::::
   
    //fin
    
   //cargando en el array list::::
    
    
    //fin
    
    
    
    @Override
    public List<PrecioDTO> listarPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarPrecio(PrecioDTO precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarPrecio(PrecioDTO precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPrecio(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PrecioDTO buscarPrecio(String precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
