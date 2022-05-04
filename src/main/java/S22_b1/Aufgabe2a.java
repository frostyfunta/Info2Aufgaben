package S22_b1;

public class Aufgabe2a {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Keine Kommandozeilenparameter");
        } else {
            int counter = 0;
            for (int i = 0; i < args[0].length(); i++) {
                if (args[0].charAt(i) == 'e') {
                    counter++;
                }
            }
            System.out.println("The amount of 'e' in the first parameter is: " + counter);
        }
    }
}
