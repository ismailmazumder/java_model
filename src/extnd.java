public class extnd {
    public static void main(String[] args) {
        class Animal {
            void eat() {
                System.out.println("Animal is eating");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("Dog is barking");
            }
        }
        Dog dog = new Dog();
        dog.eat();  // Outputs: Animal is eating
        dog.bark(); // Outputs: Dog is barking
        // use can both

// extends (এক্সটেন্ডস) শব্দের অর্থ: "প্রসারিত করা" বা "বাড়ানো"।
// যদি extends করে, এবং উভয় class-এ একই নামে void method থাকে, তাহলে subclass-এর method টা override করে দেয় superclass-এরটা।
// subclass-এ override করলে, চাইলে @Override annotation দিতে পারো (ভুল ধরতে সুবিধা হয়)।


        class Animal_ {
            void makeSound_() {
                System.out.println("Some sound________");
            }
        }

        class Dog_ extends Animal_ {
            @Override
            void makeSound_() {
                System.out.println("Bark________");
            }
        }
        Dog_ dog_ = new Dog_();
        dog_.makeSound_();  // Outputs: Bark________

    }
}
