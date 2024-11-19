package esercizio3;

import java.util.Scanner; // Importa la classe Scanner per l'input da tastiera

// Classe che contiene il metodo per separare i caratteri di una stringa
public class SplitChar {

    // Metodo statico che esegue il processo di separazione dei caratteri
    public static void splitChar() {
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input dell'utente
        String text = ""; // Inizializza una variabile per memorizzare la stringa inserita

        // Ciclo che continua finché l'utente non inserisce ":q"
        while (!text.equals(":q")) {
            // Chiede all'utente di inserire una stringa o uscire digitando ":q"
            System.out.print("Inserisci una stringa (':q' per uscire): ");
            text = scanner.nextLine(); // Legge la stringa inserita

            // Controlla se la stringa inserita non è ":q"
            if (!text.equals(":q")) {
                // Divide la stringa in caratteri singoli e li unisce con una virgola
                String caratteri = String.join(", ", text.split(""));
                System.out.println(caratteri); // Stampa i caratteri separati da una virgola
            } else {
                // Messaggio di uscita quando l'utente inserisce ":q"
                System.out.println("Uscita dal programma...");
            }
        }
        scanner.close(); // Chiude lo scanner per liberare le risorse
    }

    // Metodo principale che esegue il programma
    public static void main(String[] args) {
        splitChar(); // Chiama il metodo splitChar
    }
}
