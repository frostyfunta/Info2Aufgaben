package Blatt2;

import java.util.Random;
import java.lang.Character;

public class Aufgabe6a {

    public static void main(String[] args) {
        Random rand = new Random();
        char character = (char) rand.nextInt(256);
        System.out.println("Random generated int is: " + (int) character);
        System.out.println("Random generated char is: " + character);

        Character x = character;
        if(x.isLowerCase(character) == true){
            System.out.println("Zugehöriger Großbuchstabe: " + x.toUpperCase(character));
        } else {
            System.out.println("Der generierte char ist nicht lowerCase!");
        }

    }

}
