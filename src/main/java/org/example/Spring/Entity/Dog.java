package org.example.Spring.Entity;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog is created");
    }

    @Override
    public void say(){
        System.out.println("Dog say - Wof");
    }

    public void init(){
        System.out.println("Dog - init method");
    }

    public void destroy(){
        System.out.println("Dog - destroy method");
    }
}
