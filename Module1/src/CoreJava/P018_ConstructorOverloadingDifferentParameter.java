package CoreJava;



// Rectangle Class

class Rectangle {
    private double length;
    private double width;

    // Constructor with no parameters (default values)
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    // Constructor with one parameter (square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters (length and width)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor with an array of two parameters (length and width)
    public Rectangle(double[] dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("Array must contain exactly two elements.");
        }
        this.length = dimensions[0];
        this.width = dimensions[1];
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return this.length * this.width;
    }

    // Method to display the rectangle's dimensions
    public void displayDimensions() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }
}


// Main Class

public class P018_ConstructorOverloadingDifferentParameter {
    public static void main(String[] args) {
        // Create a rectangle with default values
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1:");
        rectangle1.displayDimensions();
        System.out.println("Area: " + rectangle1.calculateArea());

        // Create a square with a side length of 5.0
        Rectangle rectangle2 = new Rectangle(5.0);
        System.out.println("\nRectangle 2 (Square):");
        rectangle2.displayDimensions();
        System.out.println("Area: " + rectangle2.calculateArea());

        // Create a rectangle with a length of 4.0 and a width of 6.0
        Rectangle rectangle3 = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle 3:");
        rectangle3.displayDimensions();
        System.out.println("Area: " + rectangle3.calculateArea());

        // Create a rectangle from an array of dimensions
        double[] dimensions = {3.0, 7.0};
        Rectangle rectangle4 = new Rectangle(dimensions);
        System.out.println("\nRectangle 4:");
        rectangle4.displayDimensions();
        System.out.println("Area: " + rectangle4.calculateArea());
    }
}
