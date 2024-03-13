package org.example.Spring.Entity;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements Pet {

    public Mouse() {
        System.out.println("Mouse is created");
    }

    @Override
    public void say() {
        System.out.println("Mouse sey...");
    }
}
