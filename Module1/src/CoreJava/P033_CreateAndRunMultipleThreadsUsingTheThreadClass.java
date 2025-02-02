package CoreJava;


//Thread class 1: PrintNumbers
class PrintNumbers extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 10; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500); // sleep for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

//Thread class 2: PrintLetters
class PrintLetters extends Thread {
 @Override
 public void run() {
     for (char c = 'A'; c <= 'J'; c++) {
         System.out.println("Letter: " + c);
         try {
             Thread.sleep(500); // sleep for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }
}

public class P033_CreateAndRunMultipleThreadsUsingTheThreadClass {
 public static void main(String[] args) {
     // Create threads
     PrintNumbers numbersThread = new PrintNumbers();
     PrintLetters lettersThread = new PrintLetters();

     // Start threads
     numbersThread.start();
     lettersThread.start();
 }
}
