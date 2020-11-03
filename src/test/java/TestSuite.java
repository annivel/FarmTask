import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestSuite {

    @DataProvider
    public Object[][] getData() {
        FarmTestData farm = new FarmTestData() {{
            setHeight(4);
            setWidth(6);
            setBlockValues(new String[]{"1-3", "1-4", "2-3", "2-4"});
        }};
        AnimalTestData dog = new AnimalTestData() {{
            setInit(new Point(0, 0));
            setMove(new Point(1, 2));
        }};
        AnimalTestData sheep = new AnimalTestData() {{
            setInit(new Point(0, 0));
            setMove(new Point(1, 3));
        }};
        return new Object[][] {{farm, dog, sheep}};
    }

    @Test(dataProvider = "getData")
    public void test(FarmTestData farmTestData, AnimalTestData dog, AnimalTestData sheep) {
        System.out.println();

    }
}
