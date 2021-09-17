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
        assertEquals(0, animal.getId());
    }

    @Test
    public void equals_returnsTrueIfNameIsSame_false() {
        Animals animal = new Animals("dog");
        Animals anotherAnimal = new Animals("dog");
        assertEquals(animal, anotherAnimal);
    }

    @Test
    public void save_assignsIdAndSavesObject() {
        Animals testAnimal = new Animals("dog");
        testAnimal.save();
        Animals savedAnimal = Animals.getAllAnim().get(0);
        assertEquals(testAnimal.getId(), savedAnimal.getId());
    }

    @Test
    public void getAllInstances_returnsAllInstancesOfAnimals_true() {
        Animals animal = new Animals("gazelle");
        animal.save();
        Animals anotherAnimal = new Animals("leopard");
        anotherAnimal.save();
        assertEquals(Animals.getAllAnim().get(0), animal);
        assertEquals(Animals.getAllAnim().get(1), anotherAnimal);
    }

    @Test
    public void returnsAnimalWithSameId_anotherAnimal() {
        Animals animal = new Animals("antelope");
        animal.save();
        Animals anotherAnimal = new Animals("springbok");
        anotherAnimal.save();
        assertEquals(Animals.findById(anotherAnimal.getId()), anotherAnimal);
    }
}