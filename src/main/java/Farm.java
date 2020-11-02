import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Farm {

    private int squareX;
    private int squareY;
    private List<String> blockPoints = new LinkedList<>();

    public List<String> getBlockPoints() {
        return blockPoints;
    }

    public int getSquareX() {
        return squareX;
    }

    public int getSquareY() {
        return squareY;
    }

    public Farm(int x, int y) {
        this.squareX = x;
        this.squareY= y;
    }


    public void initBlock(String... values) {
        blockPoints.addAll(Arrays.asList(values));
    }


}

