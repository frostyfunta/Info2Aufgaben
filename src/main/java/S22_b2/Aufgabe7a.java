package S22_b2;

import java.util.Optional;
import java.util.Random;

public class Aufgabe7a {
    public static void main(String[] args) {
        /*Random random = new Random();
        int randomInt =  random.nextInt(256 + 1);
        Character x = (char) randomInt;
        System.out.println("random char is: " + x);
        System.out.println(Character.getName(x));
        System.out.println(Character.getType(x));

         */

        for(int i = 0; i < 256; i++){
            Character x = (char) i;
            System.out.println("int: " + i + " char: " + x + "\n Name: " + Character.getName(x));
        }
    }
}
