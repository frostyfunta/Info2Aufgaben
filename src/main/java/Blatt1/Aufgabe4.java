package Blatt1;

import java.util.Random;

public class Aufgabe4 {

    public static void main(String[] args) {
       int x = myRandom();
        System.out.println("mySum(" + x + ") = " + mySum(x));
        System.out.println("myGt(" + x + ") = "  + myGt(x));
    }

    public static int myRandom(){
        Random rnd = new Random();
        int x = rnd.nextInt(10000) + 1;
        return x;
    }

    public static int mySum(int x){
        int i = 1;
        int sum = 0;
        while(i <= x){
            sum = sum + i;
            i++;
            i++;
        }
        return sum;
    }

    public static int myGt(int x){
        int i = 1, teiler = 0;
        while ((i * 2) <= x){
            if((x % i) == 0){
                teiler = i;
            }
            ++i;
        }
        return teiler;
    }

}
