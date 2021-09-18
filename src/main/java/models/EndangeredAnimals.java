package models;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class EndangeredAnimals {
    private static List<EndangeredAnimals> instances = new ArrayList<>();
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

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }


    public int getId() {
        return id;
    }

    public void save() {
        try (Connection conn = DB.sql2o.open()) {
            String sql = "INSERT INTO endangeredAnimals (name, health, age) VALUES (:name, :health, :age);";
            this.id = (int) conn.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .addParameter("health", this.health)
                    .addParameter("age", this.age)
                    .executeUpdate()
                    .getKey();
        }
    }

        public static List<EndangeredAnimals> getAllInstances() {
            try (Connection conn = DB.sql2o.open()) {
                String sql = "SELECT * FROM endangeredAnimals;";
                return conn.createQuery(sql)
                        .executeAndFetch(EndangeredAnimals.class);
            }
        }

        public void updateAge(String age) {
        try(Connection conn = DB.sql2o.open()) {
            String sql = "UPDATE endangeredAnimals SET age=:age WHERE id=:id;";
            conn.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("age",age)
                    .executeUpdate();
        }
        }
}
