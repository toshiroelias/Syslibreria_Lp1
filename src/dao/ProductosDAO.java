 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import config.Conexion;
import dto.ProductosDTO;
import interfaces.InterfaceProducto;
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
public class ProductosDAO implements InterfaceProducto {
    
    
//conexion::::
//    ConexionBD conex;
//    String sql;
    //fin
      private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql="";
//cargando en el array list::::
    
       private final ArrayList<ProductosDTO> lista;
       
       public ProductosDAO(){
    lista = new ArrayList<>();       
       }
       public ArrayList<ProductosDTO> getLista(){
           return lista;
       }
        public void añadirproducto(ProductosDTO dto){
            lista.add(dto);
        }
    
    
    //fin
    
    
    @Override
    public List<ProductosDTO> listarProducto() {
    
 List<ProductosDTO> lista = new ArrayList<>();
        sql = "select * from producto";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                ProductosDTO p = new ProductosDTO();
                p.setIdproducto(rs.getInt("idproducto"));
                p.setProducto(rs.getString("producto"));
                p.setPreciocomp(rs.getDouble("precio_compra"));
                p.setIdprecio(rs.getInt("idprecio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setFecharegis(rs.getString("fecha_registro"));
                p.setFechaven(rs.getString("fecha_venta"));
                p.setCantegoria(rs.getString("categoria"));
                p.setSerie(rs.getString("numero_serie"));
                p.setIdlogueo(rs.getInt("idLOGUEO"));
                p.setMarca(rs.getString("marca"));
                lista.add(p);
            }
        } catch (SQLException e) {
        }
        
       return lista;        
       
        

//To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public boolean agregarProducto(ProductosDTO p) {
       boolean op = false;
        sql="insert into producto(idproducto, producto, numero_serie, marca, categoria, fecha_registro, fecha_venta, cantidad, precio_compra, idLOGUEO, idprecio) values( null,'"+p.getProducto()
            +"', '"+p.getSerie()
            +"', '"+p.getMarca()
            +"', '"+p.getCantegoria()
            +"', '"+p.getFecharegis()
            +"', '"+p.getFechaven()
            +"', "+p.getCantidad()
            +", "+p.getPreciocomp()
            +", "+p.getIdlogueo()
            +", "+p.getIdprecio()+")";       
    
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
        }
        return op;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarProducto(ProductosDTO p) {
         boolean op = false;
        sql="update producto set = idproducto"+p.getIdproducto()
             +",producto =  '"+p.getProducto()
            +"', precio_compra="+p.getPreciocomp()
            +", idprecio="+p.getIdprecio()
            +", cantidad="+p.getCantidad()
            +", fecha_registro='"+p.getFecharegis()
            +"', fecha_venta='"+p.getFechaven()
            +"', categoria='"+p.getCantegoria()
            +"', serie='"+p.getSerie()
            +"', idLOGUEO="+p.getIdlogueo()
            +", marca='"+p.getMarca()
            +"' where idproducto="+p.getIdproducto();
         try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            st.executeUpdate(sql);
            op=true;
        } catch (Exception e) {
        }
        return op;
        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductosDTO buscarProducto(String p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
