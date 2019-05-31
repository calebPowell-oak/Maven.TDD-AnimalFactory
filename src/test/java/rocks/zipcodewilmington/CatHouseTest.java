package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.awt.*;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private CatHouse testCatHouse;
    private Cat kitten;

    @Test
    public void addTest(){
        // Given
        Integer id = 123;
        testCatHouse = new CatHouse();
        kitten = new Cat("Bob Ross", new Date(), id);
        Cat expected = kitten;

        // When
        testCatHouse.add(kitten);
        Cat actual = testCatHouse.getCatById(id);

        // Assert
        Assert.assertEquals(expected, actual);
        testCatHouse.clear();
    }

    @Test
    public void removeTest(){
        // Given
        testCatHouse = new CatHouse();
        kitten = new Cat("Jacob", new Date(), 425);
        testCatHouse.add(kitten);
        Integer expected = 0;

        // When
        testCatHouse.remove(kitten);
        Integer actual = testCatHouse.getNumberOfCats();

        // Assert
        Assert.assertEquals(expected, actual);
        testCatHouse.clear();
    }

    @Test
    public void removeTest2(){
        // Given
        Integer id = 534;
        Integer expected = 0;
        testCatHouse = new CatHouse();
        kitten = new Cat("Dale Din", new Date(), id);
        testCatHouse.add(kitten);

        // When
        testCatHouse.remove(id);
        Integer actual = testCatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
        testCatHouse.clear();
    }

    @Test
    public void getCatByIdTest(){
        // Given
        Integer id = 994;
        testCatHouse = new CatHouse();
        kitten = new Cat("Lecture", new Date(), id);
        testCatHouse.add((kitten));

        // When
        Cat expected = kitten;
        Cat actual = testCatHouse.getCatById(id);

        // Then
        Assert.assertEquals(expected, actual);
        testCatHouse.clear();
    }

    @Test
    public void getNumberOfCatsTest(){
        // Given
        testCatHouse = new CatHouse();
        kitten = new Cat("One", new Date(), 0);
        testCatHouse.add(kitten);

        // When
        Integer expected = 1;
        Integer actual = testCatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
        testCatHouse.clear();

    }
}
