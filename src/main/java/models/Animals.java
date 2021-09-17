package models;

import java.sql.Connection;
import java.util.List;

public class Animals {
    private static List<Animals> instances;
    private int id;
    private String name;

    public Animals(String name) {
        this.name = name;
        this.id = id;
    }

    public static List<Animals> getAllAnim() {
        try(Connection conn = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name);";
            return conn.createQuery(sql)
                    .executeAndFetch(Animals.class);
        }
    }

    public static Animals findById(int id) {
        return null;
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

    public void save() {
        try (Connection conn = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name);";
            this.id = (int) conn.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }
    }

    public void updateName(String jackal) {

    }

    public void deleteInstance() {
    }
}
