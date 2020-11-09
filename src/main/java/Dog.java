public class Dog implements Action {
    
    private int xLimit;
    private int yLimit;
    private Farm farm;

    public Dog(Farm farm, int x, int y) {
        this.farm = farm;
        this.move(x, y);
    }

    private boolean isCheckOutOfFarm(int x, int y) {
        if (x < farm.getFarm().getMinX() || y < farm.getFarm().getMinY()
                || x > farm.getFarm().getMaxX() || y > farm.getFarm().getMaxY()) {
            return false;
        }
        return true;
    }

    private boolean isCheckBlock(int x, int y) {
        if (x >= farm.getBlock().getMinX() && y >= farm.getBlock().getMinY()
            && x <= farm.getBlock().getMaxX() && y <= farm.getBlock().getMaxY()) {
            return false;
        }
        return true;
    }

    public String getCoordinate() {
        return String.format("Dog: x=%d, y=%d", this.xLimit, this.yLimit);
    }

    @Override
    public boolean move(int x, int y) {
        if (isCheckOutOfFarm(x, y) && isCheckBlock(x, y)) {
            this.xLimit = x;
            this.yLimit = y;
            return true;
        }
        return false;
    }
}
