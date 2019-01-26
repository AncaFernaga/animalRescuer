package org.fasttrackit;

public class Owner {

     private static String ownerName;
     private double money;
     private int freeHoursPerWeek;

     public static void feedPet( Pet petName, Food foodName) {
          System.out.println(ownerName + " just gave some " + foodName + " to " + petName);
     }

     public static void activity(Pet petName, Owner ownerName, Object activityName) {
          System.out.println(ownerName + " just played " + activityName + " with " + petName);
     }


     public String getOwnerName() {
          return ownerName;
     }

     public void setOwnerName(String ownerName) {
          this.ownerName = ownerName;
     }

     public double getMoney() {
          return money;
     }

     public void setMoney(double money) {
          this.money = money;
     }

     public int getFreeHoursPerWeek() {
          return freeHoursPerWeek;
     }

     public void setFreeHoursPerWeek(int freeHoursPerWeek) {
          this.freeHoursPerWeek = freeHoursPerWeek;
     }

     public void ownerName(String michelle) {
     }
}
