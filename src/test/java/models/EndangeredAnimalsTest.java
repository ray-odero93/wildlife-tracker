package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalsTest {

    @Test
    public void endangeredAnimals_instantiatesCorrectly_true() {
        EndangeredAnimals animal = new EndangeredAnimals("Jackal", "Healthy", "Young");
        assertTrue(true);
    }

    @Test
    public void getHealth_returnsHealthAttribute_true() {
        EndangeredAnimals testAnimal = new EndangeredAnimals("Jackal", "Healthy", "Young");
        assertEquals("Healthy", testAnimal.getHealth());
    }
}