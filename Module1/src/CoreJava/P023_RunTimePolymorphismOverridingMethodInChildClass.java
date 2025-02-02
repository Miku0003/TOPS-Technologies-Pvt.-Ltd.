package CoreJava;



// Animal Class (Parent)

class Animals {
    public void sound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}


// Dog Class (Child)

class Dogs extends Animals {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }

    public void fetch() {
        System.out.println("The dog is fetching.");
    }
}


// Cat Class (Child)

class Cats extends Animals {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating cat food.");
    }

    public void scratch() {
        System.out.println("The cat is scratching.");
    }
}


// Main Class

public class P023_RunTimePolymorphismOverridingMethodInChildClass {
    public static void main(String[] args) {
        Animals animal = new Dogs();
        animal.sound(); // Output: The dog barks.
        animal.eat(); // Output: The dog is eating dog food.

        animal = new Cats();
        animal.sound(); // Output: The cat meows.
        animal.eat(); // Output: The cat is eating cat food.

        // Downcasting to access child-specific methods
        Dogs dog = (Dogs) animal;
        dog.fetch(); // Output: The dog is fetching.

        Cats cat = (Cats) animal;
        cat.scratch(); // Output: The cat is scratching.
    }
}
