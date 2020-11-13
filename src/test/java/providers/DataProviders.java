package providers;

import org.testng.annotations.DataProvider;

public class DataProviders {

    public static final int FARM_MIN_CORNER_X = 40;
    public static final  int FARM_MAX_CORNER_X = 130;
    public static final  int FARM_MIN_CORNER_Y = 30;
    public static final int FARM_MAX_CORNER_Y = 90;
    public static final   int BLOCK_MIN_CORNER_X = 80;
    public static final int BLOCK_MAX_CORNER_X = 110;
    public static final int BLOCK_MIN_CORNER_Y = 50;
    public static final  int BLOCK_MAX_CORNER_Y = 70;

    @DataProvider
    public static Object[][] getDogDataFarm() {
        return new Object[][]{
                {60, 40, true},
                {40, 30, true},
                {130, 90, true},
                {130, 30, true},
                {40, 90, true},
                {-15, 90, false},
                {40, -10, false},
                {-100, 100, false},
                {39, 29, false},
                {41, 31, true},
                {131, 91, false},
                {129, 89, true},
        };
    }

    @DataProvider
    public static Object[][] getSheepDataFarm() {
        return new Object[][]{
                {67, 82, true},
                {-10, 15, false},
                {40, 30, true},
                {130, 90, true},
                {130, 30, true},
                {40, 90, true},
                {131, 91, false},
                {129, 89, true},
                {39, 29, false},
                {41, 31, true},
                {-100, 100, false},
                {-100, 90, false},
                {40, -100, false}
        };
    }

    @DataProvider
    public static Object[][] getSheepDataBlock() {
        return new Object[][]{
                {100, 60, true},
                {81, 51, true},
                {79, 49, true},
                {80, 50, true},
                {111, 71, true},
                {109, 69, true},
                {110, 70, true},
                {110, 50, true},
                {80, 70, true},
                {-15, 90, false},
                {40, -10, false},
                {-80, -50, false},
                {50, 40, true},
                {90, 40, true},
                {50, 60, true},
                {90, 80, true},
                {120, 60, true}
        };
    }

    @DataProvider
    public static Object[][] getDogDataBlock() {
        return new Object[][]{
                {90, 60, false},
                {80, 50, false},
                {110, 70, false},
                {110, 50, false},
                {80, 70, false},
                {-15, 50, false},
                {80, -10, false},
                {-100, 100, false},
                {81, 71, true},
                {111, 71, true},
                {109, 69, false},
                {79, 49, true},
                {90, 40, true},
                {50, 60, true},
                {90, 80, true},
                {120, 60, true}
        };
    }
}