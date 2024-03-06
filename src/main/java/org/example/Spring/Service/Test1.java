package org.example.Spring.Service;

import org.example.Spring.Entity.Cat;
import org.example.Spring.Entity.Dog;

public class Test1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.say();
        cat.say();
    }
}
