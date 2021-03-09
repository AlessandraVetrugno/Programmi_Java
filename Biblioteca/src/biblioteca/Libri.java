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
public class Libri implements Serializable{
    public String ISBN;
    public String Autore;
    public String Titolo;
    //private String casa editrice

    public Libri(String ISBN, String Autore, String Titolo) {
        this.ISBN = ISBN;
        this.Autore = Autore;
        this.Titolo = Titolo;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutore() {
        return Autore;
    }

    public String getTitolo() {
        return Titolo;
    }

    @Override
    public String toString() {
        return " ISBN: " + ISBN  + "\n " + "L'autore è: " + Autore + "\n "+ "Il titolo è: " + Titolo + ' ';
    }

    
    
    
    
    
    
    
    
    
    
    
}
