package org.example.Spring.Service;

import org.example.Spring.Entity.Dog;
import org.example.Spring.Entity.Human;
import org.example.Spring.Entity.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);

//        Pet pet = new Dog();
        Human human = new Human(pet);
        human.callMyPet();
    }
}
