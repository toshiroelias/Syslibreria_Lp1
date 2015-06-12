/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Toshiro
 */
public class UsuarioDTO {
    
      private int idlogueo;
    private String usuario;
    private String clave;
    private String apellido;
    private String nombre;
    private String cargo;
    

     public UsuarioDTO() {
                
    }

    public UsuarioDTO(String Idlogueo, String Usuario, String Clave, String Apellido, String Nombre, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public int getidlogueo(){
         return idlogueo;
     }

     
    public int getIdlogueo() {
        return idlogueo;
    }

    public void setIdlogueo(int idlogueo) {
        this.idlogueo = idlogueo;
    }

    public String getUsario() {
        return usuario;
    }

    public void setUsario(String usario) {
        this.usuario = usario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

  
    
   


    }


