/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.util.ArrayList;

/**
 *
 * @author rodolfo
 */
public class FotoSocial extends Fotografia{
   /* tipo de actividad social XXXXX
ambién debe ser posible
personas que “están” relacionadas con la fotografía 
acceso, airelibre
*/
    private String tipoActividad;
    private ArrayList<Persona> personas;
    private boolean aireLibre;
    private boolean acceso;

    public FotoSocial(String tipoActividad, ArrayList<Persona> personas, boolean aireLibre, boolean acceso, String nombreFoto, String fechaCreacion, String tipoArchivo, String paisOrigen, String descripcion, int tamanoArchivo, String fechaDelEvento) {
        super(nombreFoto, fechaCreacion, tipoArchivo, paisOrigen, descripcion, tamanoArchivo, fechaDelEvento);
        this.tipoActividad = tipoActividad;
        this.personas = personas;
        this.aireLibre = aireLibre;
        this.acceso = acceso;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public boolean isAireLibre() {
        return aireLibre;
    }

    public void setAireLibre(boolean aireLibre) {
        this.aireLibre = aireLibre;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    
    
    
}
