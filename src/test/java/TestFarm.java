public class TestFarm {

    public static void main(String[] args) {
        Rectangle farmSquare  = new Rectangle(40,30,130,90);
        Rectangle blockSquare  = new Rectangle(80,50,110,70);

        Farm farm = new Farm(farmSquare, blockSquare);
        Dog dog = new Dog(farm,41,46);
        Sheep sheep = new Sheep(farm,130, 33);

        System.out.println(dog.move(48,70));
        System.out.println(sheep.move(-122,90));

    }
}
