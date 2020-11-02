public class Dog implements Action {
    private int xLimit;
    private int yLimit;
    private Farm farm;

    public Dog(Farm farm, int x, int y) throws Exception {
        if (x > farm.getSquareX() || x < 0 || y > farm.getSquareY() || y < 0
                || farm.getBlockPoints().contains(String.format("%d-%d", x, y))) {
            throw new Exception("Please, set dog up to the valid points");
        }
        this.xLimit = x;
        this.yLimit = y;
        this.farm = farm;
    }

    @Override
    public boolean move(int x, int y) {
        //check out of farm
        if (x > farm.getSquareX() || x < 0 || y > farm.getSquareY() || y < 0) {
            return false;
        }
        // check block points
        if (!farm.getBlockPoints().contains(String.format("%d-%d", x, y))) {
            this.xLimit = x;
            this.yLimit = y;
            return true;
        }
        return false;
    }

    public String getCoordinate() {
        return String.format("Dog: x=%d, y=%d", this.xLimit, this.yLimit);
    }

}
