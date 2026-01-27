class Animal {
    String name = "Generic Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog constructor called");
    }

    void printNames() {
        System.out.println("Child name (this.name): " + this.name);
        System.out.println("Parent name (super.name): " + super.name);
    }

    @Override
    void sound() {
        super.sound(); // calls parent method
        System.out.println("Dog barks");
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printNames();
        d.sound();
    }
}
