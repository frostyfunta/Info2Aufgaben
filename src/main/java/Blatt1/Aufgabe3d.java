package Blatt1;

public class Aufgabe3d {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Fehler");
        } else {
            if (args[0].compareTo(args[1]) == 0) {
                System.out.println("Die beiden Kommandozeilenparameter sind gleich!");
            } else {
                System.out.println("Die beiden Kommandozeilenparameter sind nicht gleich!");
            }
        }
    }
}
