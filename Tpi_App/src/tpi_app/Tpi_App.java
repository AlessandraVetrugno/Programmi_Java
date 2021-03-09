/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi_app;

import java.util.Scanner;

/**
 *
 * @author alessandravetrugno
 */
public class Tpi_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        long tempo;
        System.out.println("Inserisci il nome del disco:");
        nome= input.next();
        System.out.println("Inserisci il tempo in ms:");
        tempo= input.nextLong();
        Thread t = new thread(nome,tempo);
        System.out.println("Per terminare il programma digitare stop");
        t.start();
        String stop= input.next();
        if(stop.equals("stop")){
           
            t.stop();
        }
        
    }
    
}
