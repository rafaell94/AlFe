/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author rodolfo
 */
public class FotoEmpresarial {
    /*nombre de la compañía
página o perfil de Facebook de la compañía
cuenta de Twitter de la compañía
fecha del evento XXXX
imagen de código de respuesta rápida de la compañía (código QR).*/
    private String compania;
    private String facebook;
    private String twiter;

    //QrCode codgigoQr;
    public FotoEmpresarial(String compania, String facebook, String twiter) {
        this.compania = compania;
        this.facebook = facebook;
        this.twiter = twiter;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwiter() {
        return twiter;
    }

    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }
    
    
    
}
