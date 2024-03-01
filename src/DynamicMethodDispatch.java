class Animal {
    void sound() {
        System.out.println("Animal make sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dogs make sounds");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cats make sounds");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Animal make sounds

        Animal dog = new Dog();
        dog.sound(); // Dogs make sounds

        Animal cat = new Cat();
        cat.sound(); // Cats make sounds

        // When we call the sound() method on these references,
        // the JVM determines which version of the method to call
        // based on the actual object type at runtime.
        // This is dynamic method dispatch.

    }
}
