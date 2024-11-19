package esercizio1;

// Classe che contiene il metodo per determinare se un anno è bisestile
public class AnnoBisestile {

    // Metodo statico per verificare se un anno è bisestile
    public static boolean annoBisestile(int anno) {
        // Un anno è bisestile se è divisibile per 4
        if (anno % 4 == 0) {
            // Se l'anno è divisibile per 100, è bisestile solo se è divisibile anche per 400
            if (anno % 100 == 0) {
                return anno % 400 == 0; // Restituisce true se divisibile per 400, altrimenti false
            }
            return true; // Se non è divisibile per 100 ma lo è per 4, è bisestile
        }
        return false; // Se non è divisibile per 4, non è bisestile
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
