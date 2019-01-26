package org.fasttrackit;

public class Pet extends Animals {
     private Animals animals;
     public Pet(Animals animals) {
          this.animals = animals;
     }

          private Canine canine;
          public Pet(Canine canine) {
               this.canine = canine;
          }

     Breed breed;

     String petName;
     int age;
     String favoriteFood;
     String favoriteActivity;
     int petHealth ;
     int petHunger;
     int petMood;
}
