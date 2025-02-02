package CoreJava;


// HashMapExample.java

import java.util.HashMap;
import java.util.Map;

public class P044_CreateHashMapToStoreAndRetriveKeyValuePairs {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> keyValuePairs = new HashMap<>();

        // Add key-value pairs to the HashMap
        keyValuePairs.put("name", "Miku Kumar");
        keyValuePairs.put("email", "mikusnsinhacollege03@gmail.com");
        keyValuePairs.put("phone", "9097039388");

        // Retrieve key-value pairs from the HashMap
        System.out.println("Name: " + keyValuePairs.get("name"));
        System.out.println("Email: " + keyValuePairs.get("email"));
        System.out.println("Phone: " + keyValuePairs.get("phone"));

        // Update a key-value pair in the HashMap
        keyValuePairs.put("email", "mikunawada1208@gmail.com");
        System.out.println("Updated Email: " + keyValuePairs.get("email"));

        // Remove a key-value pair from the HashMap
        keyValuePairs.remove("phone");
        System.out.println("Key-value pairs after removing phone: " + keyValuePairs);

        // Check if the HashMap contains a key
        System.out.println("Does the HashMap contain name? " + keyValuePairs.containsKey("name"));

        // Check if the HashMap contains a value
        System.out.println("Does the HashMap contain mikunawada1208@gmail.com? " + keyValuePairs.containsValue("mikunawada1208@gmail.com"));
    }
}
