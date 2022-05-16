package S22_b2;

import java.util.Random;

public class Aufgabe7b {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer x = rand.nextInt();
        System.out.println("dezimal: " + x);
        System.out.println("binär: " + Integer.toBinaryString(x));
        System.out.println("oktal: " + Integer.toOctalString(x));
        System.out.println("hexadezimal: " + Integer.toHexString(x));
        System.out.println("signum() methode: " + Integer.signum(x));
        System.out.println("anzahl der Bits: " + Integer.bitCount(x));
    }
}
