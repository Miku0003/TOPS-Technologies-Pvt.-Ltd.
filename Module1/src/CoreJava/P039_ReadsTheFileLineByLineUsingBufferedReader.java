package CoreJava;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P039_ReadsTheFileLineByLineUsingBufferedReader {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

            System.out.println("File read successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
