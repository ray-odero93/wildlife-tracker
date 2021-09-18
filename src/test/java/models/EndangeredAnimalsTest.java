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

    @Test
    public void getName_returnsNameAttribute_true() {
        EndangeredAnimals testAnimal = new EndangeredAnimals("Jackal", "Healthy", "Young");
        assertEquals("Jackal", testAnimal.getName());
    }

    @Test
    public void getAge_returnsAgeAttribute_true() {
        EndangeredAnimals animal = new EndangeredAnimals("gemsbok", "okay", "adolescent");
        assertEquals("adolescent", animal.getAge());
    }
}