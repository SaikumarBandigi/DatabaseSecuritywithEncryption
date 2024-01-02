package com.springboot.CustomSecurityWithDB;

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


public class UpcastingExample {
    public static void main(String[] args) {

        /*
        Upcasting is the process of casting a reference to a more general class type, typically from a subclass to a superclass.
It is done implicitly by the Java compiler, and no explicit casting is required.
Upcasting is considered safe because you are moving from a more specific type to a more general type, and you won't lose any information in the process.
         */
        // Upcasting
        Dog myDog = new Dog();
        Animal myAnimal = myDog; // Implicit upcasting


        ///////////////////////////////////////////

        // Downcasting
        Animal animal = new Dog();
        Dog dog = (Dog) animal; // Explicit downcasting

// Be cautious, as this can result in a ClassCastException if myAnimal is not actually a Dog
/*
Downcasting is the process of casting a reference to a more specific class type, typically from a superclass to a subclass.
Downcasting must be done explicitly using parentheses and the subclass type.
It involves the risk of a ClassCastException at runtime if the object being downcast is not actually an instance of the target subclass.
 */

    }
}
