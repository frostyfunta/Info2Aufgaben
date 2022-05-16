package S22_b2;

public class Aufgabe8b {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("keine Kommandozeilenparameter übergeben!");
            return;
        }

        String combinedArguments = String.join(";", args);
        System.out.println(combinedArguments);

        if (!combinedArguments.contains(".")) {
            System.out.println("es ist kein . in den in der Variable combinedArguments!");
        } else {
            String suffix = combinedArguments.substring(combinedArguments.indexOf("."));
            System.out.println(suffix.toUpperCase());
        }
    }
}
