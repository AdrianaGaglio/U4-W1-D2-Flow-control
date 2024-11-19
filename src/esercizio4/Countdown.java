package esercizio4;

import java.util.Scanner; // Importa la classe Scanner per l'input da tastiera

// Classe che implementa un semplice conto alla rovescia
public class Countdown {

    // Metodo statico che esegue il conto alla rovescia
    public static void countdown() {
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input dell'utente

        // Richiede all'utente di inserire un numero di partenza per il countdown
        System.out.println("Inserisci un numero:");
        int num = scanner.nextInt(); // Legge il numero intero inserito dall'utente

        // Ciclo for per il conto alla rovescia
        for (int i = num; i >= 0; i--) { // Parte dal numero inserito e decrementa fino a 0
            System.out.println(i); // Stampa il valore corrente
        }

        scanner.close(); // Chiude lo scanner per liberare le risorse
    }

    // Metodo principale che esegue il programma
    public static void main(String[] args) {
        countdown(); // Chiama il metodo countdown
    }
}
