import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSuites extends DataProviders {
    private static final int FARM_MIN_CORNER_X = 40;
    private static final int FARM_MAX_CORNER_X = 130;
    private static final int FARM_MIN_CORNER_Y = 30;
    private static final int FARM_MAX_CORNER_Y = 90;

    private static final int BLOCK_MIN_CORNER_X = 80;
    private static final int BLOCK_MAX_CORNER_X = 110;
    private static final int BLOCK_MIN_CORNER_Y = 50;
    private static final int BLOCK_MAX_CORNER_Y = 70;

    private final Rectangle farmSquare = new Rectangle(
            FARM_MIN_CORNER_X, FARM_MIN_CORNER_Y, FARM_MAX_CORNER_X, FARM_MAX_CORNER_Y);
    private final Rectangle blockSquare = new Rectangle(
            BLOCK_MIN_CORNER_X, BLOCK_MIN_CORNER_Y, BLOCK_MAX_CORNER_X, BLOCK_MAX_CORNER_Y);
    private final Farm farm = new Farm(farmSquare, blockSquare);
    private final Dog dog = new Dog(farm, 40, 30);
    private final Sheep sheep = new Sheep(farm, 65, 30);

    @Test(dataProvider = "getDogDataFarm")
    public void checkMoveForDogToFarm(int x, int y, boolean expectedResult) {
        assertEquals(dog.move(x, y), expectedResult,
                "set the value to the exist coordinates or check the expected result");
    }

    @Test(dataProvider = "getDogDataBlock")
    public void checkMoveForDogToBlock(int x, int y, boolean expectedResult) {
        assertEquals(dog.move(x, y), expectedResult,
                "set the value to the exist coordinates or check the expected result");
    }

    @Test(dataProvider = "getSheepDataFarm")
    public void checkMoveForSheepToFarm(int x, int y, boolean expectedResult) {
        assertEquals(sheep.move(x, y), expectedResult,
                "set the value to the exist coordinates or check the expected result");
    }

    @Test(dataProvider = "getSheepDataBlock")
    public void checkMoveForSheepToBlock(int x, int y, boolean expectedResult) {
        assertEquals(sheep.move(x, y), expectedResult,
                "set the value to the exist coordinates or check the expected result");
    }
}
