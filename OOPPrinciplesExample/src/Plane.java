public class Plane extends Vehicle {

    private String model;
    private String airline;
    private double fuel; // In litres

    public Plane(String model, String airline, double fuelLevel, double topSpeed, int passengers) {
        super(topSpeed, passengers);
        this.model = model;
        this.airline = airline;
        this.fuel = fuelLevel;
    }

    /*
     * Get a description of the planes model and what airline it is owned by
     * @return description, String: Description of the plane
     */
    @Override
    public String getDescription() {
        return String.format(
                "This plane is a model %s operating for %s",
                this.getModel(), this.getAirline()
        );
    }

    /*
     * Get the weight of the plane based on the number of passengers and amount of fuel
     * @return weight, double: Weight of the plane
     */
    @Override
    public double getWeight() {
        // Simple example assuming all planes weigh 200,000kg,
        // each passenger weighs 70kg and has 10kg luggage
        // and fuel weighs 0.7kg/l
        return 200000 + ((70 + 10) * this.getNumPassengers()) + (0.7 * this.getFuel());
    }

    public String getModel() {
        return this.model;
    }

    public String getAirline() {
        return this.airline;
    }

    public double getFuel() {
        return this.fuel;
    }
}
