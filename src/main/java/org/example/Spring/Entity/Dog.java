package org.example.Spring.Entity;

public class Dog implements Pet {
    @Override
    public void say(){
        System.out.println("Wof-Wof");
    }
}
