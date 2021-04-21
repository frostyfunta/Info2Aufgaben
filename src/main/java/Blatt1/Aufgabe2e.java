package Blatt1;

public class Aufgabe2e {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000000; i++){
            double x = Math.random();
            if (x > 0.99){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
