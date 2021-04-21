package Blatt1;

public class Aufgabe3b {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Keine Kommandozeilenparameter");
        }else{

            System.out.println(args[0].charAt(args[0].length() - 1));

        }
    }
}
