package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void constructorTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the doggy)
        String retrievedName = doggy.getName();
        Date retrievedBirthDate = doggy.getBirthDate();
        Integer retrievedId = doggy.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "Yoloswag";

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);
        doggy.setName(expected);

        // Then (we expect the given data, to match the retrieved data)
        String actual = doggy.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);

        // When
        String actual = doggy.speak();

        // Then (we expect the given data, to match the retrieved data)
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);

        // When
        Date expected = new Date();
        doggy.setBirthDate(expected);

        // Then (we expect the given data, to match the retrieved data)
        Date actual = doggy.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);
        doggy.eat(new Food());

        // Then (we expect the given data, to match the retrieved data)
        Integer expected = 1;
        Integer actual = doggy.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);
        Integer actual = doggy.getId();

        // Then (we expect the given data, to match the retrieved data)
        Integer expected = givenId;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Boolean actual = doggy instanceof Animal;
        Assert.assertTrue(actual);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given (doggy data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a doggy is constructed)
        Dog doggy = new Dog(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Boolean actual = doggy instanceof Mammal;
        Assert.assertTrue(actual);
    }
}
