package CoreJava;

//public class  {
//
//}

// Vehicle Class (Parent)

class Vehicles {
    private String brand;
    private String model;

    public Vehicles(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public void honk() {
        System.out.println("Honk!");
    }
}


// Car Class (Child)

class Cars extends Vehicles {
    private int numberOfDoors;

    public Cars(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public void accelerate() {
        System.out.println("Vroom!");
    }
}


// Motorcycle Class (Child)

class Motorcycle extends Vehicles {
    private int engineCapacity;

    public Motorcycle(String brand, String model, int engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    public void displayMotorcycleDetails() {
        displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }

    public void revEngine() {
        System.out.println("Rrrrr!");
    }
}


// Main Class

public class P022_InheritanceUsingExtendsKeyword {
    public static void main(String[] args) {
        Cars car = new Cars("Toyota", "Corolla", 4);
        car.displayCarDetails();
        car.honk();
        car.accelerate();

        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 500);
        motorcycle.displayMotorcycleDetails();
        motorcycle.honk();
        motorcycle.revEngine();
    }
}
