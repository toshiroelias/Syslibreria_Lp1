/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.ProductosDTO;
import dto.UsuarioDTO;


import java.util.List;

/**
 *
 * @author Toshiro
 */
public interface InterfaceUsuario {
      public List<UsuarioDTO> listarUsuario();
    public boolean agregarUsuario(UsuarioDTO usuario);
    public boolean editarUsuario(UsuarioDTO usuario);
    public boolean eliminarUsuario(int id);
    public UsuarioDTO buscarUsuario(String usuario);
    
}
