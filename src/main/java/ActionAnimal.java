public abstract class ActionAnimal {

    protected int x;
    protected int y;
    protected Farm farm;

    public ActionAnimal(Farm farm, int x, int y) {
        this.farm = farm;
        this.move(x, y);
    }

    public abstract boolean move(int x, int y);
}

