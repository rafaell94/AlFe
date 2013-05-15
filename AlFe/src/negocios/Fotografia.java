/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author rodolfo
 */
public class Fotografia {
   /* identificación de fotografía
nombre (el nombre del archivo*)
fecha de creación (del archivo*)
dimensiones (aaa x bbb) en píxeles*
tipo de archivo* (PNG, GIF, JPG, etc)
el país donde fue tomada la fotografía
descripción general en prosa
tamaño del archivo* en kbytes.*/
    private String identificacion; //generada por el prgrama
    private String nombreFoto;
    private String fechaCreacion;//fecha de creacion del archivo
    private int[] dimensiones = new int[2]; 
    private String tipoArchivo;
    private String paisOrigen;
    private String descripcion;
    private int tamanoArchivo; //kbytes
    
    private String fechaDelEvento;//fehca cunado se tomo la foto

    public Fotografia(String nombreFoto, String fechaCreacion, String tipoArchivo, String paisOrigen, String descripcion, int tamanoArchivo, String fechaDelEvento) {
        this.nombreFoto = nombreFoto;
        this.fechaCreacion = fechaCreacion;//aqui seria la fecha actual del programa
        this.tipoArchivo = tipoArchivo; //se genera con el programa cuando le pasa la direccion de la foto
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.tamanoArchivo = tamanoArchivo; //tambn se genera por el pro
        this.fechaDelEvento = fechaDelEvento;
        
        /*generador de codigo de foto esa es la id*/
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int[] getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int[] dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(int tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getFechaDelEvento() {
        return fechaDelEvento;
    }

    public void setFechaDelEvento(String fechaDelEvento) {
        this.fechaDelEvento = fechaDelEvento;
    }
    
    
    
    
    
}
