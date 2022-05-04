package S22_b1;

import java.util.Random;

public class Aufgabe1c {
    public static void main(String[] args) {
        int i, counter = 0;
        float x;
        Random rand = new Random();
        for (i = 0; i < 1000; i++) {
            x = rand.nextFloat();
            if (x > 0.4 && x < 0.6) {
                counter++;
            }
        }

        System.out.println("The amount of random generated numbers between 0.4 and 0.6 are: " + counter);
    }

}
