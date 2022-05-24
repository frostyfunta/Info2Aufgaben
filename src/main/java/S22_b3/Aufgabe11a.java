package S22_b3;

import java.util.ArrayList;
import java.util.Iterator;

public class Aufgabe11a {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Mein");
        myList.add("kleiner");
        myList.add("grüner");

        for(int i = 0; i < args.length; i++){
            //Kommandozeilenparameter in umgekehrter Reihenfolge zu myList hinzufügen
            myList.add(3 , args[i]);
        }

        if(!myList.contains("Hollari")) myList.add("Hollari");
        if(!myList.contains("hollari")) myList.add("hollari");
        if(!myList.contains("hollaro")) myList.add("hollaro");

        for(int i = 0; i < myList.size(); i++){
            if(myList.get(i).contains(",")) myList.remove(i);
        }

        Iterator<String> myIterator = myList.listIterator(myList.size() - 5);

        while(myIterator.hasNext()){
            System.out.print(myIterator.next());
            if(myIterator.hasNext()) System.out.print(",");
        }
    }

}
