/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author rodolfo
 */
public class Persona {
  
/*nombre y apellidos
apodo o alias
dirección de correo electrónico
número de teléfono móvil*/
   
    private String nombre;
    private String apodo;
    private String correoElectronico;
    private String numeroTelefonico;

    public Persona(String nombre, String apodo, String correoElectronico, String numeroTelefonico) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    
    
    
}
