package CoreJava;


import java.util.Scanner;

public class P045_ToReadInputFromTheConsoleUsingScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read from System.in
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Print the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        // Close the Scanner object
        scanner.close();
    }
}

