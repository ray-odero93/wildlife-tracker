package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void animals_instantiatesCorrectly_true() {
        Animals animal = new Animals("dog", 1);
        assertTrue(animal instanceof Animals);
    }

    @Test
    public void animals_instantiatesWithCorrectName_string() {
        Animals animal = new Animals("dog", 1);
        assertEquals("dog", animal.getName());
    }

    @Test
    public void animals_instantiatesWithCorrectId_integer() {
        Animals animal = new Animals("dog", 1);
        assertEquals(1, animal.getId());
    }
}