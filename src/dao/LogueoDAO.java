/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.LogueoDTO;
import interfaces.InterfaceLogueo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oropeza
 */
public class LogueoDAO implements InterfaceLogueo{

     private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";

    
       
    @Override
    public int validarUsuario(String usuario, String pass) {
       
 int x = 0;
       sql ="select *from usuario where usuario='"+
               usuario+"' and "+"clave='"+pass+"'";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                x=1;
            }            
        } catch (SQLException e) {
            
        }
        return x;        

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int verificarUsuario(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogueoDTO> listarUsuario() {
   List<LogueoDTO> lista = new ArrayList<>();
    sql = "select *from usuario";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                LogueoDTO usu = new LogueoDTO();
                usu.setIdusuario(rs.getInt("idlogueo"));
                usu.setCargo(rs.getString("cargo"));
              
                lista.add(usu);
            }
             
        } catch (SQLException e) {
        }
        
        
       return lista;        
        

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarUsuario(LogueoDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarUsuario(LogueoDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LogueoDTO buscarUsuario(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
