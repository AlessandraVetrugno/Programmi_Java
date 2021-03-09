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
public class Soci implements Serializable{
    private String Nome;
   
    private String codicefiscale;

    public Soci(String Nome, String codicefiscale) {
        this.Nome = Nome;
        this.codicefiscale = codicefiscale;
    }

    @Override
    public String toString() {
        return   "Nome=" + Nome + "\n"  + "codicefiscale=" + codicefiscale;
    }
    
    
    
    
    
    
    
    
}
