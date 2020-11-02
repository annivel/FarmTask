public class Sheep implements Action {

    private int xLimit;
    private int yLimit;
    private Farm farm;

    public Sheep(Farm farm, int x, int y ) throws Exception {
        if (x > farm.getSquareX() || x < 0 || y > farm.getSquareY() || y < 0) {
            throw new Exception("Please, set sheep up to the valid points");
        }
        this.xLimit = x;
        this.yLimit = y;
        this.farm = farm;
    }

    @Override
    public boolean move(int x, int y) {
        if (x > farm.getSquareX() || x < 0 || y > farm.getSquareY() || y < 0) {
            return false;
        }
        this.xLimit = x;
        this.yLimit = y;
        return true;
    }

    public String getCoordinate() {
        return String.format("Sheep: x=%d, y=%d", this.xLimit, this.yLimit);
    }
}
