package org.example.Spring.Service;

import org.example.Spring.Entity.Dog;
import org.example.Spring.Entity.Human;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Human human = context.getBean("human", Human.class);
        human.callMyPet();
        System.out.println(human.getAge());
        System.out.println(human.getName());
        context.close();
    }
}
