package esercizio1;

// Classe per determinare se la lunghezza di una stringa è pari o dispari
public class StringaPariDispari {

    // Metodo statico che verifica se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String str) {
        // Restituisce true se la lunghezza della stringa è pari (divisibile per 2), altrimenti false
        return str.length() % 2 == 0; // Usa l'operatore modulo per verificare la divisibilità per 2
    }

    // Metodo principale che esegue il programma
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione di due stringhe di esempio
        String stringa1 = "Lorem ipsum dolor sit amet"; // Stringa con 26 caratteri (pari)
        String stringa2 = "Consectetur adipiscing elit"; // Stringa con 27 caratteri (dispari)

        // Stampa il risultato per la prima stringa
        System.out.println("La stringa \"" + stringa1 + "\" ha una lunghezza pari? " + stringaPariDispari(stringa1));
        // Stampa il risultato per la seconda stringa
        System.out.println("La stringa \"" + stringa2 + "\" ha una lunghezza pari? " + stringaPariDispari(stringa2));
    }
}
