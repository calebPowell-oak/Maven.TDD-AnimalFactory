package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private CatHouse CatHouse;
    private Cat kitten;

    @Test
    public void addTest(){
        // Given
        Integer id = 123;
        CatHouse = new CatHouse();
        kitten = new Cat("Bob Ross", new Date(), id);
        Cat expected = kitten;

        // When
        CatHouse.add(kitten);
        Cat actual = CatHouse.getCatById(id);

        // Assert
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void removeTest(){
        // Given
        CatHouse = new CatHouse();
        kitten = new Cat("Jacob", new Date(), 425);
        CatHouse.add(kitten);
        Integer expected = 0;

        // When
        CatHouse.remove(kitten);
        Integer actual = CatHouse.getNumberOfCats();

        // Assert
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void removeTest2(){
        // Given
        Integer id = 534;
        Integer expected = 0;
        CatHouse = new CatHouse();
        kitten = new Cat("Dale Din", new Date(), id);
        CatHouse.add(kitten);

        // When
        CatHouse.remove(id);
        Integer actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void getCatByIdTest(){
        // Given
        Integer id = 994;
        CatHouse = new CatHouse();
        kitten = new Cat("Lecture", new Date(), id);
        CatHouse.add((kitten));

        // When
        Cat expected = kitten;
        Cat actual = CatHouse.getCatById(id);

        // Then
        Assert.assertEquals(expected, actual);
        CatHouse.clear();
    }

    @Test
    public void getNumberOfCatsTest(){
        // Given
        CatHouse = new CatHouse();
        kitten = new Cat("One", new Date(), 0);
        CatHouse.add(kitten);

        // When
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);
        CatHouse.clear();

    }
}
