package CoreJava;

//public class P047_CreateProgramThatReadsFromOneFileAndWritesTheContentToAnotherFile {
//
//}

import java.io.*;

public class P047_CreateProgramThatReadsFromOneFileAndWritesTheContentToAnotherFile {
    public static void main(String[] args) {
        // Source file
        String sourceFile = "source.txt";

        // Destination file
        String destinationFile = "destination.txt";

        // Copy file
        copyFile(sourceFile, destinationFile);
    }

    /**
     * Copies a file from the source to the destination.
     *
     * @param sourceFile      the source file
     * @param destinationFile the destination file
     */
    public static void copyFile(String sourceFile, String destinationFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            // Read and write lines
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
