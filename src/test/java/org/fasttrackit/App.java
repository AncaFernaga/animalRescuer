package org.fasttrackit;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Game game = new Game();

        Owner girlNextDoor = new Owner();
        girlNextDoor.money = 350;
        girlNextDoor.ownerName = "Michelle";

        Pet cat = new Pet();
        cat.age = 2;
        cat.favoriteActivity = "sleeping";
        cat.favoriteFood = "kibbles";
        cat.mood = 7;
        cat.health = 9;

        Food food = new Food();
        food.available = false;
        food.foodName = "Whiskas";
        food.foodPrice = 16;
        food.foodQuantity = 300;

        Activity favoriteActivity = new Activity();
        favoriteActivity.activity = "sleeping";
        favoriteActivity.duration = 3;

        Vet vet = new Vet();
        vet.specialty = "cardiology, radiology";
        vet.vetName = "John Doe";
        vet.age = 42;

    }
}
