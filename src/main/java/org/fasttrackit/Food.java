package org.fasttrackit;
import java.util.Date;

public class Food {


     private String foodName;
     private double foodPrice;
     private double foodQuantity;
     private boolean available = false;

     public String getFoodName() {
          return foodName;
     }

     public void setFoodName(String foodName) {
          this.foodName = foodName;
     }

     public double getFoodPrice() {
          return foodPrice;
     }

     public void setFoodPrice(double foodPrice) {
          this.foodPrice = foodPrice;
     }

     public double getFoodQuantity() {
          return foodQuantity;
     }

     public void setFoodQuantity(double foodQuantity) {
          this.foodQuantity = foodQuantity;
     }

     public boolean isAvailable() {
          return available;
     }

     public void setAvailable(boolean available) {
          this.available = available;
     }

     Date expiryDate = new Date(2020,1,15);

    }

