package S22_b3;

import java.util.HashSet;

public class Aufgabe11c {
    public static void main(String[] args) {
        HashSet<Character> mySet = new HashSet<>();

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                mySet.add(args[i].charAt(j));
            }
        }
        //bis hierhin aus 11b übernommen
        Object[] charArray = mySet.toArray();
        for(int i = 0; i < charArray.length; i++){
            System.out.println(charArray[i]);
        }
    }
}
