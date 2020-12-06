public class Farm {

    private Rectangle farmSquare;
    private Rectangle blockSquare;

    public Farm(Rectangle farm, Rectangle block) {
        this.farmSquare = farm;
        this.blockSquare = block;
    }

    public Rectangle getFarmSquare() {
        return farmSquare;
    }

    public Rectangle getBlockSquare() {
        return blockSquare;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farmSquare=" + farmSquare +
                ", blockSquare=" + blockSquare +
                '}';
    }
}

