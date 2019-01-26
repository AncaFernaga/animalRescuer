package org.fasttrackit;

public class App {

    public static void main(String[] args) {

        Game game = new Game();


        Owner girlNextDoor = new Owner();
        ((Owner) girlNextDoor).setMoney(350);
        girlNextDoor.ownerName("Michelle");

        Pet dog = new Pet();
        dog.setAge(2);
        dog.setFavoriteActivity("fetch");
        dog.setFavoriteFood("kibbles");
        dog.setPetMood(7);
        dog.setPetHealth(9);

        Food food = new Food();
        food.setAvailable(false);
        food.setFoodName("Dog Chow");
        food.setFoodPrice(16);
        food.setFoodQuantity(300);

        Activity favoriteActivity = new Activity();
        favoriteActivity.activityName("fetch");
        favoriteActivity.setDuration(1);

        Vet vet = new Vet();
        vet.setSpecialty("cardiology, radiology");
        vet.setVetName("John Doe");
        vet.setAge(42);

    }
}
