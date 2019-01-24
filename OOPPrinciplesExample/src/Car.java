public class Car extends Vehicle {

    private String brand;

    public Car(String brand, double topSpeed, int passengers) {
        super(topSpeed, passengers);
        this.brand = brand;
    }

    public String getDescription() {
        return String.format(
                "This is a %s car, its top speed is %f and it can hold %d people",
                this.brand, this.speed, this.numPassengers
        );
    }

    public double getWeight() {
        // For this example just assuming all cars weigh 500kg and people weigh 70kg
        return 500 + (70 * this.numPassengers);
    }

    public String getBrand() {
        return brand;
    }
}
