/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.Detalle_ventaDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceDetalle_venta {
 
       public List<Detalle_ventaDTO> listarDet_Vent();
    public boolean agregarDet_Vent(Detalle_ventaDTO det_vent);
    public boolean editarDet_Vent(Detalle_ventaDTO det_vent);
    public boolean eliminarDet_Vent(int id);
    public Detalle_ventaDTO buscarDet_Vent(String det_vent);
}
