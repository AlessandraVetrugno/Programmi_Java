package contocorrente;


public class EsercizioContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente c, b;
        b = new ContoCorrente("Giorgia");
        c = new ContoCorrente("tano");
        
        b.deposita(100);
        b.preleva(50);
        System.out.println(b.toString());
        
    }
    
}