
package contocorrente;


public class ContoCorrente {
    private String nominativo;
    private int codice;
    private float saldo;
    private EstrattoConto estratto;

    /*
    public ContoCorrente(){
        this.nominativo = "No nome";
        codice = -1;
        saldo = 0;
    }
    */
    public ContoCorrente(String nominativo){
        this.nominativo = nominativo;
        this.codice = (int)(Math.random()*1000000);
        this.estratto = new EstrattoConto();
    }
    
    public void deposita(float soldi){
        if (soldi > 10000){
            estratto.aggiungiOperazione(soldi, "", false);  //motivo =""
            
        }
        this.saldo += soldi;
        estratto.aggiungiOperazione(soldi, " troppi soldi in tasca", true);
        
        return;
    }
    
    public void preleva(float soldi){
       
        if (this.saldo - soldi < 0)
            estratto.aggiungiOperazione(soldi, " ", false);
            
        this.saldo -= soldi;
        estratto.aggiungiOperazione(soldi, " personali ", false);
        
        return;
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public String toString()
    {
        String s = "Codice conto:" + this.codice + ". Questo conto corrente è di " + this.nominativo
                + ". Il saldo è " + this.saldo  + "\n";
        s += estratto;
        return s;
    }
    
}