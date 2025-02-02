package CoreJava;


// Abstract Class (Shape)

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayShapeInfo() {
        System.out.println("Shape Information:");
    }
}


// Subclass (Circle)

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayCircleInfo() {
        displayShapeInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}


// Subclass (Rectangle)

class Rectangles extends Shape {
    private double length;
    private double width;

    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayRectangleInfo() {
        displayShapeInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}


// Main Class

public class P025_CreateAbstractClassImplementItsMethodInSubClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayCircleInfo();

        Rectangles rectangle = new Rectangles(4.0, 6.0);
        rectangle.displayRectangleInfo();
    }
}
