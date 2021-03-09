/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi_app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandravetrugno
 */
public class thread extends Thread {
    private String unita;
    private long tempo;

    public thread(String unità, long tempo) {
     super(); 
     setName("Thread");
     this.unita= unità + ":/testo.txt";
     this.tempo= tempo;
    }
    
    @Override
    public void run(){ //scrittura dei file
        int tot_giri=0;
        while(true){
            try {
                FileOutputStream fou= new FileOutputStream(unita);
            } catch (FileNotFoundException ex) {
                
            }
            try {
                sleep(tempo);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
            }
            tot_giri++;
            System.out.println(tot_giri);
        }
        
    }
    
}
