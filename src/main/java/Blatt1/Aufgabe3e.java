package Blatt1;

public class Aufgabe3e {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Fehler");
        } else {
            String fiveDigit = "\\d{5}";
            if (args[0].matches(fiveDigit) == true){
                System.out.println("Die eingabe besteht aus 5 Ziffern");
            } else{
                System.out.println("eingabefehler!");
            }
        }
    }
}
