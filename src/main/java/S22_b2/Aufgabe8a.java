package S22_b2;


import java.lang.StringBuilder;

public class Aufgabe8a {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Es wurden keine Kommandozeilenparameter übergeben");
        }
        StringBuilder recombinedArguments = new StringBuilder();
        recombinedArguments.insert(0, args[0]);
        for (int a = 1; a < args.length; a++) {
            for (int i = 0; i < recombinedArguments.length(); i++) {
                if (recombinedArguments.charAt(i) == 'e') {
                    recombinedArguments.insert(i, args[a]);
                    break;
                }
            }

        }

        System.out.println(recombinedArguments.reverse().toString());

    }
}
