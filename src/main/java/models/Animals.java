package models;

public class Animals {
    private int animalId;
    private String animalName;

    public Animals(String animalName, int animalId) {
        this.animalName = animalName;
        this.animalId = animalId;
    }

    public String getName() {
        return animalName;
    }


}
