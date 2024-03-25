package org.example.Spring.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mouse")
public class Mouse implements Pet {

    public Mouse() {
        System.out.println("Mouse is created");
    }

    @Override
    public void say() {
        System.out.println("Mouse sey...");
    }

}
