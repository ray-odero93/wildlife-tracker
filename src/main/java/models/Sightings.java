package models;

public class Sightings {
    private int animalId;
    private int id;
    private String rangerName;
    private String location;

    public Sightings(int animalId, String location, String rangerName) {
        this.animalId = animalId;
        this.location = location;
        this.rangerName = rangerName;
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public String getRanger() {
        return rangerName;
    }
}
