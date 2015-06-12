/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


/**
 *
 * @author Oropeza
 */
public class ProductosDTO {
    
    private int idproducto;
    private String producto;
    private double preciocomp;
    private int idprecio;
    private int cantidad;
    private int idlogueo;
    private String fecharegis;
    private String fechaven;
    private String cantegoria;
    private String serie;
    private String marca;

    public ProductosDTO() {
                
    }

    public ProductosDTO(String producto, double preciocomp, int idprecio, int cantidad, int idlogueo, String fecharegis, String fechaven, String cantegoria, String serie, String marca) {
        this.producto = producto;
        this.preciocomp = preciocomp;
        this.idprecio = idprecio;
        this.cantidad = cantidad;
        this.idlogueo = idlogueo;
        this.fecharegis = fecharegis;
        this.fechaven = fechaven;
        this.cantegoria = cantegoria;
        this.serie = serie;
        this.marca = marca;
    }

  
   

    

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPreciocomp() {
        return preciocomp;
    }

    public void setPreciocomp(double preciocomp) {
        this.preciocomp = preciocomp;
    }

    public int getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(int idprecio) {
        this.idprecio = idprecio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecharegis() {
        return fecharegis;
    }

    public void setFecharegis(String fecharegis) {
        this.fecharegis = fecharegis;
    }

    public String getFechaven() {
        return fechaven;
    }

    public void setFechaven(String fechavenc) {
        this.fechaven = fechavenc;
    }

    

    public String getCantegoria() {
        return cantegoria;
    }

    public void setCantegoria(String cantegoria) {
        this.cantegoria = cantegoria;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdlogueo() {
        return idlogueo;
    }

    public void setIdlogueo(int idlogueo) {
        this.idlogueo = idlogueo;
    }

    

    
}
