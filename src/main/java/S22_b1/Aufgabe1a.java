package S22_b1;

import java.util.Random;

public class Aufgabe1a {
    //Aufgabe1 a: erstellt eine zufällige ganze zahl n (zwischen 0 und 100) und gibt alle Primzahlen bis n aus

    public static void main(String[] args) {
        int n, i;
        Random rand = new Random();
        n = rand.nextInt(101);
        System.out.println("Aufgabe 1a: ");
        for (i = 2; i < n; i++) {
            int k, f = 0;
            for (k = 2; k <= i / 2; k++) {
                if (i % k == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(i);
            }
        }


    }
}