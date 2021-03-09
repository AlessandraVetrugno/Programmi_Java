package contocorrente;

import java.time.LocalDateTime;

public class Operazione {
    private float soldi;
    private String motivo;
    private LocalDateTime timestamp;
    private boolean successo;
    
    public Operazione(float soldi, String motivo, boolean successo){
        this.soldi = soldi;
        this.motivo = motivo;
        this.successo = successo;
        this.timestamp = LocalDateTime.now();
    }
    
    @Override
    public String toString(){
        String s;
        if (this.successo == true){
            s = "L'operazione è stata eseguita il " +
                timestamp + ". Il denaro mosso è di " + 
                soldi + " € con il seguente motivo: " + 
                motivo;
        }
        else{
            s = "L'operazione non è andata a buon fine " + 
                "in data" + 
                timestamp.getDayOfMonth() + "/" + 
                timestamp.getMonth() + "/" +
                timestamp.getYear() +
                " nel tentativo di muovere " +
                + soldi + " €.";
        }
        return s;
    }
}