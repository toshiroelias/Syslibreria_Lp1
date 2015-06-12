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
public class LogueoDTO {
    
    private int idusuario;
    private String usuario;
    private String clave;
    private String cargo;

    public LogueoDTO() {
    }

    public LogueoDTO(String usuario, String clave, String cargo) {
        this.usuario = usuario;
        this.clave = clave;
        this.cargo = cargo;
    }

   

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    
}
