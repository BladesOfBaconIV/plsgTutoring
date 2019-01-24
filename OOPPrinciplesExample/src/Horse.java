public class Horse implements Rideable {

    private boolean hitched = true;
    private String colour;
    private String name;
    private int height;
    private double speed;

    public Horse(String colour, String name, int numHandsTall) {
        this.colour = colour;
        this.name = name;
        this.height = numHandsTall;
        this.speed = numHandsTall * 2.5;
    }

    public double getHeightFeet() {
        return (this.getHeight() * 4) / 12.0;
    }

    @Override
    public void dismount() {
        this.setHitched(true);
    }

    @Override
    public void mount() {
        this.setHitched(false);
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s\nColour: %s\nHeight: %d Hands (%.2f feet)\nTop Speed: %.2fkm/h\nIs Hitched: %b",
                this.getName(), this.getColour(), this.getHeight(), this.getHeightFeet(),
                this.getSpeed(), this.isHitched()
        );
    }

    public boolean isHitched() {
        return this.hitched;
    }

    public void setHitched(boolean hitched) {
        this.hitched = hitched;
    }

    public String getColour() {
        return this.colour;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public double getSpeed() {
        return this.speed;
    }
}
