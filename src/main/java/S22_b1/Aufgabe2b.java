package S22_b1;

public class Aufgabe2b {
    public static void main(String[] args) {
        int counter = 0;
        if (args.length == 0) {
            System.out.println("Keine Kommandozeilenparameter");
        } else {
            for(int i = 0; i < args.length; i++){
                counter += args[i].length();
            }
            System.out.println("Es wurden insgesamt " + counter + " Zeichen als Kommandozeilenparameter übergeben");
        }
    }
}
