public class Bike extends Vehicle implements Rideable {

    private String type;

    public Bike(String type, double speed) {
        super(speed, 1); // A bike can only have one passenger
        this.type = type;
    }

    @Override
    public String getDescription() {
        //TODO
        return "";
    }

    @Override
    public double getWeight() {
        //TODO
        return 0.0;
    }

    @Override
    public void dismount() {
        this.setNumPassengers(0);
    }

    @Override
    public void mount() {
        this.setNumPassengers(1);
    }
}
