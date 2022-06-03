package S22_b3;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.DoubleSupplier;

public class Aufgabe12a {
    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<>();


        DoubleSupplier mySupplier = () -> {
            double doubleVal = Math.random();
            return doubleVal;
        };


        Random rand = new Random();
        int n = rand.nextInt(1000) + 1;
        for (int i = 0; i < n; i++) {
            myList.add(mySupplier.getAsDouble());
            if (Math.random() < 0.01) {
                mySupplier = () -> {
                    return 2;
                };
            }
        }


        myList.removeIf(i -> i < 1);

        myList.forEach((m) -> System.out.println(m));

        System.out.println("number of generated numbers (n) : " + n);
        System.out.println("remaining numbers after removing x < 1: " + myList.size());

    }
}
