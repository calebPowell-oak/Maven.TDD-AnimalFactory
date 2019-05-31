package rocks.zipcodewilmington;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import java.util.zip.DataFormatException;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createDog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void createDogTest(){
        // Given
        String name = "Pup Pup";
        Date birthDate = new Date();

        // When
        Dog test = AnimalFactory.createDog(name, birthDate);

        // Assert
        Assert.assertEquals(test.getName(),name);
        Assert.assertEquals(test.getBirthDate(), birthDate);
    }
    @Test
    public void createCatTest(){
        // Given
        String name = "Kitty";
        Date birthDate = new Date();

        // When
        Cat test = AnimalFactory.createCat(name, birthDate);

        // Assert
        Assert.assertEquals(test.getName(),name);
        Assert.assertEquals(test.getBirthDate(), birthDate);
    }
}
