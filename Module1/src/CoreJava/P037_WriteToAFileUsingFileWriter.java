package CoreJava;

// Writing to a File using FileWriter

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P037_WriteToAFileUsingFileWriter {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("example.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println("Hello Sir, I'm Miku Kumar from Jehanabad, Bihar.");
            printWriter.println("I've done B.C.A in 2024.");
            printWriter.println("And Now, I'm training as a Java developer from TOPS Technologies pvt. ltd.");
            printWriter.println("and i have some other technical skills like: HTML, CSS, C , C++, MySql");
            printWriter.println("I'm very happy to create this file.");

            System.out.println("Content written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}



