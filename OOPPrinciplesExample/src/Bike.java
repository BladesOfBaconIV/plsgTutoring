public class Bike extends Vehicle implements Rideable {

    private String type;

    public Bike(String type, double speed) {
        super(speed, 1); // A bike can only have one passenger
        this.type = type;
    }

    /*
     * Gets a string with the type of bike and if it is being rode
     * @return description, String: Description of the bike
     */
    @Override
    public String getDescription() {
        return String.format(
                "This is a %s bike. It %s currently being rode",
                this.getType(), (this.getNumPassengers() > 0) ? "is" : "isn't"
        );
    }

    /*
     * Gets the weight of the bike based on the type of bike,
     * excluding passenger
     * @return Weight, double: The weight of the bike in kg
     */
    @Override
    public double getWeight() {
        switch (this.getType()) {
            case "Mountain": return 20;
            case "Racing": return 10;
            default: return 25;
        }
    }

    /*
     * Dismount the bike, reducing passengers to 0
     */
    @Override
    public void dismount() {
        this.setNumPassengers(0);
    }

    /*
     * Mount the bike, increasing the number of passengers to 1
     */
    @Override
    public void mount() {
        this.setNumPassengers(1);
    }

    public String getType() {
        return this.type;
    }
}
