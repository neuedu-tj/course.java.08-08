package oo.polymorphic;

public class TestCase {

    public static void main(String[] args) {

        Auto car = new Car();

        Auto bike = new Bike();

        Park park = new Park();

        park.parking(bike);

        park.parking(car);


    }

}
