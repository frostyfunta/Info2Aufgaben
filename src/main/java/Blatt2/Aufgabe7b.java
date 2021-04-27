package Blatt2;

public class Aufgabe7b {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            s.insert(0, args[i]);
            System.out.println(s);
        }
        s.reverse();
        System.out.println("reversed: " + s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                s.setCharAt(i, '_');

            }
        }
        System.out.println("dash turned to underscore: " + s);
    }
}
