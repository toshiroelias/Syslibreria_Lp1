/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Conexion;
import dto.ProveedorDTO;
import interfaces.InterfaceProveedor;
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
public class ProveedorDAO implements InterfaceProveedor{

      private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";
    
     private final ArrayList<ProveedorDTO> lista;
       
       public ProveedorDAO(){
    lista = new ArrayList<>();       
       }
       public ArrayList<ProveedorDTO> getLista(){
           return lista;
       }
        public void agregarproducto(ProveedorDTO dto){
            lista.add(dto);
        }
    
    
    @Override
    public List<ProveedorDTO> listarProveedor() {
       //To change body of generated methods, choose Tools | Templates.
           List<ProveedorDTO> lista = new ArrayList<>();
          sql = "select * from proveedor";
          try {
               cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
              while(rs.next()){
                    ProveedorDTO P = new ProveedorDTO();
                P.setIdproveedor(rs.getInt("idproveedor"));
                P.setProveedor(rs.getString("proveedor"));
                P.setRUC(rs.getString("RUC"));
                P.setDireccion(rs.getString("direccion"));
                P.setTefefono(rs.getString("telefono"));
                P.setPagina(rs.getString("pagina"));
                P.setE_mail(rs.getString("E - Mail"));
                P.setObservacion(rs.getString("observacion"));
               
                lista.add(P);
              }
          }catch (SQLException e){
        
    }
          return lista;    
    }

    @Override
    public boolean agregarProveedor(ProveedorDTO proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarProveedor(ProveedorDTO proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProveedorDTO buscarProveedor(String proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
