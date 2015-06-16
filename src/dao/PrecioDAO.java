/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import config.Conexion;
import dto.PrecioDTO;
import interfaces.InterfacePrecio;
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
public class PrecioDAO implements InterfacePrecio{

      private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";
    
     private final ArrayList<PrecioDTO> lista;
       
       public PrecioDAO(){
    lista = new ArrayList<>();       
       }
       public ArrayList<PrecioDTO> getLista(){
           return lista;
       }
        public void agregarproducto(PrecioDTO dto){
            lista.add(dto);
        }
   
    
    
    
    @Override
    public List<PrecioDTO> listarPrecio() {
       //To change body of generated methods, choose Tools | Templates.
        
          List<PrecioDTO> lista = new ArrayList<>();
          sql = "select * from precio";
          try {
               cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
              while(rs.next()){
                    PrecioDTO p = new PrecioDTO();
                p.setIdprecio(rs.getInt("idprecio"));
                p.setPrecio_unitario(rs.getString("precio_unitario"));
                p.setPrecio_mayor(rs.getString("precio_mayor"));
                p.setFecha(rs.getString("fecha"));
               
                lista.add(p);
              }
          }catch (SQLException e){
        
    }
          return lista;    
    }

    @Override
    public boolean agregarPrecio(PrecioDTO precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarPrecio(PrecioDTO precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPrecio(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PrecioDTO buscarPrecio(String precios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
