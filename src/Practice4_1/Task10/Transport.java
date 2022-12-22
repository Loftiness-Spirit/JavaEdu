package Practice4_1.Task10;

public abstract class Transport {
    protected double speed;
    protected double sits;
    protected double range;
    abstract void searchTime();
    abstract void searchPrice();
    abstract void searchWeightPrice();

    public void setSits(int sits) {
        this.sits = sits;
    }

    public double getSits() {
        return sits;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
