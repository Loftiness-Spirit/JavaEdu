package Practice6.Task10;

public class Processor implements id{
    private String name;
    private double GHz;
    private byte Core;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPower() {
        return GHz;
    }

    @Override
    public void setPower(double power) {
        GHz=power;
    }

    @Override
    public byte getObject() {
        return Core;
    }

    @Override
    public void setObject(byte object) {
        Core = object;
    }
}