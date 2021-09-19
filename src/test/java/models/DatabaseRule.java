package models;

import org.junit.rules.ExternalResource;
import org.sql2o.Sql2o;

import java.sql.Connection;

public class DatabaseRule extends ExternalResource {

    @Override
    protected void beforeCreate() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", null, null);
    }

    @Override
    protected void afterCreate() {
        try(Connection conn = DB.sql2o.open()) {
            String deleteAnimalsQuery = "DELETE FROM animals *;";
            String deleteEndangeredAnimalsQuery = "DELETE FROM endangered_animals *;";
            String deleteSightingsQuery = "DELETE FROM sightings *;";
            conn.createQuery(deleteAnimalsQuery).executeUpdate();
            conn.createQuery(deleteEndangeredAnimalsQuery).executeUpdate();
            conn.createQuery(deleteSightingsQuery).executeUpdate();
        }
    }
}
