package org.example.Spring.Service;

import org.example.Spring.Entity.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat = context.getBean("myPet", Cat.class);
        Cat cat2 = context.getBean("myPet", Cat.class);
        cat.setName("Bob");
        cat2.setName("Recs");
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());

        context.close();
    }
}
