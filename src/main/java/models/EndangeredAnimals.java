package models;

public class EndangeredAnimals {
    private int id;
    private String name;
    private String health;
    private String age;
    private boolean endangered;

    public EndangeredAnimals(String name, String health, String age) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.id = id;
    }

    public String getHealth() {
        return health;
    }
}
