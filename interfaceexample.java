interface Animal {
    // Abstract method (no body)
    void sound();

    // Default method with a body (Java 8 onwards)
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myDog.sleep();

        myCat.sound();
        myCat.sleep();
    }
}
