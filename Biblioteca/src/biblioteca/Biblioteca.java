/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Alessandra Vetrugno
 */
public class Biblioteca {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) throws IOException {
        HashMap<String, Libri> libro;
        libro = new HashMap<>();
        TreeMap<String, Soci> soci;
        soci = new TreeMap<>();
        ArrayList<Prestiti> prestito;
        prestito = new ArrayList<>();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);
        while (true) {
            System.out.println("Premi 1 Per aggiungere un libro:");
            System.out.println("Premi 2 Ricerca libro a partire dal codice ISBN:");
            System.out.println("Premi 3 Ricerca dati di un socio dal codice fiscale:");
            System.out.println("Premi 4 Memorizzazione per fare un prestito:");
            System.out.println("Premi 5 Verifica un prestito:");
            System.out.println("Premi 6 Aggiornamento dei prestiti:");
            System.out.println("Premi 7 Per il salvataggio dei dati su file:");
            System.out.println("Premi 8 Per recupero dati da file:");
            System.out.println("Premi 9 Per terminare il programma:");
            String input = buf.readLine();
            switch (input) {
                case "1":
                    System.out.print("Inserisci il titolo del libro:");
                    String titolo = buf.readLine();
                    System.out.print("Inserisci l'autore del libro:");
                    String autore = buf.readLine();
                    System.out.print("Inserisci il codice ISBN:");
                    String codice = buf.readLine();
                    Libri l = new Libri(codice, autore, titolo);
                    libro.put(codice, l);
                    break;

                case "2":
                    System.out.print("Inserisci il codice ISBN da ricercare:");
                    String cod = buf.readLine();
                    System.out.println("I dati del libro sono:" + libro.get(cod));
                    break;

                case "3":
                    System.out.print("Inserisci il codice fiscale del socio:");
                    String codiceF = buf.readLine();
                    System.out.println("I dati del socio sono:" + soci.get(codiceF));
                    break;

                case "4": //Aggiunta del socio
                    System.out.print("Inserisci il nome del socio :");
                    String nsocio = buf.readLine();
                    System.out.print("Inserisci il codice fiscale del socio:");
                    String csocio = buf.readLine();
                    Soci s1 = new Soci(nsocio, csocio);
                    soci.put(csocio, s1);
                    System.out.print("Inserisci il codice del libro per il prestito:");
                    String codiceP = buf.readLine();
                    Prestiti p = new Prestiti(codiceP, csocio);
                    prestito.add(p);
                    break;

                case "5":
                    System.out.print("Inserisci il codice ISBN per verificare se è in prestito:");
                    String isbn = buf.readLine();
                    System.out.println(prestito);
                    if (prestito.isEmpty()) {
                        System.out.println("NON CI SONO LIBRI");
                    } else {
                        for (Prestiti pr : prestito) {
                            if (pr.getCodiceLibro().equals(isbn)) {
                                System.out.println("è in prestito e i dati  del socio sono:" + pr.getCodiceSocio());
                            } else {
                                System.out.println("Questo libro non è in prestito");
                                break;
                            }
                        }
                    }
                    break;

                case "6":
                    System.out.println("Inserisci l'isbn per la ristituzione:");
                    String r = buf.readLine();
                    for (Prestiti pr : prestito) {
                        if (pr.getCodiceLibro().equals(r)) {
                            prestito.remove(pr);
                            System.out.println("RESTITUITO");
                            break;  //elimina solo 1 libro 
                        }
                    }
                    break;

                case "7": //serializzazione
                    FileOutputStream fo;
                    fo = new FileOutputStream("biblioteca.bin");
                    ObjectOutputStream outObj = new ObjectOutputStream(fo);
                    outObj.writeObject(libro);
                    outObj.writeObject(soci);
                    outObj.writeObject(prestito);
                    System.out.println("Salvataggio esaguito");
                    break;

                case "8": //deserializzazione
                    try {
                        FileInputStream f = new FileInputStream("biblioteca.bin");
                        ObjectInputStream inObj = new ObjectInputStream(f);
                        libro = (HashMap<String, Libri>) inObj.readObject();
                        soci = (TreeMap<String, Soci>) inObj.readObject();
                        prestito = (ArrayList<Prestiti>) inObj.readObject();
                        System.out.println(prestito);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    break;

                case "9":
                    return;

            }

        }

    }

}
