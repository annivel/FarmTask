public class Sheep extends ActionAnimal {

    public Sheep(Farm farm, int x, int y) {
        super(farm, x, y);
    }

    @Override
    public boolean move(int x, int y) {
        if (farm.getFarmSquare().isPointInRectangle(x, y)) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
