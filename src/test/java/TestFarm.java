public class TestFarm {

    public static void main(String[] args) throws Exception {

        Farm farm = new Farm(4, 6);
        farm.initBlock("1-3", "1-4", "2-3", "2-4");

        Dog dog = new Dog(farm ,0, 0);
        Sheep sheep = new Sheep(farm,0, 0);

        System.out.println(dog.getCoordinate());
        System.out.println(sheep.getCoordinate());
        System.out.println(dog.move(1,2));
        System.out.println(sheep.move(1,4));
        System.out.println(dog.getCoordinate());
        System.out.println(sheep.getCoordinate());


    }
}
