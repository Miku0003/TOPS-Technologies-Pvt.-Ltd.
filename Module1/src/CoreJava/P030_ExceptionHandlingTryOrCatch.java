package CoreJava;


public class P030_ExceptionHandlingTryOrCatch {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            System.out.println("Inside try block");
            int divideByZero = 10 / 0;
            System.out.println();
            
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Inside catch block");
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println();

        } finally {
            // Code that will always be executed
            System.out.println("Inside finally block");
            System.out.println("Program execution completed");
        }
    }
}
