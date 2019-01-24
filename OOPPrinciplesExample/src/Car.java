public class Car extends Vehicle {

    private String brand;

    public Car(String brand, double topSpeed, int passengers) {
        super(topSpeed, passengers);
        this.brand = brand;
    }

    /*
     * Get a description of the cars brand, top speed and capacity
     * @return description, String: Description of the car
     */
    @Override
    public String getDescription() {
        return String.format(
                "This is a %s car, its top speed is %.2fkm/h and it can hold %d people",
                this.getBrand(), this.getSpeed(), this.getNumPassengers()
        );
    }

    /*
     * Get the weight of the car based on the number of passengers
     * @return weight, double: Weight of the car
     */
    @Override
    public double getWeight() {
        // For this example just assuming all cars weigh 500kg and people weigh 70kg
        return 500 + (70 * this.getNumPassengers());
    }

    public String getBrand() {
        return this.brand;
    }
}
