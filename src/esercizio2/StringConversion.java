package esercizio2;

import java.util.Scanner;

public class StringConversion {

    public static String stringConversion() {
        Scanner scanner = new Scanner(System.in);

        // Richiede un numero intero all'utente
        System.out.print("Inserisci un numero:");
        int num = scanner.nextInt();
        String text = "";

        switch (num) {
            case 0:
                text = "zero";
                break;
            case 1:
                text = "uno";
                break;
            case 2:
                text = "due";
                break;
            case 3:
                text = "tre";
                break;
            default:
                text = "Errore: numero non valido!";
                break;
        }
        scanner.close();
        return text;
    }

    public static void main(String[] args) {
        System.out.println(stringConversion());
    }
}
