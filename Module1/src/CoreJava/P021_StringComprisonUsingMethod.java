package CoreJava;

import java.util.*;

public class P021_StringComprisonUsingMethod {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 1st String Value: ");
    	String str1 = sc.nextLine();
    	System.out.println("Enter 2nd String Value : ");
    	String str2 = sc.nextLine();
    	System.out.println("Enter 3rd String Value: ");
    	String str3 = sc.nextLine();

        // Using equals() method
        System.out.println("Using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false (case-sensitive)
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // true (case-insensitive)
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false

        // Using compareTo() method
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // positive value (str1 > str2)
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // negative value (str1 < str3)

        // Using compareToIgnoreCase() method
        System.out.println("\nUsing compareToIgnoreCase() method:");
        System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2)); // 0 (str1 == str2, ignoring case)
    }
}