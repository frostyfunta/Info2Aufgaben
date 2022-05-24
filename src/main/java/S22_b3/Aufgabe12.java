package S22_b3;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.DoubleSupplier;

public class Aufgabe12 {
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
            if (Math.random() < 0.1) {
                mySupplier = () -> {
                    return 2;
                };
            }
        }



    }
}
