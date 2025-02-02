package CoreJava;

//hierarchy class
//Vehicle (Parent Class)

class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}


//Car (Child Class of Vehicle)

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}


//ElectricCar (Child Class of Car)

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int numberOfDoors, int batteryCapacity) {
        super(brand, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayElectricCarDetails() {
        displayCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}


//Main Class

public class P015_HierarchyAndMultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 4, 75);
        electricCar.displayElectricCarDetails();
    }
}
