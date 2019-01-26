package org.fasttrackit;

public class Canine extends Animals {

    private String breed;
    private String regionOfOrigin;
    private String furType;
    private boolean serviceDog;
    private boolean healthIssues;
    private boolean pedigree;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    public void setRegionOfOrigin(String regionOfOrigin) {
        this.regionOfOrigin = regionOfOrigin;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    public boolean isServiceDog() {
        return serviceDog;
    }

    public void setServiceDog(boolean serviceDog) {
        this.serviceDog = serviceDog;
    }

    public boolean isHealthIssues() {
        return healthIssues;
    }

    public void setHealthIssues(boolean healthIssues) {
        this.healthIssues = healthIssues;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
}
