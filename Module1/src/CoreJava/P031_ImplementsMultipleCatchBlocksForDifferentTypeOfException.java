package CoreJava;



public class P031_ImplementsMultipleCatchBlocksForDifferentTypeOfException {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            System.out.println("Inside try block");
            int[] array = new int[5];
            System.out.println(array[10]); // ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // NullPointerException

            int divideByZero = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Inside catch block for ArrayIndexOutOfBoundsException");
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("Inside catch block for NullPointerException");
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("Inside catch block for ArithmeticException");
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other type of exception
            System.out.println("Inside catch block for Exception");
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that will always be executed
            System.out.println("Inside finally block");
            System.out.println("Program execution completed");
        }
    }
}

