package S22_b4;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Aufgabe16a {
    public static void main(String[] args) {
        Random rand = new Random();
        DoubleStream stream = rand.doubles(100, 0, 10);
        double result = stream.filter(num -> num > 5)
                .reduce(1, (double a, double b) -> a * b);
        System.out.println(result);

    }
}

