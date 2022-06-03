package S22_b4;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Aufgabe16b {
    public static void main(String[] args) {

        Random rand = new Random();
        DoubleStream stream = rand.doubles(100, 0, 10);
        double result = stream.filter(num -> num > 5)
                .sum();
        System.out.println(result);
    }
    /*man kann die .sum() methode nicht im selben stream wie die .reduce() Methode verwendet werden,
     da sie beides terminale methoden sind und keinen stream zurückgeben, sondern andere Datentypen wie z.B. int

     */
}
