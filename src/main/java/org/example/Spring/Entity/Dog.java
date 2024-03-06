package org.example.Spring.Entity;

public class Dog implements Pet {
    @Override
    public void say(){
        System.out.println("Dog say - Wof");
    }
}
