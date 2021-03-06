/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ProductosDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceProducto {
    
    public List<ProductosDTO> listarProducto();
    public boolean agregarProducto(ProductosDTO p);
    public boolean editarProducto(ProductosDTO p);
    public boolean eliminarProducto(int id);
    public ProductosDTO buscarProducto(String p);
    
}
