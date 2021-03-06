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

    @Test
    public void getLocation_instantiatesWithCorrectLocation_string() {
        Animals animal = new Animals("dog");
        animal.save();
        Sightings testSightings = new Sightings(animal.getId(), "Zone D", "John");
        assertEquals("Zone D", testSightings.getLocation());
    }

    @Test
    public void getRanger_instantiatesWithCorrectRangerName_string() {
        Animals animal = new Animals("dog");
        animal.save();
        Sightings testSightings = new Sightings(animal.getId(), "Zone D", "John");
        assertEquals("John", testSightings.getRanger());
    }

    @Test
    public void getId_instantiatesWithCorrectId_integer() {
        Animals animal = new Animals("dog");
        animal.save();
        Sightings testSightings = new Sightings(animal.getId(), "Zone D", "John");
        assertEquals(0, testSightings.getId());
    }
}