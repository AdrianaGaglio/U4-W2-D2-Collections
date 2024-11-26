package it.epicode.esercizio_2;

import java.util.*;

public class Main {

    // Questo metodo genera una lista di numeri casuali, la ordina e la restituisce
    public static List<Integer> listaOrdinata(int num) {
        List<Integer> numeri = new LinkedList<Integer>(); // Creiamo una lista vuota
        Random random = new Random(); // Serve per generare numeri casuali
        for (int i = 0; i < num; i++) {
            numeri.add(random.nextInt(100)); // Aggiungiamo un numero casuale tra 0 e 99
        }

        Collections.sort(numeri); // Ordiniamo la lista in ordine crescente
        return numeri; // Restituiamo la lista ordinata
    }

    // Questo metodo crea una nuova lista che contiene gli elementi della prima lista
    // seguiti dagli stessi elementi ma in ordine inverso
    public static List<Integer> secondaLista(List<Integer> lista) {
        List<Integer> secondaLista = new ArrayList<Integer>(); // Nuova lista vuota
        for (int numero : lista) {
            secondaLista.add(numero); // Aggiungiamo tutti i numeri della lista originale
        }
        for (int i = lista.size() - 1; i >= 0; i--) {
            secondaLista.add(lista.get(i)); // Aggiungiamo i numeri in ordine inverso
        }

        return secondaLista; // Restituiamo la nuova lista
    }

    // Questo metodo stampa i numeri pari o dispari dalla lista
    public static void pariDispari(List<Integer> lista, boolean isEven) {
        for (int numero : lista) {
            // Se il parametro isEven è vero, stampiamo i numeri pari
            if (isEven && numero % 2 == 0) {
                System.out.println(numero);
            }
            // Altrimenti, stampiamo i numeri dispari
            else if (!isEven && numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente quanti numeri vuole generare
        System.out.println("Quanti numeri vuoi?");
        int num = scanner.nextInt(); // Leggiamo il numero inserito dall'utente
        scanner.nextLine(); // Puliamo la riga dopo aver letto il numero

        // Generiamo una lista di numeri casuali ordinati
        List<Integer> lista = listaOrdinata(num);

        // Stampiamo i numeri ordinati
        System.out.println("Lista numeri random ordinati:");
        for (int numero : lista) {
            System.out.println(numero);
        }

        // Creiamo una nuova lista con i numeri ordinati e in ordine inverso e la stampiamo
        System.out.println("Lista numeri ordinati e non ordinati:");
        for (int numero : secondaLista(lista)) {
            System.out.println(numero);
        }

        // Stampiamo i numeri pari della lista
        System.out.println("Stampo numeri pari:");
        pariDispari(lista, true);

        // Stampiamo i numeri dispari della lista
        System.out.println("Stampo numeri dispari:");
        pariDispari(lista, false);
    }
}

/*
SPIEGAZIONE DEI PUNTI PRINCIPALI:
listaOrdinata => Genera una lista di numeri casuali utilizzando Random.

Ordina i numeri in ordine crescente usando Collections.sort.

secondaLista => Duplica la lista originale e aggiunge gli stessi elementi in ordine inverso alla fine.

pariDispari => Stampa tutti i numeri pari o dispari dalla lista in base al valore di isEven.

Esecuzione:
- Legge l'input dell'utente per decidere quanti numeri generare.
- Stampa i numeri generati in ordine crescente.
- Crea una lista che combina i numeri ordinati e la loro versione inversa.
- Stampa i numeri pari e dispari separatamente.

Questo approccio rende il codice più facile da seguire anche per chi non ha familiarità con Java.*/
