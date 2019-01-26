package org.fasttrackit;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        Game game = new Game();

        Owner girlNextDoor = new Owner();
        girlNextDoor.setMoney(350);
        girlNextDoor.setOwnerName("Michelle");

        Pet cat = new Pet();
        cat.setAge(2);
        cat.setFavoriteActivity("sleeping");
        cat.setFavoriteFood("kibbles");
        cat.setPetMood(7);
        cat.setPetHealth(9);

        Food food = new Food();
        food.setAvailable(false);
        food.setFoodName("Whiskas");
        food.setFoodPrice(16);
        food.setFoodQuantity(300);

        Activity favoriteActivity = new Activity();
        favoriteActivity.setActivity("sleeping");
        favoriteActivity.setDuration(3);

        Vet vet = new Vet();
        vet.setSpecialty("cardiology, radiology");
        vet.setVetName("John Doe");
        vet.setAge(42);

    }
}
