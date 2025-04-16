abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    public abstract void sound();

    // Concrete method (has body)
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implement the abstract method
    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Implement the abstract method
    @Override
    public void sound() {
        System.out.println(name + " says: Meow!");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        Animal myCat = new Cat("Whiskers");

        myDog.sound();
        myDog.sleep();

        myCat.sound();
        myCat.sleep();
    }
}
