public class Rectangle {
    private int weightMinX;
    private int heightMinY;
    private int weightMaxX;
    private int heightMaxY;

    public int getWeightMinX() {
        return weightMinX;
    }

    public int getHeightMinY() {
        return heightMinY;
    }

    public int getWeightMaxX() {
        return weightMaxX;
    }

    public int getHeightMaxY() {
        return heightMaxY;
    }

    public Rectangle(int weightMinX, int heightMinY, int weightMaxX, int heightMaxY) {
        this.weightMinX = weightMinX;
        this.heightMinY = heightMinY;
        this.weightMaxX = weightMaxX;
        this.heightMaxY = heightMaxY;

    }

}
