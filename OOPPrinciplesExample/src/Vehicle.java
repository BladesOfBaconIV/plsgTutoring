/*
 * Vehicle is abstract as we never want a generic vehicle to be instantiated
 * All over vehicle will however inherit some properties from this class
 * This is an example of abstraction, as it is making a solution to a more general problem
 * before refining it to a specific one
 */
public abstract class Vehicle {
    // Instance variables that will be shared by all subclasses
    // speed of the vehicle in Km/h
    protected double speed;

    // number of passengers in the vehicle
    protected int numPassengers;

    // Despite being an abstract class which can't be instantiated
    // we still want it to have a constructor for subclasses to use
    public Vehicle(double speed, int passengers) {
        this.speed = speed;
        this.numPassengers = passengers;
    }

    /*
     * Method to convert miles to km
     * It is static as we don't need a vehicle object to do this conversion
     * @param miles, double: The distance in miles to be converted
     * @return km, double: The distance in km
     */
    public static double convertMilesToKm(double miles) {
        return miles * 0.62;
    }

    /*
     * Method to convert km to miles
     * It is static as we don't need a vehicle object to do this conversion
     * @param km, double: The distance in km to be converted
     * @return miles, double: The distance in miles
     */
    public static double convertKmToMiles(double km) {
        return km * 1.61;
    }

    // Abstract methods, which will be different for each vehicle
    // Get a description of the vehicle
    abstract String getDescription() ;
    // Get the weight of a vehicle in kg including number of passengers/luggage/fuel/etc.
    abstract double getWeight() ;

    public double getSpeed() {
        return this.speed;
    }

    public int getNumPassengers() {
        return this.numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

}
