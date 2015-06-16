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
public class ProveedorDTO {
      
      private int idproveedor;
    private String proveedor;
    private String RUC;
    private String direccion;
    private String tefefono;
    private String pagina;
    private String E_mail;
    private String observacion;
    
     public ProveedorDTO() {
                
    }

    public ProveedorDTO(String proveedor, String RUC, String direccion, String tefefono, String pagina, String E_mail, String observacion) {
        this.proveedor = proveedor;
        this.RUC = RUC;
        this.direccion = direccion;
        this.tefefono = tefefono;
        this.pagina = pagina;
        this.E_mail = E_mail;
        this.observacion = observacion;
    }

  

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTefefono() {
        return tefefono;
    }

    public void setTefefono(String tefefono) {
        this.tefefono = tefefono;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
     
    
}
