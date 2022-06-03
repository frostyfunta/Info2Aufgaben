package S22_b4;

import java.util.Random;
import java.util.stream.IntStream;

public class Aufgabe16c {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(4000) + 1;
        System.out.println("Die Zufallszahl ist: " + n);

        //summe aller zahlen von 1 - n
        IntStream stream = IntStream.range(1, n + 1);
        int sum = stream.sum();
        System.out.println("Das Ergebnis der Summe aller Zahlen von 1 bis " + n + " ist: " + sum);

        //gauss formel
        int formula = (n * (n + 1))/2;
        System.out.println("Das Ergebnis der Gauß-Formel ist: " + formula);

        if (formula == sum) System.out.println("Die Ergebnisse sind gleich");
        else System.out.println("Die Ergebnisse sind nicht gleich");
    }

}
