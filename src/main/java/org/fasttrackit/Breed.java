package org.fasttrackit;

public class Breed {

    private Animals animals;
    public Breed (Animals animals) {
        this.animals = animals;
    }

    private String breed1 = "Alaskan Malamute";
    private String breed2 = "Beagle";
    private String breed3 = "Dalmatian";
    private String breed4 = "French Bulldog";
    private String breed5 = "Rottweiler";

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

    public String getBreed1() {
        return breed1;
    }

    public void setBreed1(String breed1) {
        this.breed1 = breed1;
    }

    public String getBreed2() {
        return breed2;
    }

    public void setBreed2(String breed2) {
        this.breed2 = breed2;
    }

    public String getBreed3() {
        return breed3;
    }

    public void setBreed3(String breed3) {
        this.breed3 = breed3;
    }

    public String getBreed4() {
        return breed4;
    }

    public void setBreed4(String breed4) {
        this.breed4 = breed4;
    }

    public String getBreed5() {
        return breed5;
    }

    public void setBreed5(String breed5) {
        this.breed5 = breed5;
    }
}
