public class Dog extends ActionAnimal {

    public Dog(Farm farm, int x, int y) {
        super(farm, x, y);
    }

    @Override
    public boolean move(int x, int y) {
        Rectangle rectangle = farm.getBlockSquare();

        if (farm.getFarmSquare().isPointInRectangle(x, y)
                && !farm.getBlockSquare().isPointInRectangle(x, y)) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }
}
