package esercizio1;

public class StringaPariDispari {

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0; // torna true o false a seconda dell'esito della comparazione
    }

    public static void main(String[] args) {
        String stringa1 = "Lorem ipsum dolor sit amet"; // 26 caratteri
        String stringa2 = "Consectetur adipiscing elit"; // 27 caratteri
        System.out.println("La stringa \"" + stringa1 + "\" ha una lunghezza pari? " + stringaPariDispari(stringa1));
        System.out.println("La stringa \"" + stringa2 + "\" ha una lunghezza pari? " + stringaPariDispari(stringa2));
    }
}
