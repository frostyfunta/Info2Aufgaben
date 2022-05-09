package S22_b1;

import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        int x = myRandom();
        System.out.println("random  number x is: " + x);
        if (isPrime(x)){
            System.out.println("x is prime");
        } else {
            System.out.println("next square number is: " + nextSquareNumber(x));
        }
    }

    private static int nextSquareNumber(int eingabe) {
        if (eingabe < 0) {
            System.out.println("die eingabe ist nicht positiv");
        } else {
            int i = (int) Math.sqrt(eingabe);
            if (i * i == eingabe) {
                return (eingabe);
            } else {
                ++i;
                return (i * i);
            }
        }
        return 0;
    }

    private static int myRandom() {
        Random rand = new Random();
        return rand.nextInt(10000) + 1;
    }

    private static boolean isPrime(int eingabe) {
        for (int i = 2; i < (int) Math.sqrt(eingabe); i++) {
            if (eingabe % i == 0) {
                return false;
            }
        }
        return true;
    }
}

