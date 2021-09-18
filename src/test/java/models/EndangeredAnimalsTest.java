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

    @Test
    public void save_assignsIdAndSavesInstances() {
        EndangeredAnimals animal = new EndangeredAnimals("gemsbok", "okay", "adolescent");
        animal.save();
        EndangeredAnimals savedAnimal = EndangeredAnimals.getAllInstances().get(0);
        assertEquals(animal.getId(), savedAnimal.getId());
    }

    @Test
    public void returnsAllInstancesOfEndangeredAnimals() {
        EndangeredAnimals animal = new EndangeredAnimals("black panther", "okay", "adult");
        animal.save();
        EndangeredAnimals anotherAnimal = new EndangeredAnimals("rhino", "sickly", "adult");
        anotherAnimal.save();
        assertEquals(EndangeredAnimals.getAllInstances().get(0), animal.getId());
        assertEquals(EndangeredAnimals.getAllInstances().get(1), anotherAnimal.getId());
    }

    @Test
    public void returnsAnimalsWithSimilarId() {
        EndangeredAnimals animal = new EndangeredAnimals("black panther", "okay", "adult");
        animal.save();
        EndangeredAnimals anotherAnimal = new EndangeredAnimals("rhino", "sickly", "adult");
        anotherAnimal.save();
        assertEquals("black panther", EndangeredAnimals.findById(animal.getId()));
    }

    @Test
    public void updatesHealthAttribute_true() {
        EndangeredAnimals animal = new EndangeredAnimals("tiger", "okay", "young");
        animal.save();
        animal.updateHealth("sick");
        assertEquals("sick", EndangeredAnimals.findById(animal.getId()));
    }
}