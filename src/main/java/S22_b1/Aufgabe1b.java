package S22_b1;

public class Aufgabe1b {
    public static void main(String[] args) {
        int z = 0, i;
        System.out.println("Aufgabe 1b: ");
        for (i = 0; i < 500; i++) {
            System.out.print("j");
            z++;
            if (z == 200) {
                z = 0;
                System.out.print("\n");
            }
        }
    }


}
