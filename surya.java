// Example of method overriding in Java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class surya {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); // Output: Animal makes a sound

        Dog d = new Dog();
        d.sound(); // Output: Dog barks
    }
}
