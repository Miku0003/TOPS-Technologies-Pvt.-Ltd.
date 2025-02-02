package CoreJava;


// Animal Class (Parent)

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("The animal makes a sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}


// Dog Class (Child)

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
   

    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating dog food.");
    }

    public String getName() {
        return super.getName();
    }
}


// Cat Class (Child)

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating cat food.");
    }

    public String getName() {
        return super.getName();
    }
}


// Main Class

public class P016_MethodOverridingAndPolymorphism {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.sound();  // Output: The dog barks.
        dog.eat();    // Output: Buddy is eating dog food.

        cat.sound();  // Output: The cat meows.
        cat.eat();    // Output: Whiskers is eating cat food.

        // Polymorphism in action
        Animal[] animals = {new Dog("Max"), new Cat("Luna")};
        for (Animal animal : animals) {
            animal.sound();
            animal.eat();
        }
    }
}