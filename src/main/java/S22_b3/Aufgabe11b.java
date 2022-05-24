package S22_b3;

import java.util.ArrayList;
import java.util.HashSet;

public class Aufgabe11b {
    public static void main(String[] args) {
        HashSet<Character> mySet = new HashSet<>();

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                mySet.add(args[i].charAt(j));
            }
        }

        System.out.println(mySet);

        for (Character c : mySet){
            System.out.println(c);
            StringBuilder strbuilder = new StringBuilder();
            for(int i = 0; i < args.length; i ++){
                if(args[i].contains(c.toString())){
                    strbuilder.append(args[i]);
                    strbuilder.append(",");
                }
            }
            strbuilder.setLength(strbuilder.length() - 1);
            System.out.println(strbuilder);
        }

    }
}
