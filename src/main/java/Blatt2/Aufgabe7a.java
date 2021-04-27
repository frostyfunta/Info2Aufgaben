package Blatt2;

public class Aufgabe7a {

    public static void main(String[] args) {
        String object = new String();
        String[] list;
        int i;                  //initialize String object, list and i for loops
        for (i = 0; i < args.length; i++) {
            System.out.println("Argument #" + i + ": " + args[i]);
            object = object + args[i];          //add next program argument to String object
        }
        list = object.split("-");
        for (i = 0; i < list.length; i++){
            System.out.println("Listenobjekt #" + i + ": " + list[i]);
        }

    }
}
