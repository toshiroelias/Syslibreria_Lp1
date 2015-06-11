/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ClienteDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceCliente {
    
      public List<ClienteDTO> listarCliente();
    public boolean agregarCliente(ClienteDTO cliente);
    public boolean editarCliente(ClienteDTO cliente);
    public boolean eliminarCliente(int id);
    public ClienteDTO buscarCliente(String cliente);
    
    
}
