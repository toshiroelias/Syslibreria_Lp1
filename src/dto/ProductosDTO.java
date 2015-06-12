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
    private String serie;      
    private String marca;
    private String cantegoria;
    private String fecharegis;
    private String fechaven;
    private int cantidad;
    private double preciocomp;
    private int idlogueo;
    private int idprecio; 

    public ProductosDTO() {
                
    }

    public ProductosDTO(String producto, String serie, String marca, String cantegoria, String fecharegis, String fechaven, int cantidad, double preciocomp, int idlogueo, int idprecio) {
        this.producto = producto;
        this.serie = serie;
        this.marca = marca;
        this.cantegoria = cantegoria;
        this.fecharegis = fecharegis;
        this.fechaven = fechaven;
        this.cantidad = cantidad;
        this.preciocomp = preciocomp;
        this.idlogueo = idlogueo;
        this.idprecio = idprecio;
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
