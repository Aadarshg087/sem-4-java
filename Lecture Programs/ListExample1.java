import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<String>();

        // adding elements
        letters.add("A");
        letters.add("C");
        letters.add("D");

        // lets insert B between A and C
        letters.add(1, "B");
        System.out.println(letters);

        List<String> list = new ArrayList<String>();
        list.add("E");
        list.add("H");

        System.out.println(list);

        // get example
        String e = letters.get(4);
        System.out.println("Letters at the 5th place: " + e);
        // templist is empty?
        System.out.println("tempList is empty: " + tempList.isEmpty());

        // index of example
        System.out.println("First index of D= " + letters.indexOf("D"));
        System.out.println("Last index of D = " + letters.lastIndexOf("D"));

        // remove examples
        System.out.println(letters);
        String removed = letters.remove(3);
        System.out.println("After removing "+removed +"letters");

        // remove first occurence of H
        
        

    }
}
