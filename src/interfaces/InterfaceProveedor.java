/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ProveedorDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceProveedor {
       public List<ProveedorDTO> listarProveedor();
    public boolean agregarProveedor(ProveedorDTO proveedor);
    public boolean editarProveedor(ProveedorDTO proveedor);
    public boolean eliminarProveedor(int id);
    public ProveedorDTO buscarProveedor(String proveedor);
    
}
