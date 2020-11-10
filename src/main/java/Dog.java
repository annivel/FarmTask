public class Dog extends ActionAnimal {

    public Dog(Farm farm, int x, int y) {
        super(farm,x,y);
    }

    @Override
    public boolean move(int x, int y) {
        if (super.farm.getFarmSquare().isPointInRectangle(x,y)
                && !farm.getBlockSquare().isPointInRectangle(x,y)) {
            super.x = x;
            super.y = y;
            return true;
        }
        return false;
    }
}
