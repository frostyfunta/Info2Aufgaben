package Blatt2;

import java.util.Random;

public class Aufgabe6c {

    public static void main(String[] args) {
        Random rand = new Random();
        double a = rand.nextDouble();
        int n = rand.nextInt(1000);
        double x = Math.pow(a, n);
        System.out.println("x :" + x);
        System.out.println("is infinite : " + Double.isInfinite(x));
        System.out.println("is NaN: " + Double.isNaN(x));

        Double d = x;
        System.out.println("d as double: " +  d.doubleValue());
        Double e = 1 / x;
        System.out.println("e as int: " + e.intValue());

    }
}
