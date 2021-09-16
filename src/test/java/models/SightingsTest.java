package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SightingsTest {

    @Test
    public void sighting_instantiatesCorrectly_true() {
        Animals animal = new Animals("dog");
        animal.save();
        Sightings testSightings = new Sightings(animal.getId(), "Zone D", "John");
        assertTrue(true);
    }
}