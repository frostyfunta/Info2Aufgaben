package Blatt1;

public class Aufgabe3c {

    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("Fehler");
        }else{
            int i = 0;
            while(i < args[0].length()){
                if (args[0].charAt(i) == 'x'){
                    System.out.println(i);
                    break;
                }
                i++;
            }
        }
    }
}
