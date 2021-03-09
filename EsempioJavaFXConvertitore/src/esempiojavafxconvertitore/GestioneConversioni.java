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
public class GestioneConversioni {
    private Convertitore conversioni[];
    private int n_conversioni;
    private static final int MAX_CONVERSIONI = 100;
    
    public GestioneConversioni()
    {
        n_conversioni = 0;
        conversioni = new Convertitore[MAX_CONVERSIONI];
    }
    
    public void add(Convertitore c)
    {
        if (n_conversioni < MAX_CONVERSIONI){
            conversioni[n_conversioni] = c;
            n_conversioni++;
        }
    }

    public boolean conosceConversione(String in,
            String fin)      
    {
        for (int i = 0; i < n_conversioni; i++)
            if (conversioni[i].trovato(in, fin))
                return true;
        return false;
    }
    
    public double faiConversione(String in,
            String fin, double valore)
    {
        if (conosceConversione(in, fin))
        {
            for (int i = 0; i < n_conversioni; i++)
               if (conversioni[i].trovato(in, fin))
               {
                   conversioni[i].setValore(valore);
                   return conversioni[i].faiConversione();
               }
        }
        return -1;        
    }
    
    
    public double faiConversione(String etichetta, double valore)
    {
        if (true)
        {
            for (int i = 0; i < n_conversioni; i++)
               if (conversioni[i].getEtichetta().equals(etichetta))
               {
                   conversioni[i].setValore(valore);
                   return conversioni[i].faiConversione();
               }
        }
        return -1;        
    }
    
    public String[] getItems()
    {
        String temp[] = new String[n_conversioni];
        for (int i = 0; i < n_conversioni; i++)
            temp[i] = conversioni[i].getEtichetta();
         return temp;
    }
    
    @Override
    public String toString() {
        return "Attualmente so fare " + n_conversioni +
                " conversioni";
    }
    
    
}
