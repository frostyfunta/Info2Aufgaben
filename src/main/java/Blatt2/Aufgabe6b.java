package Blatt2;

import java.lang.Integer;
import java.util.Random;

public class Aufgabe6b {

    public static void main(String[] args) {
        Random rand = new Random();
        Integer x = rand.nextInt();
        System.out.println("dezimal: " + x);
        System.out.println("binär: " + x.toBinaryString(x));
        System.out.println("oktal: " + x.toOctalString(x));
        System.out.println("hex: " + x.toHexString(x));
        System.out.println("how many 1's: " + x.bitCount(x));
        System.out.println("# of leading 0's: " + x.numberOfLeadingZeros(x));
        System.out.println("reverse: " + x.reverse(x));

    }
}
