package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class SplitChar {

    public static void splitChar() {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while(!text.equals(":q")) {

            System.out.print("Inserisci una stringa (':q' per uscire): ");
            text = scanner.nextLine();

            if (!text.equals(":q")) {
                String caratteri = String.join(", ", text.split(""));
                System.out.println(caratteri);
            } else {
                System.out.println("Uscita dal programma...");
            }
        }
        scanner.close();

    }

    public static void main(String[] args) {
        splitChar();
    }
}
