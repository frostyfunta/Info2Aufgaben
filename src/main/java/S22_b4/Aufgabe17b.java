package S22_b4;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aufgabe17b {
    public static void main(String[] args) {
        ArrayList<Task> arList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arList.add(new Task("Testaufgabe " + (i + 1), rand.nextInt(10) + 1));
        }
        arList.forEach(n -> System.out.println(n.getPriority() + n.getDescription()));

        //Aufgabe 17c
        Stream<Task> taskStream = arList.stream();

        IntStream priorityStream = taskStream.mapToInt(x -> x.getPriority());

        System.out.println("the highest priority is: " + priorityStream.min().getAsInt());
    }
}
