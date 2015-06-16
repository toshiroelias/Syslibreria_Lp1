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
public class PrecioDTO {
     private int idprecio;
    private String precio_unitario;
    private String precio_mayor;
    private String fecha;
  
      public PrecioDTO() {
          
      }

    public PrecioDTO(String precio_unitario, String precio_mayor, String fecha) {
        this.precio_unitario = precio_unitario;
        this.precio_mayor = precio_mayor;
        this.fecha = fecha;
    }

    public int getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(int idprecio) {
        this.idprecio = idprecio;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getPrecio_mayor() {
        return precio_mayor;
    }

    public void setPrecio_mayor(String precio_mayor) {
        this.precio_mayor = precio_mayor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
      
      
}


