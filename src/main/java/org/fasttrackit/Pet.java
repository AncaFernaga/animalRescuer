package org.fasttrackit;

public class Pet extends Animals {
     private Animals animals;
     private boolean isPurring;

     public Pet(Animals animals) {
          this.animals = animals;
     }

          private Canine canine;
          public Pet(Canine canine) {
               this.canine = canine;
          }

     Breed breed;

     public Pet() {

     }

     @Override
     public String toString() {
          return "Pet{" +
                  "petMood=" + petMood +
                  '}';
     }

     public void petMood(Pet pet, boolean isContent) {
          if (isContent = true) {
               System.out.println("Looks like your dog is happy!");}
          else{
               System.out.println("Looks like your dog isn't feeling very well.");
          }
     }


     private String petName;
     private int age;
     private String favoriteFood;
     private String favoriteActivity;
     private int petHealth ;
     private int petHunger;
     private int petMood;

     public Pet(String dalmatian, String black_and_white, String puppy) {

     }

     public String getPetName() {
          return petName;
     }

     public void setPetName(String petName) {
          this.petName = petName;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getFavoriteFood() {
          return favoriteFood;
     }

     public void setFavoriteFood(String favoriteFood) {
          this.favoriteFood = favoriteFood;
     }

     public String getFavoriteActivity() {
          return favoriteActivity;
     }

     public void setFavoriteActivity(String favoriteActivity) {
          this.favoriteActivity = favoriteActivity;
     }

     public int getPetHealth() {
          return petHealth;
     }

     public void setPetHealth(int petHealth) {
          this.petHealth = petHealth;
     }

     public int getPetHunger() {
          return petHunger;
     }

     public void setPetHunger(int petHunger) {
          this.petHunger = petHunger;
     }

     public int getPetMood() {
          return petMood;
     }

     public void setPetMood(int petMood) {
          this.petMood = petMood;
     }


     public void getPetMood(Pet myDog, boolean b) {
     }
}
