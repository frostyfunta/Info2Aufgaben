package S22_b4;

import java.util.Comparator;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aufgabe16d {
    public static void main(String[] args) {
        Random rand = new Random();
        IntSupplier supply = () -> {
            int value = rand.nextInt();
            return value;
        };

        IntStream streamInt = IntStream.generate(supply);


        Stream<Integer> mainStream = streamInt.limit(10)
                .boxed()
                .sorted(Comparator.reverseOrder());
        mainStream.forEach(n -> System.out.println(n));
    }
}
