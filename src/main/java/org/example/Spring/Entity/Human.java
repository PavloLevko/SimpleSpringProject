package org.example.Spring.Entity;

public class Human {
   private Pet pet;

   public Human (Pet pet){
       this.pet = pet;
   }

   public void callMyPet(){
       System.out.println("Where is my pet?");
       pet.say();
   }

}
