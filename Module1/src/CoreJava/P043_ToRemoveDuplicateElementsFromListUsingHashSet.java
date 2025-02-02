package CoreJava;


import java.util.*;

public class P043_ToRemoveDuplicateElementsFromListUsingHashSet {
    public static void main(String[] args) {
        // Create a list with duplicate elements
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));

        System.out.println("Original List: " + list);

        // Convert the list to a set to remove duplicates
        Set<String> set = new HashSet<>(list);

        System.out.println("Set: " + set);

        // Convert the set back to a list
        List<String> uniqueList = new ArrayList<>(set);

        System.out.println("List with unique elements: " + uniqueList);
    }
}
