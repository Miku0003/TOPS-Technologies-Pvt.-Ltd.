package CoreJava;


//Reading from a File using FileReader

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class P038_ReadToAFileUsingFileReader {
 public static void main(String[] args) {
     try (FileReader fileReader = new FileReader("example.txt");
          BufferedReader bufferedReader = new BufferedReader(fileReader)) {

         String line;
         while ((line = bufferedReader.readLine()) != null) {
             System.out.println(line);
         }

        System.out.println("Content read from file successfully.");

     } catch (IOException e) {
         System.out.println("Error reading from file: " + e.getMessage());
     }
 }
}
