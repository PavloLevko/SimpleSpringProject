package org.example.Spring.Entity;

public class Human {
   private Pet pet;
   private int age;
   private String name;

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
