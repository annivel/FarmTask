import org.testng.annotations.Test;
import providers.DataProviders;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static providers.DataProviders.*;

public class TestSuites {

    final Rectangle farmSquare = new Rectangle(FARM_MIN_CORNER_X, FARM_MIN_CORNER_Y, FARM_MAX_CORNER_X, FARM_MAX_CORNER_Y);
    private final Rectangle blockSquare = new Rectangle(BLOCK_MIN_CORNER_X, BLOCK_MIN_CORNER_Y, BLOCK_MAX_CORNER_X, BLOCK_MAX_CORNER_Y);
    private final Farm farm = new Farm(farmSquare, blockSquare);
    private final Dog dog = new Dog(farm, 40, 30);
    private final Sheep sheep = new Sheep(farm, 65, 30);

    @Test(dataProvider = "getDogDataFarm", dataProviderClass = DataProviders.class)
    public void checkMoveForDogToFarm(int x, int y, boolean expectedResult) {
        assertEquals(dog.move(x, y), expectedResult, String.format("The entered coordinates: x=%d, y=%d aren't related to the yard xMin=%d, xMax=%d, yMin=%d, yMax=%d ",
                x,
                y,
                FARM_MIN_CORNER_X,
                FARM_MAX_CORNER_X,
                FARM_MIN_CORNER_Y,
                FARM_MAX_CORNER_Y));
    }

    @Test(dataProvider = "getDogDataBlock", dataProviderClass = DataProviders.class)
    public void checkMoveForDogToBlock(int x, int y, boolean expectedResult) {
        assertEquals(dog.move(x, y), expectedResult, String.format("The entered coordinates: x=%d, y=%d aren't related to the yard xMin=%d, xMax=%d, yMin=%d, yMax=%d ",
                x,
                y,
                BLOCK_MIN_CORNER_X,
                BLOCK_MAX_CORNER_X,
                BLOCK_MIN_CORNER_Y,
                BLOCK_MAX_CORNER_Y));
    }

    @Test(dataProvider = "getSheepDataFarm", dataProviderClass = DataProviders.class)
    public void checkMoveForSheepToFarm(int x, int y, boolean expectedResult) {
        assertEquals(sheep.move(x, y), expectedResult, String.format("The entered coordinates: x=%d, y=%d aren't related to the yard xMin=%d, xMax=%d, yMin=%d, yMax=%d ",
                x,
                y,
                FARM_MIN_CORNER_X,
                FARM_MAX_CORNER_X,
                FARM_MIN_CORNER_Y,
                FARM_MAX_CORNER_Y));
    }

    @Test(dataProvider = "getSheepDataBlock", dataProviderClass = DataProviders.class)
    public void checkMoveForSheepToBlock(int x, int y, boolean expectedResult) {
        assertEquals(sheep.move(x, y), expectedResult, String.format("The entered coordinates: x=%d, y=%d aren't related to the yard xMin=%d, xMax=%d, yMin=%d, yMax=%d ",
                x,
                y,
                BLOCK_MIN_CORNER_X,
                BLOCK_MAX_CORNER_X,
                BLOCK_MIN_CORNER_Y,
                BLOCK_MAX_CORNER_Y));
    }
    @Test
    public void getDogsByXLessThan100(){
        List<Dog> dogs = Arrays.asList(
                new Dog(farm, 70, 50),
                new Dog(farm, 69, 30),
                new Dog(farm, 40, 90),
                new Dog(farm, 120, 60),
                new Dog(farm, 130, 90),
                new Dog(farm, 75, 49),
                new Dog(farm, 115, 60),
                new Dog(farm, 40, 40),
                new Dog(farm, 79, 51),
                new Dog(farm, 120, 60),
                new Dog(farm, 50, 80),
                new Dog(farm, 45, 60),
                new Dog(farm, 75, 40),
                new Dog(farm, 79, 49),
                new Dog(farm, 111, 50),
                new Dog(farm, 129, 71),
                new Dog(farm, 42, 69),
                new Dog(farm, 119, 50),
                new Dog(farm, 125, 70),
                new Dog(farm, 45, 30));

        dogs.stream().filter(dog -> dog.x < 100).forEach(System.out::println);

    }


}
