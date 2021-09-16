package models;

import java.util.List;

public class Animals {
    private int id;
    private String name;

    public Animals(String name) {
        this.name = name;
        this.id = id;
    }

//    public static List<Object> getAllAnim() {
//        return null;
//    }

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

//    public void save() {
//    }
}
