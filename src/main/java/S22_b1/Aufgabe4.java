package S22_b1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Aufgabe4 {
    public static void main(String[] args) {
        //Wenn keine Eingabeparameter übergeben wurden
        if(args.length == 0) System.err.println("Fehler");

        //Wenn Eingabeparameter übergeben wurden, dann erstelle Kommagetrennte liste
        StringJoiner joiner = new StringJoiner(",");
        for(int i = 0; i < args.length; i++){
            joiner.add(appendTXT(removeAllVowels(args[i])));
        }
        System.out.println(joiner.toString());
    }

    private static String removeAllVowels(String eingabe){

        String ausgabe = "";
        for (int i = 0; i < eingabe.length(); i++){
            if(!isVowel(eingabe.charAt(i))){
                ausgabe += eingabe.charAt(i);
            }
        }
        return ausgabe;
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static String appendTXT(String eingabe){
        if(!eingabe.endsWith("TXT")) {
            eingabe = eingabe + "TXT";
        }
        return eingabe;
    }
}


