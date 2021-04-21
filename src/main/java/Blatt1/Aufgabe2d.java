package Blatt1;

public class Aufgabe2d {

    public static void main(String[] args) {
          int counter = 1;
          double x = Math.random();
          while (x >= 0.1 && x <= 0.9){
              x = Math.random();
              ++counter;
          }
        System.out.println(counter);
    }


}
