/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.UsuarioDTO;
import interfaces.InterfaceUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiro
 */
public class UsuarioDAO implements InterfaceUsuario{
    
    
    
     private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";
    
     private final ArrayList<UsuarioDTO> lista;
       
       public UsuarioDAO(){
    lista = new ArrayList<>();       
       }
       public ArrayList<UsuarioDTO> getLista(){
           return lista;
       }
        public void agregarproducto(UsuarioDTO dto){
            lista.add(dto);
        }
    

    @Override
    public List<UsuarioDTO> listarUsuario() {
         List<UsuarioDTO> lista = new ArrayList<>();
          sql = "select * from usuario";
          try {
               cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
              while(rs.next()){
                    UsuarioDTO u = new UsuarioDTO();
                u.setIdlogueo(rs.getInt("idLogueo"));
                u.setUsario(rs.getString("usuario"));
                u.setClave(rs.getString("clave"));
                u.setApellido(rs.getString("apellido"));
                u.setNombre(rs.getString("nombre"));
                u.setCargo(rs.getString("cargo"));
               
                lista.add(u);
              }
          }catch (SQLException e){
        
    }
          return lista;    
          
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarUsuario(UsuarioDTO usuario) {
        boolean op = false;
        sql="insert into usuario(idlogueo, Usuario, Clave, Apellido, Nombre, Cargo, "
            + " ) values( null, '"+usuario.getidlogueo()
            
                 +"', '"+usuario.getUsario()
                +"', '"+usuario.getClave()
                 +"', '"+usuario.getApellido()
                 +"', '"+usuario.getNombre()
                +"', '"+usuario.getCargo() +")";      
    
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
        }
        return op; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarUsuario(UsuarioDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsuarioDTO buscarUsuario(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
