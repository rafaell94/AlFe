/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author rodolfo
 */
public class FotoPeriodismo extends Fotografia{
    
    /*tipo de evento   XXXXX
La hora del evento
el ámbito del evento (Mundial, nacional, muy local)
sonido ambiente durante el evento (opcional)
latitud
longitud*/
    private String tipoEvento;
    private String horaEvento;
    private String ambito;
    //sonido
    private int[] coordenadas = new int[2]; //latitud, longitud

    public FotoPeriodismo(String tipoEvento, String horaEvento, String ambito, String nombreFoto
            , String fechaCreacion, String tipoArchivo, String paisOrigen, String descripcion, 
            int tamanoArchivo, String fechaDelEvento, int latitud, int longitud) {
        super(nombreFoto, fechaCreacion, tipoArchivo, paisOrigen, descripcion, tamanoArchivo, fechaDelEvento);
        this.tipoEvento = tipoEvento;
        this.horaEvento = horaEvento;
        this.ambito = ambito;
        coordenadas[0] = latitud;
        coordenadas[1] = longitud;
    }
    
    
    
}
