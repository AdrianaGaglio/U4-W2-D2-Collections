package it.epicode.esercizio_3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.aggiungiContatto("Mario Rossi", "3333333333");
        rubrica.aggiungiContatto("Maria Bianchi", "4444444444");
        rubrica.aggiungiContatto("Giovanni Bianchi", "5555555555");
        rubrica.aggiungiContatto("Giovanna Rossi", "6666666666");

        rubrica.ricercaPerNumero("3333333333");
        rubrica.ricercaPerNome("Giovanni Bianchi");

        rubrica.stampaContatti();

        rubrica.cancellaContatto("Giovanni Bianchi");

        rubrica.stampaContatti();
    }
}
