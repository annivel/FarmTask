public class Dog implements Action {
    private int xLimit;
    private int yLimit;
    private Farm farm;

    public Dog(Farm farm, int x, int y) {
        this.farm = farm;
        this.move(x, y);
    }

    private boolean checkOutOfFarm(int x, int y) {
        if (x < farm.getFarm().getWeightMinX() && y < farm.getFarm().getHeightMinY()
                || x > farm.getFarm().getWeightMaxX() && y > farm.getFarm().getHeightMaxY()) {
            return false;
        }
        return true;
    }

    private boolean checkBlock(int x, int y) {
        if (x >= farm.getBlock().getWeightMinX() && y >= farm.getBlock().getHeightMinY()
                || x <= farm.getBlock().getWeightMaxX() && y <= farm.getBlock().getHeightMaxY()) {
            return false;
        }
        return true;
    }

    public String getCoordinate() {
        return String.format("Dog: x=%d, y=%d", this.xLimit, this.yLimit);
    }

    @Override
    public boolean move(int x, int y) {
        if (checkOutOfFarm(x, y) && checkBlock(x, y)) {
            this.xLimit = x;
            this.yLimit = y;
        }
        return false;
    }
}
