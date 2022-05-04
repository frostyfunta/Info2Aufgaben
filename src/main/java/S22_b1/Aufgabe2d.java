package S22_b1;

public class Aufgabe2d {
    public static void main(String[] args) {
        String all = String.join("", args);
        System.out.println("This is input string: " + all);
        String newAll = all.replaceAll("[^0-9]", "_");
        System.out.println("this is the final string: " + newAll);
    }
}
