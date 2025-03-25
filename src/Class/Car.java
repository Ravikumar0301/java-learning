package Class;

//Object - car
public class Car {

    /* attributes - (weight, color) */
    int weight = 1500;
    String color = "White";

    /* main method */
    public static void main(String[] args) {
        drive(); //this is static method so we can call without create the object

        Car car = new Car(); //created object of Car
        car.brake(); //this is public method so we call this after creating object
        //brake(); this will give the compile error

        /* accessing attributes */
        System.out.println(car.weight);
        System.out.println(car.color);
    }

    /* methods - (drive, brake) */
    static void drive() {
        System.out.println("Car drive");
    }

    public void brake() {
        System.out.println("Car brake");
    }

}