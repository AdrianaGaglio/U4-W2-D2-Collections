package it.epicode.esercizio_3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private HashMap<String, String> contatti; // Questa è la mappa che tiene i contatti. "Nome" è la chiave, "Telefono" è il valore.

    // Costruttore: inizializza la rubrica (una mappa vuota)
    public Rubrica() {
        this.contatti = new HashMap<>();
    }

    // Metodo per aggiungere un contatto alla rubrica
    public void aggiungiContatto(String nome, String telefono) {
        this.contatti.put(nome, telefono); // Aggiungo il nome e il numero di telefono alla mappa
    }

    // Metodo per cancellare un contatto dato il nome
    public void cancellaContatto(String nome) {
        String cancellato = this.contatti.remove(nome); // Rimuovo il contatto dalla mappa usando il nome come chiave
        if (cancellato != null) {
            // Se il contatto è stato trovato e rimosso, stampo un messaggio di conferma
            System.out.println("Contatto " + cancellato + " rimosso con successo");
        } else {
            // Se il contatto non è stato trovato, avviso l'utente
            System.out.println(nome + " non trovato");
        }
    }

    // Metodo per cercare un contatto dato un numero di telefono
    public Map.Entry<String, String> ricercaPerNumero(String telefono) {
        for (Map.Entry<String, String> contatto : this.contatti.entrySet()) {
            // Controllo se il valore (numero di telefono) corrisponde a quello cercato
            if (contatto.getValue().equals(telefono)) {
                System.out.println("Contatto trovato per numero => Nome: " + contatto.getKey() + ", Telefono: " + contatto.getValue());
                return contatto; // Restituisco il contatto trovato
            }
        }
        // Se non trovo nulla, restituisco null
        return null;
    }

    // Metodo per cercare un contatto dato un nome
    public String ricercaPerNome(String nome) {
        // Recupero il numero di telefono associato al nome
        System.out.println("Contatto trovato per nome => Nome: " + nome + ", Telefono: " + this.contatti.get(nome));
        return this.contatti.get(nome); // Restituisco il numero di telefono
    }

    // Metodo per stampare tutti i contatti presenti nella rubrica
    public void stampaContatti() {
        System.out.println("Contatti in rubrica:");
        for (Map.Entry<String, String> contatto : this.contatti.entrySet()) {
            // Stampo ogni contatto con nome e numero di telefono
            System.out.println("Nome: " + contatto.getKey() + ", Telefono: " + contatto.getValue());
        }
    }
}

/*
SPIEGAZIONE DEI METODI:
aggiungiContatto => Aggiunge un nuovo contatto alla rubrica.
                    Utilizza put per associare un nome (chiave) a un numero di telefono (valore).

cancellaContatto => Rimuove un contatto specifico dalla rubrica in base al nome.
                    Controlla se il contatto esiste prima di rimuoverlo e stampa un messaggio appropriato.

ricercaPerNumero => Cerca nella rubrica un contatto dato un numero di telefono.
                    Scorre tutti i contatti usando un ciclo for e restituisce il contatto trovato oppure null se non lo trova.

ricercaPerNome => Cerca il numero di telefono associato a un nome specifico.
                  Utilizza il metodo get della mappa per recuperare il valore (telefono) usando la chiave (nome).

stampaContatti => Stampa tutti i contatti presenti nella rubrica con nome e numero.

Usa un ciclo for per scorrere la mappa e stampare ogni coppia chiave-valore.
*/
