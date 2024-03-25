package org.example.Spring.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("human")
public class Human {
    @Autowired
    @Qualifier(value = "mouse")
   private Pet pet;
    @Value("99")
   private int age;
    @Value("Jon")
   private String name;

//    public Human(Pet pet) {
//        this.pet = pet;
//    }

    public void callMyPet(){
       System.out.println("Where is my pet?");
       pet.say();
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
