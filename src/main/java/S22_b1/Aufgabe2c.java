package S22_b1;

public class Aufgabe2c {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("es wurde nicht genau 1 Parameter übergeben");
        }else {
            String [] result = args[0].split(",");
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }
    }
}
