package models;

public class Animals {
    private int id;
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object animal) {
        if (!(animal instanceof Animals)) {
            return false;
        } else {
            Animals anotherAnimal = (Animals) animal;
            return this.getName().equals(anotherAnimal.getName());
        }
    }
}
