package CoreJava;

// ArrayList.java

//import java.util.ArrayList;
import java.util.*;

public class P041_ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Remove an element from the ArrayList
        arrayList.remove("Banana");

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + arrayList);

        // Access an element in the ArrayList
        String element = arrayList.get(0);
        System.out.println("First element: " + element);
    }
}
