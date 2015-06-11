/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dto.LogueoDTO;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public interface InterfaceLogueo {
    
     public int validarUsuario(String usuario, String pass);
     public int verificarUsuario(String usuario);
     public List<LogueoDTO> listarUsuario();
    public boolean agregarUsuario(LogueoDTO usuario);
    public boolean editarUsuario(LogueoDTO usuario);
    public boolean eliminarUsuario(int id);
    public LogueoDTO buscarUsuario(String usuario);
    
       
//    public List<Usuario> buscarUser(String user);
    
    
}
