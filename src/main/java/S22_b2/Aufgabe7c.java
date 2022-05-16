package S22_b2;

import java.util.Random;

public class Aufgabe7c {
    public static void main(String[] args) {
        Random random = new Random();
        double a = Math.random();
        int e = random.nextInt(100);
        double x = a * Math.pow(10, e);

        System.out.println(x);
        System.out.println("is 1/x finite?: " + Double.isFinite(1 / x));

        Double d = Double.MIN_VALUE;
        System.out.println("value of d:" + d);

        Double f = 1 / d;
        System.out.println("value of f: " + f);

        System.out.println("f as an int: " + f.intValue());
    }
}
