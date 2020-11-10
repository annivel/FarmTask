public class Rectangle {

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Rectangle(int minX, int minY, int maxX, int maxY) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;

    }
    public boolean isPointInRectangle(int x, int y) {
        if (x >= minX && y >= minY
                && x <= maxX && y <=maxY) {
            return true;
        }
        return false;
    }
}
