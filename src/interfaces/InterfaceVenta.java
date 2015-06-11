/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.VentasDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceVenta {
    
      public List<VentasDTO> listarVenta();
    public boolean agregarVenta(VentasDTO ventas);
    public boolean editarVenta(VentasDTO ventas);
    public boolean eliminarVenta(int id);
    public VentasDTO buscarVenta(String ventas);
    
}
