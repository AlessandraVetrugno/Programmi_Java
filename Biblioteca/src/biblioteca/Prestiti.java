/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.Serializable;

/**
 *
 * @author Alessandra Vetrugno
 */
public class Prestiti implements Serializable{
    private String codiceLibro;
    private String codiceSocio;
    

    public Prestiti(String codiceLibro, String codiceSocio) {
        this.codiceLibro = codiceLibro;
        this.codiceSocio = codiceSocio;
    }

    public Prestiti getLibro(String codiceLibro){
        return this;
    }
    public String getCodiceLibro() {
        return codiceLibro;
    }

    public String getCodiceSocio() {
        return codiceSocio;
    }

    @Override
    public String toString() {
        return   "codiceLibro: " + codiceLibro + "\n  " + "codiceSocio: " + codiceSocio ;
    }
   
    
    
    
    
    
}
