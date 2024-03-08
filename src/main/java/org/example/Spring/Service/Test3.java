package org.example.Spring.Service;

import org.example.Spring.Entity.Dog;
import org.example.Spring.Entity.Human;
import org.example.Spring.Entity.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Human human = context.getBean("human", Human.class );
        human.callMyPet();
        System.out.println(human.getAge());
        System.out.println(human.getName());

        context.close();
    }
}
