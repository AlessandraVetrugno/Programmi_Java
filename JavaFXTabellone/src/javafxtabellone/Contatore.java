/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxtabellone;

/**
 *
 * @author Alessandra Vetrugno
 */
public class Contatore {
    
    private int contatore = 0;

    /**
     * Get the value of contatore
     *
     * @return the value of contatore
     */
    public int getContatore() {
        return contatore;
    }
    
    public void incrementa(){
        contatore++;
    }
    
    @Override
    public String toString() {
        return "" + contatore;
    }

}
