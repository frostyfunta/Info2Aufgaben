package S22_b1;

import java.util.Random;

public class Aufgabe1d {
    public static void main(String[] args) {
        int i;
        Random rand = new Random();

        for (i = 0; i < 100; i++) {
            if (rand.nextBoolean()) {
                System.out.println((rand.nextInt(1000) + 1) * 4);
            }

        }
    }


}
