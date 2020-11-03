public class Sheep implements Action {

    private int xLimit;
    private int yLimit;
    private Farm farm;

    public Sheep(Farm farm, int x, int y) {
        this.farm = farm;
        this.move(x, y);
    }

    private boolean checkOutOfFarm(int x, int y) {
        if (x < farm.getFarm().getMinX() || y < farm.getFarm().getMinY()
                || x > farm.getFarm().getMaxX() || y > farm.getFarm().getMaxY()) {
            return false;
        }
        return true;
    }

    public String getCoordinate() {
        return String.format("Sheep: x=%d, y=%d", this.xLimit, this.yLimit);
    }

    @Override
    public boolean move(int x, int y) {
        if (checkOutOfFarm(x, y)) {
            this.xLimit = x;
            this.yLimit = y;
            return true;
        }
        return false;
    }
}
