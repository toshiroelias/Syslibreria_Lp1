/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.EmpleadoDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceEmpleado {
       public List<EmpleadoDTO> listarEmpleado();
    public boolean agregarEmpleado(EmpleadoDTO empleado);
    public boolean editarEmpleado(EmpleadoDTO empleado);
    public boolean eliminarEmpleado(int id);
    public EmpleadoDTO buscarEmpleado(String empleado);
    
}
