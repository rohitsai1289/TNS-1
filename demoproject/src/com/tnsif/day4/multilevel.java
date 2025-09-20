package com.tnsif.day4;
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}


class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


public class multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();

        
        dog.eat();

        
        dog.walk();

        
        dog.bark();
    }
}

