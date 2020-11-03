public class AnimalTestData {
    private Point init;
    private Point move;

    public Point getInit() {
        return init;
    }

    public void setInit(Point init) {
        this.init = init;
    }

    public Point getMove() {
        return move;
    }

    public void setMove(Point move) {
        this.move = move;
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            setX(x);
            setY(y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
