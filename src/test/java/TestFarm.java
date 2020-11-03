public class TestFarm {

    public static void main(String[] args) {
        Rectangle farmSquare  = new Rectangle(40,30,130,90);
        Rectangle blockSquare  = new Rectangle(80,50,110,70);

        Farm farm = new Farm(farmSquare, blockSquare);
        Dog dog = new Dog(farm ,40,45);
        Sheep sheep = new Sheep(farm,130, 33);

        System.out.println(dog.getCoordinate());
        System.out.println(sheep.getCoordinate());
        System.out.println(dog.move(70,55));
        System.out.println(sheep.move(40,30));
        System.out.println(dog.getCoordinate());
        System.out.println(sheep.getCoordinate());


    }
}
