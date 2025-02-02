package CoreJava;

// LinkedListExample.java

//import java.util.LinkedList;
import java.util.*;

public class P042_LinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Remove an element from the LinkedList
        linkedList.remove("Banana");

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);

        // Access an element in the LinkedList
        String element = linkedList.get(0);
        System.out.println("First element: " + element);
    }
}
