package esercizio1;

// Classe che contiene il metodo per determinare se un anno è bisestile
public class AnnoBisestile {

    // Metodo statico per verificare se un anno è bisestile
    public static boolean annoBisestile(int anno) {

        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);

    }

    // Metodo principale che esegue il programma
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione di due anni di esempio
        int anno1 = 2024;
        int anno2 = 2025;

        // Stampa il risultato per il primo anno
        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        // Stampa il risultato per il secondo anno
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
    }
}
