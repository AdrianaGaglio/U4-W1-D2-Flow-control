package esercizio4;

import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Countdown {

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int num = scanner.nextInt();

        for(int i = num; i >= 0; i--) {

            System.out.println(i);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        countdown();
    }
}
