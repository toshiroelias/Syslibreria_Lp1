/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.PrecioDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfacePrecio {
    
      public List<PrecioDTO> listarPrecio();
    public boolean agregarPrecio(PrecioDTO precios);
    public boolean editarPrecio(PrecioDTO precios);
    public boolean eliminarPrecio(int id);
    public PrecioDTO buscarPrecio(String precios);
    
    
}
