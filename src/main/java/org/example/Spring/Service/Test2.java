package org.example.Spring.Service;

import org.example.Spring.Entity.Cat;
import org.example.Spring.Entity.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);

        pet.say();

        context.close();
    }
}
