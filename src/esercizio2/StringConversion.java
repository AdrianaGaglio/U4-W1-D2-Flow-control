package esercizio2;

import java.util.Scanner; // Importa la classe Scanner per l'input da tastiera

// Classe per convertire un numero intero in una stringa corrispondente
public class StringConversion {

    // Metodo statico per convertire un numero in una stringa
    public static String stringConversion() {
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input dell'utente

        // Richiede un numero intero all'utente
        System.out.print("Inserisci un numero: ");
        int num = scanner.nextInt(); // Legge il numero intero inserito dall'utente
        String text = ""; // Inizializza una variabile per contenere la stringa risultante

        // Determina la stringa corrispondente al numero usando uno switch
        switch (num) {
            case 0: // Se il numero è 0
                text = "zero";
                break;
            case 1: // Se il numero è 1
                text = "uno";
                break;
            case 2: // Se il numero è 2
                text = "due";
                break;
            case 3: // Se il numero è 3
                text = "tre";
                break;
            default: // Se il numero non è tra 0 e 3
                text = "Errore: numero non valido!";
                break;
        }

        scanner.close(); // Chiude lo scanner per liberare le risorse
        return text; // Restituisce la stringa corrispondente
    }

    // Metodo principale che esegue il programma
    public static void main(String[] args) {
        // Chiama il metodo stringConversion e stampa il risultato
        System.out.println(stringConversion());
    }
}
