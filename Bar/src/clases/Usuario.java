/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Michael
 */
public class Usuario {
    
    private Persona Persona;
    private String Usuario;
    private String Contrasenia;
    
    public Usuario(){}
    
    public Usuario(Persona Persona, String Usuario, String Contrasenia){
        this.Persona = Persona;
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
    }

    /**
     * @return the Persona
     */
    public Persona getPersona() {
        return Persona;
    }

    /**
     * @param Persona the Persona to set
     */
    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contrasenia
     */
    public String getContrasenia() {
        return Contrasenia;
    }

    /**
     * @param Contrasenia the Contrasenia to set
     */
    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
    
}
