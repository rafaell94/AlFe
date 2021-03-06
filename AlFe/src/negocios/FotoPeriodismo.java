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

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public int getLatitud() {
        return coordenadas[0];
    }

    public void setLatitud(int _latitud) {
        this.coordenadas[0] = _latitud;
    }
    
    public int getLongitud() {
        return coordenadas[1];
    }

    public void setLongitud(int _longitud) {
        this.coordenadas[1] = _longitud;
    }
    
    
    
}
