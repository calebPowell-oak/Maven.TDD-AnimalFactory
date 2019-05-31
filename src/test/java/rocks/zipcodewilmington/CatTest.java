package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "Yoloswag";

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName(expected);

        // Then (we expect the given data, to match the retrieved data)
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When
        String actual = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        String expected = "meow!";
    }

    @Test
    public void setBirthDateTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When
        Date expected = new Date();
        cat.setBirthDate(expected);

        // Then (we expect the given data, to match the retrieved data)
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.eat(new Food());

        // Then (we expect the given data, to match the retrieved data)
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIDTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer actual = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Integer expected = givenId;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Boolean actual = cat instanceof Animal;
        Assert.assertTrue(actual);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then (we expect the given data, to match the retrieved data)
        Boolean actual = cat instanceof Mammal;
        Assert.assertTrue(actual);
    }
}
