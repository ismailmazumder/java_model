// Abstract class with an abstract method
abstract class Animal {
    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass that provides implementation of the abstract method
class Dog extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}




// Subclass that provides implementation of the abstract method
class Cat extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Outputs: Woof! Woof!
        dog.sleep();      // Outputs: The animal is sleeping.

        Animal cat = new Cat();
        cat.makeSound();  // Outputs: Meow! Meow!
        cat.sleep();      // Outputs: The animal is sleeping.
    }
}