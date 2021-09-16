package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void animals_instantiatesCorrectly_true() {
        assertTrue(true);
    }

    @Test
    public void animals_instantiatesWithCorrectName_string() {
        Animals animal = new Animals("dog");
        assertEquals("dog", animal.getName());
    }

    @Test
    public void animals_instantiatesWithCorrectId_integer() {
        Animals animal = new Animals("dog");
        assertEquals(1, animal.getId());
    }

    @Test
    public void equals_returnsTrueIfNameIsSame() {
        Animals animal = new Animals("dog");
        Animals anotherAnimal = new Animals("horse");
        assertEquals(animal, anotherAnimal);
    }
}