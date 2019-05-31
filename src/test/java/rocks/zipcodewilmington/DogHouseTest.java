package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void addTest() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void removeByIDTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        // When
        DogHouse.remove(0);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void removeByAnimalTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void getDogByIDTest() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);

        // When
        Dog actual = DogHouse.getDogById(0);

        // Then
        Dog expected = animal;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }

    @Test
    public void getNumberOfDogsTest() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
}
