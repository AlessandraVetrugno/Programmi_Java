package contocorrente;


public class EstrattoConto {
    private Operazione operazioni[];
    private int n_operazioni;
    
    public EstrattoConto(){
        operazioni = new Operazione[1000];
        n_operazioni = 0;
    }
    
  
    
    public void aggiungiOperazione(float soldi, String motivo, boolean successo){
        Operazione t = new Operazione(soldi, motivo, successo);
        operazioni[n_operazioni] = t;
        n_operazioni++;
    }
    
    public String toString(){
        String s = "Estratto conto\n";
        for (int i = 0; i < n_operazioni; i++)
            s += operazioni[i] + "\n";
        return s;
    }
}