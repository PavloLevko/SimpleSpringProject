package org.example.Spring.Entity;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Dog is created");
    }

    @Override
    public void say() {
        System.out.println("Cat say - Mau");
    }
}
