package org.fasttrackit;

public class Owner {

     private String ownerName;
     private double money;
     private int freeHoursPerWeek;

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
}
