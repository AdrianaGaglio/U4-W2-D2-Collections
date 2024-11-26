package it.epicode.esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Chiedo all'utente quante parole vuole inserire
        System.out.println("Quante parole vuoi inserire?");
        int num = scanner.nextInt();
        scanner.nextLine(); // Pulisco la riga dopo aver letto il numero

        // Creo un array (contenitore) della lunghezza specificata dall'utente
        String[] parole = new String[num];

        // Riempio l'array chiedendo all'utente di inserire una parola alla volta
        for (int i = 0; i < num; i++) {
            int pos = i + 1; // Calcolo il numero della parola per visualizzarlo
            System.out.println("Inserisci parola " + pos + ":");
            parole[i] = scanner.nextLine(); // Salvo la parola nell'array
        }

        scanner.close(); // Chiudo lo scanner per liberare le risorse

        // Creo tre set per lavorare con le parole:
        // 1. "duplicate" per le parole che appaiono più volte
        // 2. "uniche" per le parole che appaiono solo una volta
        // 3. "paroleInserite" per tenere traccia di tutte le parole viste finora
        Set<String> duplicate = new HashSet<String>();
        Set<String> uniche = new HashSet<String>();
        Set<String> paroleInserite = new HashSet<String>();

        // Ciclo su ogni parola inserita nell'array
        for (String parola : parole) {
            // Se la parola non è mai stata vista prima, la aggiungo a "uniche"
            if (paroleInserite.add(parola)) {
                uniche.add(parola);
            } else {
                // Altrimenti, la aggiungo a "duplicate" perché è già stata vista
                duplicate.add(parola);
            }
        }

        // Rimuovo dalla lista delle "uniche" tutte le parole che sono duplicate
        uniche.removeIf(duplicate::contains);

        // Stampo tutte le parole duplicate
        System.out.println("Parole duplicate:");
        for (String parola : duplicate) {
            System.out.println(parola);
        }

        // Stampo quante sono le parole uniche
        System.out.println("Le parole uniche sono: " + uniche.size());

        // Stampo tutte le parole uniche
        System.out.println("Parole uniche:");
        for (String parola : uniche) {
            System.out.println(parola);
        }

    }
}


/*
SPIEGAZIONE DEI PUNTI PRINCIPALI:
=> Array: L'array viene usato per salvare le parole inserite dall'utente.
=> Set: I Set sono come dei contenitori speciali che non permettono duplicati.
paroleInserite => tiene tutte le parole inserite.
uniche => tiene solo le parole che appaiono una volta.
duplicate => tiene solo le parole che appaiono più di una volta.

Logica: Controllo se una parola è nuova o già vista e la metto nel contenitore giusto (uniche o duplicate).

Output: Alla fine, stampo le parole duplicate, il numero di parole uniche e poi tutte le parole uniche.
*/
