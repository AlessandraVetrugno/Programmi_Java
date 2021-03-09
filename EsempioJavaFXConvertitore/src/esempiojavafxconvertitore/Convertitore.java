/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esempiojavafxconvertitore;

/**
 *
 * @author Alessandra Vetrugno
 */
public class Convertitore {
    private double costanteDiConversione;
    private String iniziale, finale;
    private double valore;
    
    public Convertitore(String iniziale, String finale, double k)
    {
        this.iniziale = iniziale;
        this.finale  = finale;
        costanteDiConversione = k;
    }
    
    public void setValore(double valore)
    {
        this.valore = valore;
    }
    
    public double faiConversione()
    {
        return costanteDiConversione*valore;
    }

    public boolean trovato(String iniziale, String finale)
    {
        if (this.iniziale == iniziale && this.finale == finale)
            return true;
        return false;
    }
    
    public String getEtichetta()
    {
        return iniziale + "---" + finale;
    }
    
    @Override
    public String toString() {
        return  "" + valore + " " + iniziale + " sono " + faiConversione() + " " +
                finale;
    }
    
    
}
