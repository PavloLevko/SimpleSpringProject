package org.example.Spring.Service;

import org.example.Spring.Entity.Mouse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Mouse mouse = context.getBean("mouse", Mouse.class);

        mouse.say();
    }
}
