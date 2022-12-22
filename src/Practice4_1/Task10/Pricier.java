package Practice4_1.Task10;

public class Pricier {
    public static void main(String[] args) {
        System.out.println("Car");
        Car car = new Car(80,300,5);
        car.searchTime();
        car.searchPrice();
        car.searchWeightPrice();
        System.out.println("Plain");
        Plane plane=new Plane(800,1600, 251);
        plane.searchTime();
        plane.searchPrice();
        plane.searchWeightPrice();
        System.out.println("Train");
        Train train = new Train(150, 1500,810);
        train.searchTime();
        train.searchPrice();
        train.searchWeightPrice();
        System.out.println("Ship");
        Ship ship = new Ship(10, 300,1500);
        ship.searchTime();
        ship.searchPrice();
        ship.searchWeightPrice();
    }
}
