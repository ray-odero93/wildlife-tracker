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

    public static List<Animals> getAllAnim() {
        try(Connection conn = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals;";
            return conn.createQuery(sql)
                    .executeAndFetch(Animals.class);
        }
    }

    public static Object findById(int id) {
        try(Connection conn = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals WHERE id=:id;";
            return conn.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Animals.class);
        }
    }

    public void updateName(String name) {
        try(Connection conn = DB.sql2o.open()) {
            String sql = "UPDATE animals SET name=:name WHERE id=:id;";
            conn.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("name", name)
                    .executeUpdate();
        }
    }

    public void deleteInstance() {
        try (Connection conn = DB.sql2o.open()) {
            String sql = "DELETE FROM animals WHERE id=:id;";
            conn.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public List<Sightings> getSightings() {
        try (Connection conn = DB.sql2o.open()) {
            String sql = "SELECT * FROM sightings WHERE animalId=:id;";
            List<Sightings> sightings = conn.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetch(Sightings.class);
            return sightings;
        }
    }
}
